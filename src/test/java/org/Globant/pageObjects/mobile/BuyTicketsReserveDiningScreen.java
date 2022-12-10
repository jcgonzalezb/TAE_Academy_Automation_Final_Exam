package org.Globant.pageObjects.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Globant.utils.mobile.BaseScreen;


/**
 * Represents the 'Buy Tickets Reserve Dining' Screen.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class BuyTicketsReserveDiningScreen extends BaseScreen {

    /**
     * The 'Buy Tickets Reserve Dining' list.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "resourceId(\"com.disney.wdpro.dlr:id/actionSheetListView\")")
    private AndroidElement buyTicketsReserveDiningList;

    /**
     * The 'Check Dining Availability' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "descriptionContains(\"Check Dining Availability, 1 of 7, button\")")
    private AndroidElement checkDiningAvailabilityButton;

    /**
     * Constructor method for the BuyTicketsReserveDiningScreen class.
     *
     * @param driver : The driver that controls the behaviour of an android application.
     */
    public BuyTicketsReserveDiningScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * Checks if the 'Buy Tickets Reserve Dining' list is displayed.
     *
     * @return True if the 'Buy Tickets Reserve Dining' list is displayed,
     * otherwise the return is false.
     */
    public boolean buyTicketsReserveDiningListIsDisplayed() {
        return isElementAvailable(buyTicketsReserveDiningList);
    }

    /**
     * Checks if the 'Check Dining Availability' button is displayed.
     *
     * @return True if the 'Check Dining Availability' button is displayed,
     * otherwise the return is false.
     */
    public boolean checkDiningAvailabilityButtonIsDisplayed() {
        return isElementAvailable(checkDiningAvailabilityButton);
    }
}
