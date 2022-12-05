package org.Globant.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Globant.pageObjects.mobile.*;
import org.Globant.reporting.Reporter;
import org.testng.Assert;

public class DisneySteps {

    private DashBoardScreen dashBoard;
    private MapScreen map;

    private MoreOptionsScreen moreOtherOptions;

    private PrivacyLegalScreen privacyLegalScreen;

    private BuyTicketsReserveDiningScreen buyTicketsReserveDiningScreen;


    @Before
    public void startApp(){
        Reporter.info("Navigating to the Tutorial Screen.");
        SetUp.environmentSetUp();
    }

    @After
    public void closeApp() {
        SetUp.mobileApplicationEnd();
        Reporter.info("Application closed.");
    }

    @Given("The user navigates to the dashboard page")
    public void theUserNavigatesToTheDashboardPage() {
        Reporter.info("Navigating to the Dashboard Screen.");
        this.dashBoard = SetUp.loadDashBoardScreen();
    }

    @Given("The user navigates to check the Disneyland Map")
    public void theUserNavigatesToCheckTheDisneylandMap() {
        Reporter.info("Navigating to the Disneyland Map.");
        Reporter.info("Validate the Disneyland Map.");
        this.map = dashBoard.goToMapScreen();
        Assert.assertTrue(map.disneylandMapIsDisplayed(),
                "The Disneyland map is not displayed.");
        Reporter.info("The Disneyland map is displayed.");
    }

    @When("taps the category list")
    public void tapsTheCategoryList() {
        Reporter.info("Validate the Category button.");
        Assert.assertTrue(map.categoryButtonIsDisplayed(),
                "The Category button is not displayed.");
        Reporter.info("The Category button is displayed.");
        map.clickOnCategoryList();
        Assert.assertTrue(map.selectCategoryTitleIsDisplayed(),
                "The select Category title is not displayed.");
        Reporter.info("The Category title is displayed.");
    }

    @Then("the Hotels option should be available in the category list")
    public void theHotelsOptionShouldBeAvailableInTheCategoryList() {
        Reporter.info("Validate the Hotels Category.");
        Assert.assertTrue(map.hotelsCategoryButtonIsDisplayed(),
                "The Hotels Category is not available.");
        Reporter.info("The Hotels Category is available.");
    }

    @Given("The user is on the more other options Menu")
    public void theUserIsOnTheMoreOtherOptionsMenu() {
        Reporter.info("Validate moreOtherOptions button.");
        Assert.assertTrue(dashBoard.moreOptionsButtonIsDisplayed(),
                "More Options button is not displayed.");
        Reporter.info("The moreOtherOptions button is displayed.");
    }

    @When("checks all the options available")
    public void checksAllTheOptionsAvailable() {
        Reporter.info("Navigating to More Options Screen.");
        this.moreOtherOptions = dashBoard.goToMoreOptionsScreen();
        Reporter.info("Scroll down until bottom of the screen.");
        moreOtherOptions.scrollDownToPrivacyLegal();
        moreOtherOptions.moreOtherOptionsScreenAssertions();
    }

    @And("taps on the Privacy & Legal option")
    public void tapsOnThePrivacyLegalOption() {
        Reporter.info("Navigating to Privacy & Legal Screen");
        this.privacyLegalScreen = moreOtherOptions.goToPrivacyLegalScreen();
    }

    @Then("all Privacy & Legal options are displayed")
    public void allPrivacyLegalOptionsAreDisplayed() {
        privacyLegalScreen.privacyLegalScreenAssertions();
    }

    @Given("The Buy Tickets Reserve Dining button is available")
    public void theBuyTicketsReserveDiningButtonIsAvailable() {
        Reporter.info("Validate 'Buy Tickets Reserve Dining' button.");
        Assert.assertTrue(dashBoard.buyTicketsReserveDiningButtonIsDisplayed(),
                "The 'Buy Tickets Reserve Dining' button is not displayed.");
        Reporter.info("The 'Buy Tickets Reserve Dining' button is displayed.");
    }

    @When("taps on the Buy Tickets Reserve Dining button")
    public void tapsOnTheBuyTicketsReserveDiningButton() {
        Reporter.info("Navigating to 'Buy Tickets Reserve Dining' Screen.");
        this.buyTicketsReserveDiningScreen = dashBoard.goToBuyTicketsReserveDiningScreen();
        Reporter.info("Validate 'Buy Tickets Reserve Dining' list.");
        Assert.assertTrue(
                buyTicketsReserveDiningScreen.buyTicketsReserveDiningListIsDisplayed(),
                "The 'Buy Tickets Reserve Dining' list is not displayed.");
        Reporter.info("The 'Buy Tickets Reserve Dining' list is displayed.");
    }

    @Then("the Check Dining Availability button is displayed")
    public void theCheckDiningAvailabilityButtonIsDisplayed() {
        Reporter.info("Validate 'Check Dining Availability' button.");
        Assert.assertTrue(
                buyTicketsReserveDiningScreen.checkDiningAvailabilityButtonIsDisplayed(),
                "The 'Check Dining Availability' button is not displayed.");
        Reporter.info("The 'Check Dining Availability' button.");
    }
}
