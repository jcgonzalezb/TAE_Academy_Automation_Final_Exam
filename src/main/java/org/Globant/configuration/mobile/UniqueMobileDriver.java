package org.Globant.configuration.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UniqueMobileDriver {
    private final AndroidDriver<AndroidElement> driver;

    public UniqueMobileDriver(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
    }

    /**
     * return the driver.
     *
     * @return driver
     * @author Arley.Bolivar
     */
    public AndroidDriver<AndroidElement> getDriver() {
        return this.driver;
    }
}
