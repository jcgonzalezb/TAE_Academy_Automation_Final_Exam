package org.Globant.steps.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.Globant.configuration.mobile.UniqueMobileDriver;
import org.Globant.pageObjects.mobile.SetUpMobile;
import org.Globant.reporting.Reporter;
import org.Globant.utils.configuration.ConfigCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileHooks {

    public static UniqueMobileDriver driver;

    /**
     * SetUp before to run suite of test.
     *
     * @author Arley.Bolivar
     */
    @Before
    public void startApp(){
        Reporter.info("Navigating to the Tutorial Screen.");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ConfigCapabilities.deviceSetUp(capabilities);
        ConfigCapabilities.applicationSetUp(capabilities);
        try {
            driver = new UniqueMobileDriver(new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));
        } catch (MalformedURLException exception) {
            exception.printStackTrace();
        }
        SetUpMobile.setUpStartApp();
    }

    /**
     * Close the application after completing the test.
     *
     * @author Arley.Bolivar
     */
    @After
    public void closeApp() {
        driver.getDriver().quit();
        Reporter.info("Application closed.");
    }

    /**
     * return the driver.
     *
     * @return driver
     * @author Arley.Bolivar
     */
    public static AndroidDriver<AndroidElement> getDriver() {
        return driver.getDriver();
    }

}
