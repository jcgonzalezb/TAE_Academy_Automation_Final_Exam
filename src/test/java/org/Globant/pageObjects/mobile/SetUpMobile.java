package org.Globant.pageObjects.mobile;

import static org.Globant.steps.mobile.MobileHooks.getDriver;

/**
 * Base class for Test classes.
 *
 * @author helberth.bolivar
 */
public class SetUpMobile {

    protected static TutorialScreen tutorialScreen;


    public static void setUpStartApp() {
        tutorialScreen = new TutorialScreen(getDriver());
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
