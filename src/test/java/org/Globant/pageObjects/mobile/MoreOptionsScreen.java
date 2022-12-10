package org.Globant.pageObjects.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Globant.reporting.Reporter;
import org.Globant.utils.mobile.BaseScreen;
import org.testng.Assert;


/**
 * Represents the 'More Options' Screen.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class MoreOptionsScreen extends BaseScreen {

    /**
     * The 'My Profile' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"My Profile button\")")
    private AndroidElement myProfileButton;

    /**
     * The 'Property Rules' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "descriptionContains(\"Property Rules button\")")
    private AndroidElement propertyRulesButton;

    /**
     * The 'Cast Compliment' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "descriptionContains(\"Cast Compliment button\")")
    private AndroidElement castComplimentButton;

    /**
     * The 'Link to Account' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "descriptionContains(\"Link to Account button\")")
    private AndroidElement linkToAccountButton;

    /**
     * The 'Car Locator' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Car Locator button\")")
    private AndroidElement carLocatorButton;

    /**
     * The 'Help' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Help button\")")
    private AndroidElement helpButton;

    /**
     * The 'Privacy Legal' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "descriptionContains(\"Privacy & Legal button\")")
    private AndroidElement privacyLegalButton;

    /**
     * Constructor method for the MoreOptionsScreen class.
     *
     * @param driver : The driver that controls the behaviour of an android application.
     */
    public MoreOptionsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * Scrolls down until the 'Privacy & Legal' button is located.
     */
    public void scrollDownToPrivacyLegal(){
        scrollDown(4);
    }

    /**
     * Checks if the 'My Profile' button is displayed.
     * @return True if the 'My Profile' button is displayed, otherwise the return is false.
     */
    public boolean myProfileButtonIsDisplayed() {
        return isElementAvailable(myProfileButton);
    }

    /**
     * Checks if the 'Property Rules' button is displayed.
     * @return True if the 'Property Rules' button is displayed, otherwise the return is false.
     */
    public boolean propertyRulesButtonIsDisplayed() {
        return isElementAvailable(propertyRulesButton);
    }

    /**
     * Checks if the 'Cast Compliment' button is displayed.
     * @return True if the 'Cast Compliment' button is displayed, otherwise the return is false.
     */
    public boolean castComplimentButtonIsDisplayed() {
        return isElementAvailable(castComplimentButton);
    }

    /**
     * Checks if the 'Link to Account' button is displayed.
     * @return True if the 'Link to Account' button is displayed, otherwise the return is false.
     */
    public boolean linkToAccountButtonIsDisplayed() {
        return isElementAvailable(linkToAccountButton);
    }

    /**
     * Checks if the 'Car Locator' button is displayed.
     * @return True if the 'Car Locator' button is displayed, otherwise the return is false.
     */
    public boolean carLocatorButtonIsDisplayed() {
        return isElementAvailable(carLocatorButton);
    }

    /**
     * Checks if the 'Help' button is displayed.
     * @return True if the 'Help' button is displayed, otherwise the return is false.
     */
    public boolean helpButtonIsDisplayed() {
        return isElementAvailable(helpButton);
    }

    /**
     * Checks if the 'Privacy & Legal' button is displayed.
     * @return True if the 'Privacy & Legal' button is displayed, otherwise the return is false.
     */
    public boolean privacyLegalButtonIsDisplayed() {
        return isElementAvailable(privacyLegalButton);
    }

    /**
     * Takes the user to the 'Privacy & Legal' screen from the 'More Options' Screen.
     * @return The 'Privacy & Legal' Screen is opened.
     */
    public PrivacyLegalScreen goToPrivacyLegalScreen() {
        click(privacyLegalButton);
        return new PrivacyLegalScreen(getDriver());
    }

    /**
     * Validates all the options available on the 'More Options' Screen.
     */
    public void moreOptionsScreenAssertions() {

        Reporter.info("Validate 'My Profile' option");
        Assert.assertTrue(myProfileButtonIsDisplayed(), "'My Profile' option not displayed");

        Reporter.info("Validate 'Property Rules' option");
        Assert.assertTrue(propertyRulesButtonIsDisplayed(), "'Property Rules' option not displayed");

        Reporter.info("Validate 'Cast Compliment' option");
        Assert.assertTrue(castComplimentButtonIsDisplayed(), "'Cast Compliment' option not displayed");

        Reporter.info("Validate 'Link to Account' option");
        Assert.assertTrue(linkToAccountButtonIsDisplayed(), "'Link to Account' option not displayed");

        Reporter.info("Validate 'Car Locator' option");
        Assert.assertTrue(carLocatorButtonIsDisplayed(), "'Car Locator' option not displayed");

        Reporter.info("Validate 'Help' option");
        Assert.assertTrue(helpButtonIsDisplayed(), "'Help' option not displayed");

        Reporter.info("Validate 'Privacy & Legal' option");
        Assert.assertTrue(privacyLegalButtonIsDisplayed(), "'Privacy & Legal' option not displayed");
    }
}

