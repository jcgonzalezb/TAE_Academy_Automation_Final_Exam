package org.Globant.pageObjects.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Globant.reporting.Reporter;
import org.Globant.utils.mobile.BaseScreen;
import org.testng.Assert;


/**
 * Represents the 'Privacy & Legal' Screen.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class PrivacyLegalScreen extends BaseScreen {

    /**
     * The 'Privacy & Legal Elements' list.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "resourceId(\"com.disney.wdpro.dlr:id/privacy_and_legal_elements\")")
    private AndroidElement privacyAndLegalElementsList;

    /**
     * The 'Privacy Policy' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Privacy Policy\")")
    private AndroidElement privacyPolicyButton;

    /**
     * The 'Terms of Use' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Terms of Use\")")
    private AndroidElement termsOfUseButton;

    /**
     * The 'Supplemental Terms and Conditions' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "text(\"Supplemental Terms and Conditions\")")
    private AndroidElement supplementalTermsAndConditionsButton;

    /**
     * The 'Legal Notices' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Legal Notices\")")
    private AndroidElement legalNoticesButton;

    /**
     * The 'Property Rules' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Property Rules\")")
    private AndroidElement propertyRulesButton;

    /**
     * The 'Electronic Communications Disclosure' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "text(\"Electronic Communications Disclosure\")")
    private AndroidElement electronicCommunicationsDisclosureButton;

    /**
     * The 'Your California Privacy Rights' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your California Privacy Rights\")")
    private AndroidElement yourCaliforniaPrivacyRightsButton;

    /**
     * The 'Do Not Sell My Personal Information' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "text(\"Do Not Sell My Personal Information\")")
    private AndroidElement doNotSellMyPersonalInformationButton;

    /**
     * The 'Google Terms and Conditions' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "text(\"In-App Maps Subject to Google Terms and Conditions\")")
    private AndroidElement googleTermsAndConditionsButton;

    /**
     * The 'Google Privacy Policy' button.
     */
    @AndroidFindBy(uiAutomator = "new UiSelector()." +
            "text(\"In-App Maps Subject to Google Privacy Policy\")")
    private AndroidElement googlePrivacyPolicyButton;

    /**
     * Constructor method for the PrivacyLegalScreen class.
     *
     * @param driver The driver that controls the behaviour of an android application.
     */
    public PrivacyLegalScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * Checks if the 'Privacy & Legal' options list is displayed.
     *
     * @return True if the 'Privacy & Legal' options list is displayed,
     * otherwise the return is false.
     */
    public boolean listOfLegalOptionsIsDisplayed() {
        return isElementAvailable(privacyAndLegalElementsList);
    }

    /**
     * Checks if the 'Privacy Policy' option is displayed.
     *
     * @return True if the 'Privacy Policy' option is displayed,
     * otherwise the return is false.
     */
    public boolean privacyPolicyOptionIsDisplayed() {
        return isElementAvailable(privacyPolicyButton);
    }

    /**
     * Checks if the 'Terms of Use' option is displayed.
     *
     * @return True if the 'Terms of Use' option is displayed, otherwise the return is false.
     */
    public boolean termsOfUseOptionIsDisplayed() {
        return isElementAvailable(termsOfUseButton);
    }

    /**
     * Checks if the 'Supplemental Terms and Conditions' option is displayed.
     *
     * @return True if the 'Supplemental Terms and Conditions' option is displayed,
     * otherwise the return is false.
     */
    public boolean supplementalTermsAndConditionsOptionIsDisplayed() {
        return isElementAvailable(supplementalTermsAndConditionsButton);
    }

    /**
     * Checks if the 'Legal Notices' option is displayed.
     *
     * @return True if the 'Legal Notices' option is displayed, otherwise the return is false.
     */
    public boolean legalNoticesOptionIsDisplayed() {
        return isElementAvailable(legalNoticesButton);
    }

    /**
     * Checks if the 'Property Rules' option is displayed.
     *
     * @return True if the 'Property Rules' option is displayed, otherwise the return is false.
     */
    public boolean propertyRulesOptionIsDisplayed() {
        return isElementAvailable(propertyRulesButton);
    }

    /**
     * Checks if the 'Electronic Communications Disclosure' option is displayed.
     *
     * @return True if the 'Electronic Communications Disclosure' option is displayed,
     * otherwise the return is false.
     */
    public boolean electronicCommunicationsDisclosureOptionIsDisplayed() {
        return isElementAvailable(electronicCommunicationsDisclosureButton);
    }

    /**
     * Checks if the 'Your California Privacy Rights' option is displayed.
     *
     * @return True if the 'Your California Privacy Rights' option is displayed,
     * otherwise the return is false.
     */
    public boolean yourCaliforniaPrivacyRightsOptionIsDisplayed() {
        return isElementAvailable(yourCaliforniaPrivacyRightsButton);
    }

    /**
     * Checks if the 'Do Not Sell My Personal Information' option is displayed.
     *
     * @return True if the 'Do Not Sell My Personal Information' option is displayed,
     * otherwise the return is false.
     */
    public boolean doNotSellMyPersonalInformationOptionIsDisplayed() {
        return isElementAvailable(doNotSellMyPersonalInformationButton);
    }

    /**
     * Checks if the 'In-App Maps Subject to Google Terms and Conditions' option is displayed.
     *
     * @return True if the 'In-App Maps Subject to Google Terms and Conditions' option
     * is displayed, otherwise the return is false.
     */
    public boolean googleTermsAndConditionsIsDisplayed() {
        return isElementAvailable(googleTermsAndConditionsButton);
    }

    /**
     * Checks if the 'In-App Maps Subject to Google Privacy Policy' option is displayed.
     *
     * @return True if the 'In-App Maps Subject to Google Privacy Policy' option
     * is displayed, otherwise the return is false.
     */
    public boolean googlePrivacyPolicyIsDisplayed() {
        return isElementAvailable(googlePrivacyPolicyButton);
    }

    /**
     * Validates all the options available on the 'Privacy & Legal' Screen.
     */
    public void privacyLegalScreenAssertions() {

        Reporter.info("Validate 'Privacy & Legal' option list");
        Assert.assertTrue(listOfLegalOptionsIsDisplayed(), "'Privacy & Legal' option list not displayed");

        Reporter.info("Validate 'Privacy Policy' option");
        Assert.assertTrue(privacyPolicyOptionIsDisplayed(), "'Privacy Policy' option not displayed");

        Reporter.info("Validate 'Terms of Use' option");
        Assert.assertTrue(termsOfUseOptionIsDisplayed(), "'Terms of Use' option not displayed");

        Reporter.info("Validate 'Supplemental Terms and Conditions' option");
        Assert.assertTrue(supplementalTermsAndConditionsOptionIsDisplayed(), "'Supplemental Terms and Conditions' option not displayed");

        Reporter.info("Validate 'Legal Notices' option");
        Assert.assertTrue(legalNoticesOptionIsDisplayed(), "'Legal Notices' option not displayed");

        Reporter.info("Validate 'Property Rules' option");
        Assert.assertTrue(propertyRulesOptionIsDisplayed(), "'Property Rules' option not displayed");

        Reporter.info("Validate 'Electronic Communications Disclosure' option");
        Assert.assertTrue(electronicCommunicationsDisclosureOptionIsDisplayed(), "'Electronic Communications Disclosure' option not displayed");

        Reporter.info("Validate 'Your California Privacy Rights' option");
        Assert.assertTrue(yourCaliforniaPrivacyRightsOptionIsDisplayed(), "'Your California Privacy Rights' option not displayed");

        Reporter.info("Validate 'Do Not Sell My Personal Information' option");
        Assert.assertTrue(doNotSellMyPersonalInformationOptionIsDisplayed(), "'Do Not Sell My Personal Information' option not displayed");

        Reporter.info("Validate 'In-App Maps Subject to Google Terms and Conditions' option");
        Assert.assertTrue(googleTermsAndConditionsIsDisplayed(), "'In-App Maps Subject to Google Terms and Conditions' option not displayed");

        Reporter.info("Validate 'In-App Maps Subject to Google Privacy Policy' option");
        Assert.assertTrue(googlePrivacyPolicyIsDisplayed(), "'In-App Maps Subject to Google Privacy Policy' option not displayed");
    }
}
