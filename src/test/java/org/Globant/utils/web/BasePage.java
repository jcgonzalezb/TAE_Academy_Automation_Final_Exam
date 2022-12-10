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
     *
     * @param driver The driver that controls the behaviour
     *               of a web browser.
     */
    public BasePage(WebDriver driver) {
        super(driver);
    }
}
