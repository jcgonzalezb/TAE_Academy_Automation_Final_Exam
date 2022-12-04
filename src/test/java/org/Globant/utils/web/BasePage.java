package org.Globant.utils.web;

import org.Globant.configuration.web.WebOperations;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebOperations {
    public BasePage(WebDriver driver) {
        super(driver);
    }
}
