package org.Globant.pageObjects.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Globant.utils.mobile.BaseScreen;


/**
 * Represents the 'Map' Screen.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class MapScreen extends BaseScreen {

    /**
     * The 'Category list' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*categoryTitle\")")
    private AndroidElement categoryListButton;

    /**
     * The 'Category Select' header.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "resourceId(\"com.disney.wdpro.dlr:id/categorySelectHeader\")")
    private AndroidElement categorySelectHeader;

    /**
     * The 'Filter' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*filterTitle.*\")")
    private AndroidElement filterButton;

    /**
     * The 'Show List' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*toggleTitle.*\")")
    private AndroidElement showListButton;

    /**
     * The 'Hotels Category' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "descriptionContains(\"Hotels, Category, 10of11, button\")")
    private AndroidElement hotelsCategoryButton;

    /**
     * The 'Disneyland' map.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "resourceId(\"com.disney.wdpro.dlr:id/map_view_fragment\")")
    private AndroidElement disneylandMapOnScreen;

    /**
     * Constructor method for the MapScreen class.
     *
     * @param driver : The driver that controls the behaviour of an android application.
     */
    public MapScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }


    /**
     * Checks if the 'Category List' button is displayed.
     *
     * @return True if the 'Category List' button is displayed, otherwise the return is false.
     */
    public boolean categoryButtonIsDisplayed() {
        return isElementAvailable(categoryListButton);
    }

    /**
     * Checks if the 'Filter' button is displayed.
     *
     * @return True if the 'Category List' button is displayed, otherwise the return is false.
     */
    public boolean filterIsDisplayed() {
        return isElementAvailable(filterButton);
    }

    /**
     * Checks if the 'Show List' button is displayed.
     *
     * @return True if the 'Show List' button is displayed, otherwise the return is false.
     */
    public boolean showListIsDisplayed() {
        return isElementAvailable(showListButton);
    }

    /**
     * Clicks on the 'Category List' button.
     */
    public void clickOnCategoryList() {
        if (this.isElementAvailable(categoryListButton, 25)) {
            click(categoryListButton);
        }
    }

    /**
     * Checks if the 'Disneyland' map is displayed.
     *
     * @return True if the 'Disneyland' map is displayed, otherwise the return is false.
     */
    public boolean disneylandMapIsDisplayed() {
        return isElementAvailable(disneylandMapOnScreen);
    }

    /**
     * Checks if the 'Select Category' title is displayed.
     *
     * @return True if the 'Select Category' title is displayed,
     * otherwise the return is false.
     */
    public boolean selectCategoryTitleIsDisplayed() {
        return isElementAvailable(categorySelectHeader);
    }

    /**
     * Checks if the 'Hotels' category button is displayed.
     *
     * @return True if the 'Hotels' category button is displayed, otherwise the return is false.
     */
    public boolean hotelsCategoryButtonIsDisplayed() {
        return isElementAvailable(hotelsCategoryButton);
    }
}
