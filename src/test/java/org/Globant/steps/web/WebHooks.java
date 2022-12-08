package org.Globant.steps.web;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.Globant.configuration.web.UniqueWebDriver;
import org.Globant.reporting.Reporter;
import org.openqa.selenium.WebDriver;

import static java.lang.String.format;

public class WebHooks {

    private static UniqueWebDriver driver;
    private static final String URL ="https://www.espnqa.com/?src=com&_adblock=true&espn=cloud";
    private static final String BROWSER = "chrome";

    @Before
    public static void startBrowser() {
        driver = new UniqueWebDriver(BROWSER);
        Reporter.info("Deleting all the cookies");
        driver.getDriver().manage().deleteAllCookies();
        Reporter.info(format("Navigating to %s", URL));
        Reporter.info("Navigating to the ESPN Landing Page");
        driver.getDriver().get(URL);
        driver.getDriver().manage().window().maximize();
    }

    @After
    public void closeBrowser() { driver.getDriver().quit(); }

    public static WebDriver getDriver() {
        return driver.getDriver();
    }

}
