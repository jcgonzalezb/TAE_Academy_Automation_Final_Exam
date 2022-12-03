package org.Globant.pageObjects.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Globant.utils.mobile.BaseScreen;


/**
 * DashBoard screen.
 *
 * @author Hans.Marquez
 */
public class DashBoardScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver : AndroidDriver
     * @author Hans.Marquez
     */
    public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button2\")")
    private AndroidElement dismissPreferenceUpdateButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Close Takeover\")")
    private AndroidElement dismissWelcome;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Map, Tab, 2of5\")")
    private AndroidElement mapButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"More Options, Tab, 5of5\")")
    private AndroidElement moreOptionsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Buy tickets, Reserve Dining, Tab, 3of5\")")
    private AndroidElement buyTicketsReserveDiningButton;

    /**
     * @author Hans.Marquez
     * Navigate to Map Screen from DashBoard Screen.
     */
    public MapScreen goToMapScreen() {
        if (this.isElementAvailable(dismissWelcome, 25)){
            click(dismissWelcome);
        }
        if (this.isElementAvailable(dismissPreferenceUpdateButton, 25)){
            click(dismissPreferenceUpdateButton);
        }
        click(mapButton);
        return new MapScreen(driver);
    }

    /**
     * @author Juan.Gonzalez
     * return true if Show More Options Button element is displayed on screen, otherwise false.
     */
    public boolean moreOptionsButtonIsDisplayed() {
        return isElementAvailable(moreOptionsButton); }

    /**
     * @author Juan.Gonzalez
     * Navigate to More Options Screen from DashBoard Screen.
     */
    public MoreOptionsScreen goToMoreOptionsScreen() {
        if (this.isElementAvailable(dismissWelcome, 25)){
            click(dismissWelcome);
        }
        if (this.isElementAvailable(dismissPreferenceUpdateButton, 25)){
            click(dismissPreferenceUpdateButton);
        }
        click(moreOptionsButton);
        return new MoreOptionsScreen(driver);
    }

    /**
     * @author Juan.Gonzalez
     * return true if Buy Tickets Reserve Dining Button element is displayed on screen, otherwise false.
     */
    public boolean buyTicketsReserveDiningButtonIsDisplayed() {
        return isElementAvailable(buyTicketsReserveDiningButton); }

    /**
     * @author Juan.Gonzalez
     * Navigate to Buy Tickets Reserve Dining Screen from DashBoard Screen.
     */
    public BuyTicketsReserveDiningScreen goToBuyTicketsReserveDiningScreen() {
        if (this.isElementAvailable(dismissWelcome, 25)){
            click(dismissWelcome);
        }
        if (this.isElementAvailable(dismissPreferenceUpdateButton, 25)){
            click(dismissPreferenceUpdateButton);
        }
        click(buyTicketsReserveDiningButton);
        return new BuyTicketsReserveDiningScreen(driver);
    }
}
