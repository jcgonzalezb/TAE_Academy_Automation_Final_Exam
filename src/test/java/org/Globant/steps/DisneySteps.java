package org.Globant.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Globant.pageObjects.mobile.DashBoardScreen;
import org.Globant.pageObjects.mobile.MapScreen;
import org.Globant.pageObjects.mobile.SetUp;
import org.Globant.reporting.Reporter;
import org.testng.Assert;

public class DisneySteps {





    @Given("The user navigates to the dashboard page")
    public void theUserNavigatesToTheDashboardPage() {
        DashBoardScreen dashBoard = SetUp.loadDashBoardScreen();

    }

    @Given("The user navigates to check the Disneyland Map")
    public void theUserNavigatesToCheckTheDisneylandMap() {
        MapScreen map = dashBoard.goToMapScreen();
        Reporter.info("Validate Disneyland map on screen");
        Assert.assertTrue(map.disneylandMapIsDisplayed(), "Disneyland map not displayed");
    }

    @When("taps the category list")
    public void tapsTheCategoryList() {

    }

    @Then("the Hotels option should be available in the category list")
    public void theHotelsOptionShouldBeAvailableInTheCategoryList() {
    }

    @Given("The user is on the more other options Menu")
    public void theUserIsOnTheMoreOtherOptionsMenu() {
    }

    @When("checks all the options available")
    public void checksAllTheOptionsAvailable() {
    }

    @And("taps on the Privacy & Legal option")
    public void tapsOnThePrivacyLegalOption() {
    }

    @Then("all Privacy & Legal options are displayed")
    public void allPrivacyLegalOptionsAreDisplayed() {
    }

    @Given("The Buy Tickets Reserve Dining button is available")
    public void theBuyTicketsReserveDiningButtonIsAvailable() {
    }

    @When("taps on the Buy Tickets Reserve Dining button")
    public void tapsOnTheBuyTicketsReserveDiningButton() {
    }

    @Then("the Check Dining Availability button is displayed")
    public void theCheckDiningAvailabilityButtonIsDisplayed() {
    }
}
