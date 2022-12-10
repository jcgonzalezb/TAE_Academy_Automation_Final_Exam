package org.Globant.utils.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.Globant.configuration.mobile.MobileOperations;


/**
 * Represents the Base screen.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class BaseScreen extends MobileOperations {

    /**
     * Constructor method for standard screens object.
     *
     * @param driver : The driver that controls the behaviour
     * of an android application.
     */
    public BaseScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }
}
