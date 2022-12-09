package org.Globant.configuration.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


/**
 * Represents the Mobile driver used to control the behaviour of an Android application.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class UniqueMobileDriver {

    private final AndroidDriver<AndroidElement> driver;

    /**
     * Constructor method for the UniqueMobileDriver class.
     *
     * @param driver : The driver that controls the behaviour
     * of an android application.
     */
    public UniqueMobileDriver(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
    }

    /**
     * Returns the driver.
     * @return An AndroidDriver element representing the driver for an Android application.
     */
    public AndroidDriver<AndroidElement> getDriver() {
        return this.driver;
    }
}
