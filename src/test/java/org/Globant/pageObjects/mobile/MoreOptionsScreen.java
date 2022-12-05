package org.Globant.pageObjects.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Globant.reporting.Reporter;
import org.Globant.utils.mobile.BaseScreen;
import org.testng.Assert;



public class MoreOptionsScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"My Profile button\")")
    private AndroidElement myProfileButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Property Rules button\")")
    private AndroidElement propertyRulesButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Cast Compliment button\")")
    private AndroidElement castComplimentButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Link to Account button\")")
    private AndroidElement linkToAccountButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Car Locator button\")")
    private AndroidElement carLocatorButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Help button\")")
    private AndroidElement helpButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Privacy & Legal button\")")
    private AndroidElement privacyLegalButton;

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Juan.Gonzalez
     */
    public MoreOptionsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * @author Juan.Gonzalez
     * Scroll down until the Privacy & Legal button is located.
     */
    public void scrollDownToPrivacyLegal(){
        scrollDown(4);
    }

    /**
     * @author Juan.Gonzalez
     * return true if 'My Profile' Button is displayed on screen, otherwise false.
     */
    public boolean myProfileButtonIsDisplayed() {
        return isElementAvailable(myProfileButton);
    }

    /**
     * @author Juan.Gonzalez
     * return true if 'Property Rules' Button is displayed on screen, otherwise false.
     */
    public boolean propertyRulesButtonIsDisplayed() {
        return isElementAvailable(propertyRulesButton);
    }

    /**
     * @author Juan.Gonzalez
     * return true if 'Cast Compliment' Button is displayed on screen, otherwise false.
     */
    public boolean castComplimentButtonIsDisplayed() { return isElementAvailable(castComplimentButton); }

    /**
     * @author Juan.Gonzalez
     * return true if 'Link to Account' Button is displayed on screen, otherwise false.
     */
    public boolean linkToAccountButtonIsDisplayed() { return isElementAvailable(linkToAccountButton); }

    /**
     * @author Juan.Gonzalez
     * return true if 'Car Locator' Button is displayed on screen, otherwise false.
     */
    public boolean carLocatorButtonIsDisplayed() { return isElementAvailable(carLocatorButton); }

    /**
     * @author Juan.Gonzalez
     * return true if 'Help' Button is displayed on screen, otherwise false.
     */
    public boolean helpButtonIsDisplayed() { return isElementAvailable(helpButton); }

    /**
     * @author Juan.Gonzalez
     * return true if 'Privacy & Legal' Button is displayed on screen, otherwise false.
     */
    public boolean privacyLegalButtonIsDisplayed() {
        return isElementAvailable(privacyLegalButton);
    }

    /**
     * @author Juan.Gonzalez
     * Navigate to Privacy & Legal Screen from More Options Screen.
     */
    public PrivacyLegalScreen goToPrivacyLegalScreen() {
        click(privacyLegalButton);
        return new PrivacyLegalScreen(getDriver());
    }

    public void moreOtherOptionsScreenAssertions(){

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

