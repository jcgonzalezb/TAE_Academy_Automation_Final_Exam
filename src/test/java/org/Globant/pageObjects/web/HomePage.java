package org.Globant.pageObjects.web;

import org.Globant.reporting.Reporter;
import org.Globant.utils.web.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import org.testng.Assert;
import com.github.javafaker.Faker;
import java.util.Arrays;
import java.util.List;


/**
 * Represents the ESPN homepage.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class HomePage extends BasePage {

    private static final String FIRSTNAME = "Juan";
    private static final String LASTNAME = "Gonzalez";

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
     * The icon to access the user options menu
     */
    @FindBy(id="global-user-trigger")
    private WebElement userIcon;

    /**
     * The user options menu
     */
    @FindBy(className = "global-user-container")
    private WebElement menu;

    /**
     * The 'Log in' option on the user options menu
     */
    @FindBy(css= "div.global-user:last-child ul.account-management > li:last-child > a")
    private WebElement logInText;

    /**
     * The modal to insert user information
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
     * The 'Sign up' button
     */
    @FindBy(id = "BtnCreateAccount")
    private WebElement signUpButton;

    /**
     * The title of the 'Sign Up' modal
     */
    @FindBy(id = "Title")
    private WebElement createAccountTitle;

    /**
     * The user's first name field
     */
    @FindBy(id = "InputFirstName")
    private WebElement inputFirstName;

    /**
     * The user's last name field
     */
    @FindBy(id = "InputLastName")
    private WebElement inputLastName;

    /**
     * The user's email address field
     */
    @FindBy(id = "InputEmail")
    private WebElement inputEmail;

    /**
     * The user's new password field
     */
    @FindBy(id = "password-new")
    private WebElement passwordNew;

    /**
     * The close button of the 'Sign Up' modal
     */
    @FindBy(id = "close")
    private WebElement closeButton;

    /**
     * The watch option icon.
     */
    @FindBy(css = "#global-nav > ul > li.pillar.watch > a")
    private WebElement watchIcon;

    /**
     * The welcome message to login user
     */
    @FindBy(css = ".display-user > span")
    private WebElement userNameConfirmation;

    /**
     * The welcome message to unregistered user
     */
    @FindBy(css = ".display-user")
    private WebElement displayUserName;

    /**
     * The 'Log out' option on the user options menu
     */
    @FindBy(linkText="Log Out")
    private WebElement logOutText;

    /**
     * Checks visibility of a specific element and clicks on it.
     * @param element The selected element of the webpage.
     */
    public void completeAccessToElement(WebElement element){
        super.waitForVisibility(element);
        super.clickElement(element);
    }

    /**
     * Access the user panel.
     * @result The user panel is displayed.
     */
    public void accessingUserPanel() {
        super.waitForVisibility(userIcon);
        super.clickElement(userIcon);
        super.waitForVisibility(menu);
    }

    /**
     * Searches the 'Log in' option on the user panel.
     * @result Click done on the 'Log in' option.
     */
    public void LogInOption() {
        accessingUserPanel();
        completeAccessToElement(logInText);
    }

    /**
     * Checks if the 'Log in' modal is displayed.
     * @return True if the 'Log in' modal is displayed, otherwise the return is false.
     */
    public boolean isLogInModalDisplayed(){
        super.waitForVisibility(logInModal);
        return logInModal.isDisplayed();
    }

    /**
     * Switches from homepage to 'Log in' modal.
     * @result The 'Log in' modal is displayed.
     */
    public void switchToModal() {
        super.getDriver().switchTo().frame(logInModal);
    }

    /**
     * Checks if the ESPN logo is displayed.
     * @return True if the ESPN logo is displayed, otherwise the return is false.
     */
    public boolean isEspnLogoDisplayed() {
        super.waitForVisibility(espnLogo);
        return espnLogo.isDisplayed(); }

    /**
     * Checks if the 'Sog in' button is displayed.
     * @return True if the ESPN logo is displayed, otherwise the return is false.
     */
    public boolean isLogInButtonDisplayed() {
        super.waitForVisibility(submitButton);
        return submitButton.isDisplayed(); }

    /**
     * Checks if the 'Log in' button is displayed.
     * @return True if the ESPN logo is displayed, otherwise the return is false.
     */
    public boolean isSignUpButtonDisplayed() {
        super.waitForVisibility(signUpButton);
        return signUpButton.isDisplayed();
    }

    /**
     * Checks if the 'Create Account' title is displayed.
     * @return True if the 'Create Account' title is displayed,
     * otherwise the return is false.
     */
        public boolean isCreateAccountTitleDisplayed() {
        super.waitForVisibility(createAccountTitle);
        return createAccountTitle.isDisplayed();
    }

    /**
     * Checks if the user's first name field is displayed.
     * @return True if the user's first name field is displayed,
     * otherwise the return is false.
     */
    public boolean isInputFirstNameDisplayed() {
        super.waitForVisibility(inputFirstName);
        return inputFirstName.isDisplayed();
    }

    /**
     * Checks if the user's last name field is displayed.
     * @return True if the user's last name field is displayed,
     * otherwise the return is false.
     */
    public boolean isInputLastNameDisplayed() {
        super.waitForVisibility(inputLastName);
        return inputLastName.isDisplayed();
    }

    /**
     * Checks if the user's email address field is displayed.
     * @return True if the user's email address field is displayed,
     * otherwise the return is false.
     */
    public boolean isInputEmailDisplayed() {
        super.waitForVisibility(inputEmail);
        return inputEmail.isDisplayed();
    }

    /** Checks if the user's new password field is displayed.
     * @return True if the user's new password field is displayed,
     * otherwise the return is false.
     */
    public boolean isPasswordNewDisplayed() {
        super.waitForVisibility(passwordNew);
        return passwordNew.isDisplayed();
    }

    /** Checks if the close button of the 'Sign Up' modal is displayed.
     * @return True if the close button of the 'Sign Up' modal is displayed,
     * otherwise the return is false.
     */
    public boolean isCloseButtonDisplayed() {
        super.waitForVisibility(closeButton);
        return closeButton.isDisplayed();
    }

    /**
     * Validates several elements inside the User Modal.
     */
    public void checkUserModal() {
        Reporter.info("Validate User Modal information.");
        Assert.assertTrue(isEspnLogoDisplayed(),
                "The ESPN logo is not present.");
        Reporter.info("The ESPN logo is present.");
        Assert.assertTrue(isLogInButtonDisplayed(),
                "The 'Log In' button is not present.");
        Reporter.info("The 'Log In' button is present.");
        Assert.assertTrue(isSignUpButtonDisplayed(),
                "The 'Sign Up' button is not present.");
        Reporter.info("The 'Sign Up' button is present.");
    }

    /**
     * Validates several elements inside the 'Sign Up' Modal.
     */
    public void signUpModalValidate() {
        super.waitForClickable(signUpButton);
        super.clickElement(signUpButton);
        Reporter.info("Validate 'Sign Up' modal information.");
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
        Reporter.info("Inserting valid information to Sign Up.");

        super.typeOnInput(inputFirstName, FIRSTNAME);
        super.typeOnInput(inputLastName, LASTNAME);
        super.typeOnInput(inputEmail, generateRandomEmail());
        super.typeOnInput(passwordNew, generateRandomPassword());

        super.waitForVisibility(submitButton);
        super.waitForClickable(submitButton);
        completeAccessToElement(submitButton);
    }

    public void logOutOption() {
        super.waitForVisibility(logOutText);
        super.clickElement(logOutText);
    }

    public void switchToMain() { super.getDriver().switchTo().defaultContent(); }

    public WatchPage watchPage() {
        completeAccessToElement(watchIcon);
        return new WatchPage(getDriver());
    }

    public void mouseHoverUserIcon() {
        super.waitForVisibility(userIcon);
        Actions action = new Actions(getDriver());
        action.moveToElement(userIcon).perform();
        super.clickElement(userIcon);
        super.waitForVisibility(menu);
    }

    public String userNameConfirmation ()    {
        super.waitForVisibility(userNameConfirmation);
        return userNameConfirmation.getText();
    }

    public String registeredUserName(){
        String userName = FIRSTNAME + "!";
        return userName;
    }

    public String displayUsername () {
        super.waitForVisibility(displayUserName);
        return displayUserName.getText();
    }

    public void reloadPage() {super.getDriver().navigate().refresh(); }

    public String generateRandomPassword() {

        List rules = Arrays.asList(new CharacterRule(EnglishCharacterData.UpperCase, 1),
                new CharacterRule(EnglishCharacterData.LowerCase, 1),
                new CharacterRule(EnglishCharacterData.Digit, 1),
                new CharacterRule(EnglishCharacterData.Special, 1));

        PasswordGenerator generator = new PasswordGenerator();
        String password = generator.generatePassword(10, rules);
        return password;
    }

    public String generateRandomEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }
}