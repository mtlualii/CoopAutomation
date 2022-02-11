package de.coop.pages;

import com.github.javafaker.Faker;
import de.coop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


// The scenario is about to create a new account, so it uses these locators to reach WebElements
// Some of them are methods which are created to make the codes more efficient, more reusable

public class AnmeldenPage extends BasePage {           // inheritance relationship

    public AnmeldenPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//a[@data-testauto='register']")
    public WebElement neuRegister;

    @FindBy(id = "titleCode")
    public WebElement title;

    public void selectAnrede(String anrede) {

        Select select = new Select(title);
        select.selectByVisibleText(anrede);
    }

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement surname;

    // Instead of giving a first and surname in feature file, I create fake names by using this method

    public void entersVorundNachname() {

        Faker faker = new Faker();

        firstName.sendKeys(faker.name().firstName());
        surname.sendKeys(faker.name().lastName());

    }

    @FindBy(id = "birthday")
    public WebElement birthday;

    @FindBy(id = "birthmonth")
    public WebElement birthMonth;

    @FindBy(id = "birthyear")
    public WebElement birthYear;

    // Also here creating fake inputs for birth informations.

    public void entersGeburtsdatum() {

        Faker faker = new Faker();

        int fakeBirthMonth = faker.number().numberBetween(1,12);
        birthMonth.sendKeys(String.valueOf(fakeBirthMonth));

        birthday.sendKeys(String.valueOf(faker.number().numberBetween(1,30)));
        birthYear.sendKeys(String.valueOf(faker.number().numberBetween(1922,2004))); // min 18 , max 100 years old
    }

    @FindBy(id = "email")
    public WebElement eMail;

    @FindBy(id = "pwd")
    public WebElement password;

    @FindBy(id = "country")
    public WebElement country;

    public void selectLand(String Land) {

        Select select = new Select(country);
        select.selectByVisibleText(Land);

    }

    @FindBy(xpath = "//input[@data-testauto='registrationpostcode']")
    public WebElement postcode;

    @FindBy(xpath = "//input[@placeholder='Strasse']")
    public WebElement street;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "houseNo")
    public WebElement houseNo;

    @FindBy(id = "language")
    public WebElement language;

    public void selectKorrespondenzsprache(String Sprache) {

        Select select = new Select(language);
        select.selectByVisibleText(Sprache);

    }

    @FindBy(id = "phonePrefix")
    public WebElement phonePrefix;

    public void phonePrefixSelect(String prefix) {

        Select select = new Select(phonePrefix);
        select.selectByValue(prefix);

    }

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(xpath = "//label[@data-validation-target-for='agb-checkbox']")
    public WebElement dataprivacyAccept;

    @FindBy(xpath = "//span[text()='Registrieren']")
    public WebElement registerButton;

    @FindBy(xpath = "//span[@class='alert-content__text']")
    public WebElement alertMessage;

}
