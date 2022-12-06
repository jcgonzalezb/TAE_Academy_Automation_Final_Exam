package org.Globant.pageObjects.web;

import org.Globant.configuration.web.UniqueWebDriver;
import org.Globant.reporting.Reporter;

import static java.lang.String.format;


public class SetUpWeb {

    private static UniqueWebDriver driver;

    protected static HomePage home;

    private static final String URL ="https://www.espnqa.com/?src=com&_adblock=true&espn=cloud";
    private static final String BROWSER = "chrome";

    public static void setUpWeb() {
        driver = new UniqueWebDriver(BROWSER);
        Reporter.info("Deleting all the cookies");
        driver.getDriver().manage().deleteAllCookies();
        Reporter.info(format("Navigating to %s", URL));
        Reporter.info("Navigating the ESPN Landing Page");
        driver.getDriver().get(URL);
        driver.getDriver().manage().window().maximize();
        home = new HomePage(driver.getDriver());
        //home.closeBanner();
    }
}
