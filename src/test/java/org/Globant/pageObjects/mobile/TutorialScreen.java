package org.Globant.pageObjects.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Globant.utils.mobile.BaseScreen;


/**
 * Represents the 'Tutorial' Screen.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class TutorialScreen extends BaseScreen {

    /**
     * The 'Get Started' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Get Started\")")
    private AndroidElement getStartedButton;

    /**
     * The 'Share Location' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Share Location\")")
    private AndroidElement shareLocationButton;

    /**
     * The 'Allow Location' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*android:id/button1\")")
    private AndroidElement allowLocationButton;

    /**
     * The 'Allow' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*only_button\")")
    private AndroidElement allowButton;

    /**
     * Constructor method for the TutorialScreen class.
     *
     * @param driver : The driver that controls the behaviour of an android application.
     */
    public TutorialScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * Clicks on the 'Get Started' button.
     */
    public void startPermissionsProcess() {
        click(getStartedButton);
    }

    /**
     * Takes the user to the 'Dashboard' Screen from the 'Tutorial' Screen.
     *
     * @return The 'Dashboard' Screen is opened.
     */
    public DashBoardScreen shareLocationPermissions() {
        click(shareLocationButton);
        click(allowLocationButton);
        click(allowButton);
        return new DashBoardScreen(getDriver());
    }
}
