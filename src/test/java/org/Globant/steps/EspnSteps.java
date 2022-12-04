package org.Globant.steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Globant.configuration.web.Driver;
import org.Globant.pageObjects.web.HomePage;
import org.Globant.pageObjects.web.WatchPage;
import org.Globant.reporting.Reporter;
import org.testng.Assert;

import static java.lang.String.format;

public class EspnSteps {

    private static Driver driver;
    protected HomePage home;
    protected WatchPage watchPage;

    private final String URL ="https://www.espnqa.com/?src=com&_adblock=true&espn=cloud";
    private static final String BROWSER = "chrome";
    private final String USERNAME = "Juan!";

    @AfterAll
    public static void tearDown() {
        driver.getDriver().quit();
    }

    @Given("The user navigates the ESPN landing page")
    public void theUserNavigatesTheESPNLandingPage() {
        driver = new Driver(BROWSER);
        Reporter.info("Deleting all the cookies");
        driver.getDriver().manage().deleteAllCookies();
        Reporter.info(format("Navigating to %s", URL));
        Reporter.info("Navigating the ESPN Landing Page");
        driver.getDriver().get(URL);
        driver.getDriver().manage().window().maximize();
        home = new HomePage(driver.getDriver());
        //home.closeBanner();
    }

    @When("checks an icon and some buttons")
    public void checksAnIconAndSomeButtons() {
        home.LogInOption();
        Assert.assertTrue(home.isLogInModalDisplayed(),
                "The User Modal is not present.");
        Reporter.info("The User Modal is present.");
        home.switchToModal();
        home.checkUserModal();
    }

    @And("enters valid credentials for sign up")
    public void entersValidCredentialsForSignUp() {
        home.signUpModalValidate();
        home.signUpProcedure();
    }

    @Then("the ESPN landing page should display in logged in state")
    public void theESPNLandingPageShouldDisplayInLoggedInState() {
        home.switchToMain();
    }

    @Given("The user navigates the Watch page")
    public void theUserNavigatesTheWatchPage() {
        Reporter.info("Navigating the ESPN Watch Page");
        WatchPage watchPage = home.watchPage();
        Assert.assertTrue(watchPage.isFirstCarouselDisplayed(),
                "The first carousel is not present.");
        Reporter.info("The first carousel is present.");
    }

    @When("checks second card in the first carousel")
    public void checksSecondCardInTheFirstCarousel() {
        Assert.assertTrue(watchPage.isSecondCardDisplayed(),
                "The second card on the first carousel is not present.");
        Reporter.info("The second card on the first carousel is present.");
        watchPage.clickOnSecondCard();
    }

    @And("closes the open window")
    public void closesTheOpenWindow() {
        Assert.assertTrue(watchPage.isxButtonDisplayed(),
                "The 'X' button to close is not present.");
        Reporter.info("The 'X' button to close is present.");
        watchPage.clickOnxButton();
    }

    @Then("returns to the ESPN landing page")
    public void returnsToTheESPNLandingPage() {
        watchPage.returnToHome();
    }

    @When("checks his name in the welcome message")
    public void checksHisNameInTheWelcomeMessage() {
        home.switchToMain();
        home.mouseHoverUserIcon();
        home.accessingUserPanel();
        Assert.assertEquals(home.userNameConfirmation(), USERNAME, "The username is not correct");
        Reporter.info("The username is correct");
    }

    @And("logs out")
    public void logsOut() {
        home.logOutOption();
        home.switchToMain();
    }

    @Then("his name does not appeared in the welcome message")
    public void hisNameDoesNotAppearedInTheWelcomeMessage() {
        home.mouseHoverUserIcon();
        home.accessingUserPanel();
        Assert.assertEquals(home.displayUsername(), "Welcome!", "The element 'Nav text' still has text: 'Welcome!' with user name.");
        Reporter.info("The element 'Nav text' has text: 'Welcome!' without user name.");
    }
}
