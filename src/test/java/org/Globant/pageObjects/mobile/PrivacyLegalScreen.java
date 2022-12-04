package org.Globant.pageObjects.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Globant.reporting.Reporter;
import org.Globant.utils.mobile.BaseScreen;
import org.testng.Assert;

public class PrivacyLegalScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Juan.Gonzalez
     */
    public PrivacyLegalScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/privacy_and_legal_elements\")")
    private AndroidElement privacyAndLegalElementsList;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Privacy Policy\")")
    private AndroidElement privacyPolicyButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Terms of Use\")")
    private AndroidElement termsOfUseButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Supplemental Terms and Conditions\")")
    private AndroidElement supplementalTermsAndConditionsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Legal Notices\")")
    private AndroidElement legalNoticesButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Property Rules\")")
    private AndroidElement propertyRulesButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Electronic Communications Disclosure\")")
    private AndroidElement electronicCommunicationsDisclosureButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your California Privacy Rights\")")
    private AndroidElement yourCaliforniaPrivacyRightsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Do Not Sell My Personal Information\")")
    private AndroidElement doNotSellMyPersonalInformationButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"In-App Maps Subject to Google Terms and Conditions\")")
    private AndroidElement googleTermsAndConditionsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"In-App Maps Subject to Google Privacy Policy\")")
    private AndroidElement googlePrivacyPolicyButton;

    /**
     * @author Juan.Gonzalez
     * return true if a list of privacy & legal options is displayed on screen, otherwise false.
     */
    public boolean listOfLegalOptionsIsDisplayed() {
        return isElementAvailable(privacyAndLegalElementsList);
    }

    /**
     * @author Juan.Gonzalez
     * return true if the 'Privacy Policy' option is displayed on screen, otherwise false.
     */
    public boolean privacyPolicyOptionIsDisplayed() {
        return isElementAvailable(privacyPolicyButton);
    }

    /**
     * @author Juan.Gonzalez
     * return true if the 'Terms of Use' option is displayed on screen, otherwise false.
     */
    public boolean termsOfUseOptionIsDisplayed() {
        return isElementAvailable(termsOfUseButton);
    }

    /**
     * @author Juan.Gonzalez
     * return true if the 'Supplemental Terms and Conditions' option is displayed on screen, otherwise false.
     */
    public boolean supplementalTermsAndConditionsOptionIsDisplayed() {
        return isElementAvailable(supplementalTermsAndConditionsButton);
    }

    /**
     * @author Juan.Gonzalez
     * return true if the 'Legal Notices' option is displayed on screen, otherwise false.
     */
    public boolean legalNoticesOptionIsDisplayed() { return isElementAvailable(legalNoticesButton); }

    /**
     * @author Juan.Gonzalez
     * return true if the 'Property Rules' option is displayed on screen, otherwise false.
     */
    public boolean propertyRulesOptionIsDisplayed() { return isElementAvailable(propertyRulesButton); }
    /**
     * @author Juan.Gonzalez
     * return true if the 'Electronic Communications Disclosure' option is displayed on screen, otherwise false.
     */
    public boolean electronicCommunicationsDisclosureOptionIsDisplayed() { return isElementAvailable(electronicCommunicationsDisclosureButton); }

    /**
     * @author Juan.Gonzalez
     * return true if the 'Your California Privacy Rights' option is displayed on screen, otherwise false.
     */
    public boolean yourCaliforniaPrivacyRightsOptionIsDisplayed() { return isElementAvailable(yourCaliforniaPrivacyRightsButton); }

    /**
     * @author Juan.Gonzalez
     * return true if the 'Do Not Sell My Personal Information' option is displayed on screen, otherwise false.
     */
    public boolean doNotSellMyPersonalInformationOptionIsDisplayed() { return isElementAvailable(doNotSellMyPersonalInformationButton); }

    /**
     * @author Juan.Gonzalez
     * return true if the 'In-App Maps Subject to Google Terms and Conditions' option is displayed on screen, otherwise false.
     */
    public boolean googleTermsAndConditionsIsDisplayed() { return isElementAvailable(googleTermsAndConditionsButton); }

    /**
     * @author Juan.Gonzalez
     * return true if the 'In-App Maps Subject to Google Privacy Policy' option is displayed on screen, otherwise false.
     */
    public boolean googlePrivacyPolicyIsDisplayed() { return isElementAvailable(googlePrivacyPolicyButton); }

    public void privacyLegalScreenAssertions(){

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
