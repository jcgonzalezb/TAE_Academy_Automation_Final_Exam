package org.Globant.steps.web;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Globant.configuration.web.UniqueWebDriver;

import org.Globant.pageObjects.web.HomePage;
import org.Globant.pageObjects.web.WatchPage;
import org.Globant.reporting.Reporter;
import org.testng.Assert;

import static java.lang.String.format;

public class EspnSteps {

    private static UniqueWebDriver driver;
    protected HomePage home;
    protected WatchPage watchPage;

    private final String URL ="https://www.espnqa.com/?src=com&_adblock=true&espn=cloud";
    private static final String BROWSER = "chrome";
    private final String USERNAME = "Juan!";



    @Given("the user navigates the ESPN landing page")
    public void theUserNavigatesTheESPNLandingPage() {
        driver = new UniqueWebDriver(BROWSER);
        Reporter.info("Deleting all the cookies");
        driver.getDriver().manage().deleteAllCookies();
        Reporter.info(format("Navigating to %s", URL));
        Reporter.info("Navigating the ESPN Landing Page");
        driver.getDriver().get(URL);
        driver.getDriver().manage().window().maximize();
        home = new HomePage(driver.getDriver());
        //home.closeBanner();
        home.LogInOption();
        Assert.assertTrue(home.isLogInModalDisplayed(),
                "The User Modal is not present.");
        Reporter.info("The User Modal is present.");
        home.switchToModal();
        home.checkUserModal();
    }

    @When("the user enters valid credentials for sign up")
    public void theUserEntersValidCredentialsForSignUp() {
        home.signUpModalValidate();
        home.signUpProcedure();
    }

    @And("the user navigates to the Watch page")
    public void theUserNavigatesToTheWatchPage() {
        home.switchToMain();
        Reporter.info("Navigating the ESPN Watch Page");
        WatchPage watchPage = home.watchPage();
        Assert.assertTrue(watchPage.isFirstCarouselDisplayed(),
                "The first carousel is not present.");
        Reporter.info("The first carousel is present.");
        Assert.assertTrue(watchPage.isSecondCardDisplayed(),
                "The second card on the first carousel is not present.");
        Reporter.info("The second card on the first carousel is present.");
        watchPage.clickOnSecondCard();
        Assert.assertTrue(watchPage.isxButtonDisplayed(),
                "The 'X' button to close is not present.");
        Reporter.info("The 'X' button to close is present.");
        watchPage.clickOnxButton();
    }

    @And("the user returns to the ESPN landing page")
    public void theUserReturnsToTheESPNLandingPage() {
        watchPage.returnToHome();
        home.switchToMain();
        home.mouseHoverUserIcon();
        home.accessingUserPanel();
        Assert.assertEquals(home.userNameConfirmation(), USERNAME, "The username is not correct");
        Reporter.info("The username is correct");
    }

    @And("the user logs out")
    public void theUserLogsOut() {
        home.logOutOption();
        home.switchToMain();
    }

    @Then("the user's name does not appeared in the welcome message")
    public void theUserSNameDoesNotAppearedInTheWelcomeMessage() {
        home.mouseHoverUserIcon();
        home.accessingUserPanel();
        Assert.assertEquals(home.displayUsername(), "Welcome!", "The element 'Nav text' still has text: 'Welcome!' with user name.");
        Reporter.info("The element 'Nav text' has text: 'Welcome!' without user name.");
    }
}
