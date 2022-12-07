package org.Globant.pageObjects.web;

import org.Globant.reporting.Reporter;
import org.Globant.utils.web.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


/**
 * Represents the ESPN homepage.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class HomePage extends BasePage {

    /**
     * Constructor method for the HomePage class.
     * @param driver The driver that controls the behaviour
     * of a web browser.
     */
    public HomePage(WebDriver driver){
        super(driver);
    }

    /**
     * The principal frame from ESPN homepage.
     */
    @FindBy(css= "body > div.promo-banner-container > iframe")
    private WebElement bannerIframe;

    /**
     * A banner that appears when loading the ESPN homepage.
     */
    @FindBy(css="#fittPageContainer > section > div.PromoBanner__CloseBtn")
    private WebElement bannerCloseBtn;

    /**
     * The icon to access user information
     */
    @FindBy(id="global-user-trigger")
    private WebElement userIcon;

    /**
     * The user options menu
     */
    @FindBy(className = "global-user-container")
    private WebElement menu;

    /**
     * The user options menu
     */
    @FindBy(css= "div.global-user:last-child ul.account-management > li:last-child > a")
    private WebElement logInText;

    /**
     * The modal to insert user credentials
     */
    @FindBy(css = "div#oneid-wrapper > iframe#oneid-iframe")
    private WebElement logInModal;

    /**
     * The ESPN logo
     */
    @FindBy(id ="logo")
    private WebElement espnLogo;

    /**
     * The submit button
     */
    @FindBy (id = "BtnSubmit")
    private WebElement submitButton;

    /**
     * The ESPN
     */
    @FindBy(id = "InputLoginValue")
    private WebElement usernameValue;

    @FindBy(id = "InputPassword")
    private WebElement passwordValue;

    @FindBy(id = "BtnCreateAccount")
    private WebElement signUpButton;

    @FindBy(id = "Title")
    private WebElement createAccountTitle;

    @FindBy(id = "InputFirstName")
    private WebElement inputFirstName;

    @FindBy(id = "InputLastName")
    private WebElement inputLastName;

    @FindBy(id = "InputEmail")
    private WebElement inputEmail;

    @FindBy(id = "password-new")
    private WebElement passwordNew;

    @FindBy(id = "close")
    private WebElement closeButton;

    @FindBy(css = "#global-nav > ul > li.pillar.watch > a")
    private WebElement watchIcon;

    @FindBy(css = ".display-user > span")
    private WebElement userNameConfirmation;

    @FindBy(css = ".display-user")
    private WebElement displayUserName;

    @FindBy(linkText="Log Out")
    private WebElement logOutText;

    @FindBy(linkText="ESPN Profile")
    private WebElement espnProfile;

    @FindBy(css= "div#oneid-wrapper > iframe#oneid-iframe")
    private WebElement UpdateAccountForm;

    @FindBy(id="AccountDeleteLink")
    private WebElement accountDeleteLink;

    public void visibilityClickElement(WebElement element){
        super.waitForVisibility(element);
        super.clickElement(element);
    }

    public void closeBanner(){
        super.waitForFrameExistence(bannerIframe);
        super.clickElement(bannerCloseBtn);
    }

    public void accessingUserPanel() {
        super.waitForVisibility(userIcon);
        super.clickElement(userIcon);
        super.waitForVisibility(menu);
    }

    public void LogInOption() {
        accessingUserPanel();
        Assert.assertEquals(displayUsername(), "Welcome!",
                "The element 'Nav text' still has text: 'Welcome!' with user name.");
        Reporter.info("The element 'Nav text' has text: 'Welcome!' without user name.");
        visibilityClickElement(logInText);
    }

    public boolean isLogInModalDisplayed(){
        super.waitForVisibility(logInModal);
        return logInModal.isDisplayed();
    }

    public void switchToModal() {
        super.getDriver().switchTo().frame(logInModal);
    }

    public boolean isEspnLogoDisplayed() {
        super.waitForVisibility(espnLogo);
        return espnLogo.isDisplayed(); }
    public boolean isLogInButtonDisplayed() {
        super.waitForVisibility(submitButton);
        return submitButton.isDisplayed(); }

    public boolean isSignUpButtonDisplayed() {
        super.waitForVisibility(signUpButton);
        return signUpButton.isDisplayed();
    }
    public boolean isCreateAccountTitleDisplayed() {
        super.waitForVisibility(createAccountTitle);
        return createAccountTitle.isDisplayed();
    }

    public boolean isInputFirstNameDisplayed() {
        super.waitForVisibility(inputFirstName);
        return inputFirstName.isDisplayed();
    }

    public boolean isInputLastNameDisplayed() {
        super.waitForVisibility(inputLastName);
        return inputLastName.isDisplayed();
    }

    public boolean isInputEmailDisplayed() {
        super.waitForVisibility(inputEmail);
        return inputEmail.isDisplayed();
    }

    public boolean isPasswordNewDisplayed() {
        super.waitForVisibility(passwordNew);
        return passwordNew.isDisplayed();
    }

    public boolean isCloseButtonDisplayed() {
        super.waitForVisibility(closeButton);
        return closeButton.isDisplayed();
    }


    public void checkUserModal() {
        Assert.assertTrue(isEspnLogoDisplayed(),
                "The ESPN logo is not present.");
        Reporter.info("The ESPN logo is present.");
        Assert.assertTrue(isLogInButtonDisplayed(),
                "The Log In button is not present.");
        Reporter.info("The Log In button is present.");
        Assert.assertTrue(isSignUpButtonDisplayed(),
                "The Sign Up button is not present.");
        Reporter.info("The Sign Up button is present.");
    }

    public void signUpModalValidate() {
        super.waitForClickable(signUpButton);
        super.clickElement(signUpButton);
        Assert.assertTrue(isCreateAccountTitleDisplayed(),
                "The 'Create Account' title is not present.");
        Reporter.info("The 'Create Account' title is present.");
        Assert.assertTrue(isInputFirstNameDisplayed(),
                "The 'First Name' input is not present.");
        Reporter.info("The 'First Name' input is present.");
        Assert.assertTrue(isInputLastNameDisplayed(),
                "The 'Last Name' input is not present.");
        Reporter.info("The 'Last Name' input is present.");
        Assert.assertTrue(isInputEmailDisplayed(),
                "The 'Email' input is not present.");
        Reporter.info("The 'Email' input is present.");
        Assert.assertTrue(isPasswordNewDisplayed(),
                "The 'Password' input is not present.");
        Reporter.info("The 'Password' input is present.");
        Assert.assertTrue(isLogInButtonDisplayed(),
                "The 'Sign Up' button is not present.");
        Reporter.info("The 'Sign Up' button on the create account modal is present.");
        Assert.assertTrue(isCloseButtonDisplayed(),
                "The 'X' close button is not present.");
        Reporter.info("The 'X' close button is present.");
    }

    public void signUpProcedure () {

        String firstName = "Juan";
        super.typeOnInput(inputFirstName, firstName);

        String lastName = "Gonzalez";
        super.typeOnInput(inputLastName, lastName);

        String email = "anahousat089@hotmail.com";
        super.typeOnInput(inputEmail, email);

        String newPassword = "8asuW-Mu21";
        super.typeOnInput(passwordNew, newPassword);
        super.waitForVisibility(submitButton);
        super.waitForClickable(submitButton);
        //super.clickElement(submitButton);

    }

    public void logOutOption() {
        super.waitForVisibility(logOutText);
        super.clickElement(logOutText);
    }

    public void switchToMain() {super.getDriver().switchTo().defaultContent(); }

    public void insertCredentials () {
        String username = "juantesat1@hotmail.com";
        super.typeOnInput(usernameValue, username);
        String password = "8dmwQirn+cR02";
        super.typeOnInput(passwordValue, password);
        super.clickElement(submitButton);
    }

    public WatchPage watchPage() {
        visibilityClickElement(watchIcon);
        return new WatchPage(getDriver());
    }

    public void mouseHoverUserIcon() {
        super.waitForVisibility(userIcon);
        Actions action = new Actions(getDriver());
        action.moveToElement(userIcon).perform();
        super.clickElement(userIcon);
        System.out.println("click on userIcon");
        super.waitForVisibility(menu);
        System.out.println("Menu displayed");
    }

    public String userNameConfirmation ()    {
        super.waitForVisibility(userNameConfirmation);
        return userNameConfirmation.getText();
    }
    public String displayUsername () {
        super.waitForVisibility(displayUserName);
        return displayUserName.getText();
    }

    public void insideLogInModal() {
        insertCredentials();
        switchToMain();
        super.waitForInvisibility(logInModal);
    }


    public void logInComplete() {
        LogInOption();
        switchToModal();
        insideLogInModal();
        switchToMain();
    }
}