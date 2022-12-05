package org.Globant.pageObjects.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.Globant.utils.configuration.ConfigCapabilities;
import org.Globant.configuration.mobile.UniqueMobileDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Base class for Test classes.
 *
 * @author helberth.bolivar
 */
public class SetUp {

    protected static TutorialScreen tutorialScreen;
    public static UniqueMobileDriver driver;


    public static void setUpStartApp() {
        tutorialScreen = new TutorialScreen(getDriver());
    }

    /**
     * SetUp before to run suite of test.
     *
     * @author Arley.Bolivar
     */

    public static void environmentSetUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ConfigCapabilities.deviceSetUp(capabilities);
        ConfigCapabilities.applicationSetUp(capabilities);
        try {
            driver = new UniqueMobileDriver(new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));
        } catch (MalformedURLException exception) {
            exception.printStackTrace();
        }
        setUpStartApp();
    }

    /**
     * Close the application after completing the test.
     *
     * @author Arley.Bolivar
     */

    public static void mobileApplicationEnd() {
        driver.getDriver().quit();
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

    /**
     * return SignUpOrLogInScreen after close the alerts.
     *
     * @return SignUpOrLogInScreen
     * @author Arley.Bolivar
     */
    public static DashBoardScreen loadDashBoardScreen() {
        tutorialScreen.startPermissionsProcess();
        return tutorialScreen.shareLocationPermissions();
    }
}
