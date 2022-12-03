package org.Globant.pageObjects.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Globant.utils.mobile.BaseScreen;

public class BuyTicketsReserveDiningScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/actionSheetListView\")")
    private AndroidElement buyTicketsReserveDiningList;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Check Dining Availability, 1 of 7, button\")")
    private AndroidElement checkDiningAvailabilityButton;

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Juan.Gonzalez
     */
    public BuyTicketsReserveDiningScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * @author Juan.Gonzalez
     * return true if 'Buy Tickets Reserve Dining' List is displayed on screen, otherwise false.
     */
    public boolean buyTicketsReserveDiningListIsDisplayed() {
        return isElementAvailable(buyTicketsReserveDiningList);
    }

    /**
     * @author Juan.Gonzalez
     * return true if 'Check Dining Availability' Button is displayed on screen, otherwise false.
     */
    public boolean checkDiningAvailabilityButtonIsDisplayed() {
        return isElementAvailable(checkDiningAvailabilityButton);
    }
}
