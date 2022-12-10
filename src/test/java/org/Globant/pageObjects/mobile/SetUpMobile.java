package org.Globant.pageObjects.mobile;

import static org.Globant.steps.mobile.MobileHooks.getDriver;


/**
 * Represents the configuration necessary to start the application.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class SetUpMobile {

    protected static TutorialScreen tutorialScreen;

    /**
     * Creates the 'Tutorial' Screen.
     */
    public static void setUpStartApp() {
        tutorialScreen = new TutorialScreen(getDriver());
    }

    /**
     * Takes the user to the 'Dashboard' Screen from the 'Tutorial' Screen.
     * @return The 'Dashboard' Screen is opened.
     */
    public static DashBoardScreen loadDashBoardScreen() {
        tutorialScreen.startPermissionsProcess();
        return tutorialScreen.shareLocationPermissions();
    }
}
