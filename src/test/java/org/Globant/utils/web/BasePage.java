package org.Globant.utils.web;

import org.Globant.configuration.web.WebOperations;
import org.openqa.selenium.WebDriver;

/**
 * Represents the Base page.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class BasePage extends WebOperations {
    /**
     * Constructor method for the BasePage class.
     * @param driver The driver that controls the behaviour
     * of a web browser.
     */
    public BasePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Refreshes the current page.
     */
    public void reloadPage() { super.getDriver().navigate().refresh(); }

    /**
     * Returns the user from other page on the ESPN site to the home page.
     * @result The user is return to the ESPN home page.
     */
    public void switchToMain() { super.getDriver().switchTo().defaultContent(); }
}
