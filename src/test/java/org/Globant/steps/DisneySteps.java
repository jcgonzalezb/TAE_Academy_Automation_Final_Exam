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
        SetUp.environmentSetUp();
    }

    @After
    public void closeApp() {
        SetUp.mobileApplicationEnd();
    }

    @Given("The user navigates to the dashboard page")
    public void theUserNavigatesToTheDashboardPage() {
        this.dashBoard = SetUp.loadDashBoardScreen();
    }

    @Given("The user navigates to check the Disneyland Map")
    public void theUserNavigatesToCheckTheDisneylandMap() {
        this.map = dashBoard.goToMapScreen();
        Reporter.info("Validate Disneyland map on screen");
        Assert.assertTrue(map.disneylandMapIsDisplayed(), "Disneyland map not displayed");
    }

    @When("taps the category list")
    public void tapsTheCategoryList() {
        Assert.assertTrue(map.categoryButtonIsDisplayed(), "Category button not displayed");
        map.clickOnCategoryList();
        Assert.assertTrue(map.selectCategoryTitleIsDisplayed(), "Select Category title not displayed");
    }

    @Then("the Hotels option should be available in the category list")
    public void theHotelsOptionShouldBeAvailableInTheCategoryList() {
        Assert.assertTrue(map.hotelsCategoryButtonIsDisplayed(), "Hotels Category is not available");
    }

    @Given("The user is on the more other options Menu")
    public void theUserIsOnTheMoreOtherOptionsMenu() {
        Reporter.info("Validate moreOtherOptions button");
        Assert.assertTrue(dashBoard.moreOptionsButtonIsDisplayed(), "More Options button not displayed");
    }

    @When("checks all the options available")
    public void checksAllTheOptionsAvailable() {
        Reporter.info("Start Navigation to More Options Screen");
        this.moreOtherOptions = dashBoard.goToMoreOptionsScreen();
        moreOtherOptions.scrollDownToPrivacyLegal();
        moreOtherOptions.moreOtherOptionsScreenAssertions();
    }

    @And("taps on the Privacy & Legal option")
    public void tapsOnThePrivacyLegalOption() {
        Reporter.info("Start Navigation to Privacy & Legal Screen");
        this.privacyLegalScreen = moreOtherOptions.goToPrivacyLegalScreen();
    }

    @Then("all Privacy & Legal options are displayed")
    public void allPrivacyLegalOptionsAreDisplayed() {
        privacyLegalScreen.privacyLegalScreenAssertions();
    }

    @Given("The Buy Tickets Reserve Dining button is available")
    public void theBuyTicketsReserveDiningButtonIsAvailable() {
        Reporter.info("Validate 'Buy Tickets Reserve Dining' button");
        Assert.assertTrue(dashBoard.buyTicketsReserveDiningButtonIsDisplayed(), "Check 'Buy Tickets Reserve Dining' button not displayed");
    }

    @When("taps on the Buy Tickets Reserve Dining button")
    public void tapsOnTheBuyTicketsReserveDiningButton() {
        Reporter.info("Start Navigation to 'Buy Tickets Reserve Dining' Screen");
        this.buyTicketsReserveDiningScreen = dashBoard.goToBuyTicketsReserveDiningScreen();
        Reporter.info("Validate 'Buy Tickets Reserve Dining' list");
        Assert.assertTrue(buyTicketsReserveDiningScreen.buyTicketsReserveDiningListIsDisplayed(), "Check 'Buy Tickets Reserve Dining' list not displayed");
    }

    @Then("the Check Dining Availability button is displayed")
    public void theCheckDiningAvailabilityButtonIsDisplayed() {
        Reporter.info("Validate 'Check Dining Availability' button");
        Assert.assertTrue(buyTicketsReserveDiningScreen.checkDiningAvailabilityButtonIsDisplayed(), "Check 'Dining Availability' button not displayed");
    }
}
