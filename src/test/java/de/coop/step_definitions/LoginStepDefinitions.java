package de.coop.step_definitions;

import de.coop.pages.AnmeldenPage;
import de.coop.utilities.*;
import io.cucumber.java.en.*;
import org.junit.Assert;


// Codes are here. This class is connected with our FEATURE file and our PAGES through CUKESRUNNER.

public class LoginStepDefinitions {

    AnmeldenPage anmeldenPage = new AnmeldenPage();  // creating an object to use locators and methods in AnmeldenPage

    @Given("user is on dashboard page")
    public void user_is_on_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));      // Getting url from configuration properties by using configurationReader
        Driver.get().manage().window().maximize();             // maximizing the browser

    }

    @And("user clicks {string}")
    public void user_clicks(String moduleName) {

       anmeldenPage.selectTopSideModules(moduleName);           // our moduleName (here "login") is coming from FEATURE file.

    }

    @And("user clicks neu registrieren")
    public void user_clicks_neu_registrieren() {

        BrowserUtils.waitForClickablility(anmeldenPage.neuRegister, 5);   // Used my own method to wait explicitly
        anmeldenPage.neuRegister.click();

    }

    @And("user picks {string} dann enters Vorname Nachname")
    public void userPicksDannEntersVornameNachname(String anrede) {

        BrowserUtils.waitForClickablility(anmeldenPage.title, 5);
        anmeldenPage.title.click();
        anmeldenPage.selectAnrede(anrede);  // Herr, Frau oder Firma              // Here also die Anrede (here "Frau") is coming from Feature File

        anmeldenPage.entersVorundNachname();                                     // entering fake names by using a method from AnmeldenPage

    }

    @And("user enters Geburtsdatum")
    public void userEntersGeburtsdatum() {

        anmeldenPage.entersGeburtsdatum();                                       // entering fake birth information by using a method from AnmeldenPage

    }

    @And("user enters Anmeldedaten {string} und {string}")
    public void userEntersAnmeldedatenUnd(String email, String password) {

        anmeldenPage.eMail.sendKeys(email);                                      // email address is coming from feature file also. it is a temporary address
        anmeldenPage.password.sendKeys(password);


    }


    @And("user enters Kontaktdaten Land {string} Postleitzahl {string} City {string} Strasse {string} Hausnummer {string} Korrespondenzsprache {string} Mobil-Telefon {string} {string}")
    public void userEntersKontaktdatenLandPostleitzahlCityStrasseHausnummerKorrespondenzspracheMobilTelefon(String land, String postleitzahl, String stadt, String strasse, String hausnummer, String ks, String phoneCode, String tel) {

        // All information here also are coming from feature file, from our scenario in other words.
        // A list could be created here and information could be put inside it. I just would like to show clearly, but it looked a little messy this way.

        anmeldenPage.selectLand(land);
        BrowserUtils.waitForClickablility(anmeldenPage.postcode, 5);
        anmeldenPage.postcode.sendKeys(postleitzahl);
        anmeldenPage.city.sendKeys(stadt);
        anmeldenPage.street.sendKeys(strasse);
        anmeldenPage.houseNo.sendKeys(hausnummer);
        anmeldenPage.selectKorrespondenzsprache(ks);
        anmeldenPage.phonePrefixSelect(phoneCode);
        anmeldenPage.phoneNumber.sendKeys(tel);
    }

    @And("user accepts Datenschutz")
    public void userAcceptsDatenschutz() {

        anmeldenPage.dataprivacyAccept.click();

    }

    @And("user clicks register;")
    public void userClicksRegister() {

        anmeldenPage.registerButton.click();
        BrowserUtils.waitForClickablility(anmeldenPage.alertMessage, 5);  // waiting explicitly to see alertMessage
    }


    @And("user should see the alert message")
    public void userShouldSeeTheAlertMessage() {

        String actualAlertMessage = anmeldenPage.alertMessage.getText();
        String expectedAlertMessage = "Recaptcha war nicht gültig";

        Assert.assertEquals(expectedAlertMessage,actualAlertMessage);

        /*

        We are testing. Something must be checked.
        I could not automate the captcha, so I decided to check the alertMessage. "Recaptcha war nicht gültig"

        */


    }
}

