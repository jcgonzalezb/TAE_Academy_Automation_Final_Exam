package org.Globant.pageObjects.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import org.Globant.utils.mobile.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * Map screen.
 *
 * @author Hans.Marquez
 */
public class MapScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Hans.Marquez
     */
    public MapScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*categoryTitle\")")
    private AndroidElement categoryListButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/categorySelectHeader\")")
    private AndroidElement categorySelectHeader;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*filterTitle.*\")")
    private AndroidElement filterButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*toggleTitle.*\")")
    private AndroidElement showListButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Hotels, Category, 10of11, button\")")
    private AndroidElement hotelsCategoryButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/map_view_fragment\")")
    private AndroidElement disneylandMapOnScreen;

    /**
     * @author Hans.Marquez
     * return true if Category List element is displayed in screen, otherwise false.
     */
    public boolean categoryButtonIsDisplayed() {
        return isElementAvailable(categoryListButton);
    }

    /**
     * @author Hans.Marquez
     * return true if Filter Button element is displayed in screen, otherwise false.
     */
    public boolean filterIsDisplayed() {
        return isElementAvailable(filterButton);
    }

    /**
     * @author Hans.Marquez
     * return true if Show List Button element is displayed in screen, otherwise false.
     */
    public boolean showListIsDisplayed() {
        return isElementAvailable(showListButton);
    }

    /**
     * @author Juan.Gonzalez
     * Click on the Category List button if it is available.
     */
    public void clickOnCategoryList() {
        if (this.isElementAvailable(categoryListButton, 25)) {
            click(categoryListButton);
        }
    }

    /**
     * @author Juan.Gonzalez
     * return true if Disneyland map is displayed on screen, otherwise false.
     */
    public boolean disneylandMapIsDisplayed() {
        return isElementAvailable(disneylandMapOnScreen);
    }

    /**
     * @author Hans.Marquez
     * return true if Show Select Category title is displayed in screen, otherwise false.
     */
    public boolean selectCategoryTitleIsDisplayed() {
        return isElementAvailable(categorySelectHeader);
    }

    /**
     * @author Juan.Gonzalez
     * return true if Show Hotels Category Button element is displayed on screen, otherwise false.
     */
    public boolean hotelsCategoryButtonIsDisplayed() {
        return isElementAvailable(hotelsCategoryButton);
    }
}
