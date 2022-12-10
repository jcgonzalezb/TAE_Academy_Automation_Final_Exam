package org.Globant.configuration.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Represents the Web driver used to control the behaviour of a web browser.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class UniqueWebDriver {

    private WebDriver driver;

    /**
     * Constructor method for the UniqueWebDriver class.
     *
     * @param browser : The browser used for testing procedures.
     * @result The browser selected will be used for testing procedures.
     */
    public UniqueWebDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
    }

    /**
     * Returns the driver.
     *
     * @return An WebDriver element representing the driver for web browser.
     */
    public WebDriver getDriver() {
        return this.driver;
    }
}
