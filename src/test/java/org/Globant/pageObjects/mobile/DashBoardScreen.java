package org.Globant.pageObjects.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Globant.reporting.Reporter;
import org.Globant.utils.mobile.BaseScreen;


/**
 * Represents the 'Dashboard' Screen.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class DashBoardScreen extends BaseScreen {

    /**
     * The 'Dismiss preference update' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button2\")")
    private AndroidElement dismissPreferenceUpdateButton;

    /**
     * The 'Close Takeover' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Close Takeover\")")
    private AndroidElement dismissWelcome;

    /**
     * The 'Map' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Map, Tab, 2of5\")")
    private AndroidElement mapButton;

    /**
     * The 'More options' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "descriptionContains(\"More Options, Tab, 5of5\")")
    private AndroidElement moreOptionsButton;

    /**
     * The 'Buy Tickets Reserve Dining' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "descriptionContains(\"Buy tickets, Reserve Dining, Tab, 3of5\")")
    private AndroidElement buyTicketsReserveDiningButton;

    /**
     * Constructor method for the DashBoardScreen class.
     *
     * @param driver : The driver that controls the behaviour of an android application.
     */
    public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }


    /**
     * Dismisses the 'welcome' and the 'Preference Update' messages.
     */
    public void dismissMessages() {
        if (this.isElementAvailable(dismissWelcome, 25L)) {
            click(dismissWelcome);
        }
        if (this.isElementAvailable(dismissPreferenceUpdateButton, 10L)) {
            click(dismissPreferenceUpdateButton);
        }
    }

    /**
     * Takes the user to the 'Map' Screen from the 'DashBoard' Screen.
     *
     * @return The 'Map' Screen is opened.
     */
    public MapScreen goToMapScreen() {
        dismissMessages();
        click(mapButton);
        Reporter.info("The Map button is displayed.");
        return new MapScreen(getDriver());
    }

    /**
     * Checks if the 'Show More Options' button is displayed.
     *
     * @return True if the 'Show More Options' button is displayed, otherwise the return is false.
     */
    public boolean moreOptionsButtonIsDisplayed() {
        return isElementAvailable(moreOptionsButton);
    }

    /**
     * Takes the user to the 'More Options' screen from the 'DashBoard' Screen.
     *
     * @return The 'More Options' Screen is opened.
     */
    public MoreOptionsScreen goToMoreOptionsScreen() {
        dismissMessages();
        click(moreOptionsButton);
        return new MoreOptionsScreen(getDriver());
    }

    /**
     * Checks if the 'Buy Tickets Reserve Dining' button is displayed.
     *
     * @return True if the 'Buy Tickets Reserve Dining' button is displayed,
     * otherwise the return is false.
     */
    public boolean buyTicketsReserveDiningButtonIsDisplayed() {
        return isElementAvailable(buyTicketsReserveDiningButton);
    }

    /**
     * Takes the user to the 'Buy Tickets Reserve Dining' screen from
     * the 'DashBoard' Screen.
     *
     * @return The 'Buy Tickets Reserve Dining' Screen is opened.
     */
    public BuyTicketsReserveDiningScreen goToBuyTicketsReserveDiningScreen() {
        dismissMessages();
        click(buyTicketsReserveDiningButton);
        return new BuyTicketsReserveDiningScreen(getDriver());
    }
}
