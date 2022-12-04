package org.Globant.utils.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.Globant.configuration.mobile.MobileOperations;

public class BaseScreen extends MobileOperations {

    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public BaseScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }
}
