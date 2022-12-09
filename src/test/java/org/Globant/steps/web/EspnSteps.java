package org.Globant.steps.web;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.Globant.pageObjects.web.HomePage;
import org.Globant.pageObjects.web.WatchPage;
import org.Globant.reporting.Reporter;
import org.testng.Assert;

import static org.Globant.steps.web.WebHooks.getDriver;

public class EspnSteps {

    private HomePage home;
    private WatchPage watchPage;

    @Given("the user navigates the ESPN landing page")
    public void theUserNavigatesTheESPNLandingPage() {
        this.home = new HomePage(getDriver());
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
        Reporter.info("Sign Up procedure completed!");
    }

    @And("the user navigates to the Watch page")
    public void theUserNavigatesToTheWatchPage() {
        Reporter.info("Navigating to the ESPN Watch Page.");
        this.watchPage = home.watchPage();
        Assert.assertTrue(watchPage.isFirstCarouselDisplayed(),
                "The first carousel is not present.");
        Reporter.info("The first carousel is present.");
        Assert.assertTrue(watchPage.isSecondCardDisplayed(),
                "The second card on the first carousel is not present.");
        Reporter.info("The second card on the first carousel is present.");
        watchPage.clickOnSecondCard();
        Assert.assertTrue(watchPage.isxButtonDisplayed(),
                "The 'X' button to close is not present.");
        Reporter.info("The 'X' button to close the window is present.");
        watchPage.clickOnxButton();
        watchPage.returnToHome();
    }

    @And("the user returns to the ESPN landing page")
    public void theUserReturnsToTheESPNLandingPage() {
        home.switchToMain();
        home.reloadPage();
        Reporter.info("Validate welcome message with username on the user panel.");
        home.mouseHoverUserIcon();
        Assert.assertEquals(home.userNameConfirmation(),
                home.registeredUserName(), "The username is not correct.");
        Reporter.info("The username is correct.");
    }

    @And("the user logs out")
    public void theUserLogsOut() {
        home.logOutOption();
        Reporter.info("Log Out procedure completed!");
    }

    @Then("the user's name does not appeared in the welcome message")
    public void theUserSNameDoesNotAppearedInTheWelcomeMessage() {
        home.switchToMain();
        home.reloadPage();
        Reporter.info("Validate welcome message without username on the user panel.");
        home.mouseHoverUserIcon();
        Assert.assertEquals(home.displayUsername(), "Welcome!",
                "The element 'Nav text' still has text: 'Welcome!' with username.");
        Reporter.info("The element 'Nav text' has text: 'Welcome!' without username.");
    }
}
