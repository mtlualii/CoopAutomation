package de.coop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import de.coop.utilities.Driver;

/* BasePage it is not a page actually. We do not want to instantiate it, that's why I made it abstract.
   It contains the common locators and functionalities of different pages in our web application. It is like a base.

   For example I create a method to reach top side modules.  (Standorte-Anmelden-Warenkorb)
   They are common. In other words, from almost everywhere in application we can click and reach these modules.

   The other classes in PAGES extends BasePage if it is necessary.

 */

public abstract class BasePage {

    public BasePage() {PageFactory.initElements(Driver.get(), this);}

    // This method allows us to pick one of the top side modules (Standorte-Anmelden-Warenkorb) just changing the input from Feature file

    public void selectTopSideModules(String moduleName) {

        Driver.get().findElement(By.xpath("//a[@data-testauto='"+moduleName+"']")).click();

    }






}
