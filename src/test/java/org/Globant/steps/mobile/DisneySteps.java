package org.Globant.steps.mobile;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Globant.pageObjects.mobile.*;
import org.Globant.reporting.Reporter;
import org.testng.Assert;

/**
 * Represents the tests cases used in the Disneyland application.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class DisneySteps {

    private DashBoardScreen dashBoard;
    private MapScreen map;

    private MoreOptionsScreen moreOptions;

    private PrivacyLegalScreen privacyLegalScreen;

    private BuyTicketsReserveDiningScreen buyTicketsReserveDiningScreen;

    /**
     * Takes the user to the 'Dashboard' Screen from the 'Tutorial' Screen.
     */
    @Given("The user navigates to the dashboard page")
    public void theUserNavigatesToTheDashboardPage() {
        Reporter.info("Navigating to the Dashboard Screen.");
        this.dashBoard = SetUpMobile.loadDashBoardScreen();
    }

    /**
     * Takes the user to the 'Map' Screen from the 'DashBoard' Screen.
     */
    @Given("The user navigates to check the Disneyland Map")
    public void theUserNavigatesToCheckTheDisneylandMap() {
        Reporter.info("Navigating to the Disneyland Map.");
        Reporter.info("Validate the Disneyland Map.");
        this.map = dashBoard.goToMapScreen();
        Assert.assertTrue(map.disneylandMapIsDisplayed(),
                "The Disneyland map is not displayed.");
        Reporter.info("The Disneyland map is displayed.");
    }

    /**
     * Checks the 'Category' list.
     */
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

    /**
     * Validates the 'Hotels' option in the 'Category' list.
     */
    @Then("the Hotels option should be available in the category list")
    public void theHotelsOptionShouldBeAvailableInTheCategoryList() {
        Reporter.info("Validate the Hotels Category.");
        Assert.assertTrue(map.hotelsCategoryButtonIsDisplayed(),
                "The Hotels Category is not available.");
        Reporter.info("The Hotels Category is available.");
    }

    /**
     * Validates the 'More Options' button.
     */
    @Given("The user is on the more other options Menu")
    public void theUserIsOnTheMoreOtherOptionsMenu() {
        Reporter.info("Validate the 'More Options' button.");
        Assert.assertTrue(dashBoard.moreOptionsButtonIsDisplayed(),
                "The 'More Options' button is not displayed.");
        Reporter.info("The 'More Options' button is displayed.");
    }

    /**
     * Validates all the options available on the 'More Options' Screen.
     */
    @When("checks all the options available")
    public void checksAllTheOptionsAvailable() {
        Reporter.info("Navigating to the 'More Options' Screen.");
        this.moreOptions = dashBoard.goToMoreOptionsScreen();
        Reporter.info("Scroll down until bottom of the screen.");
        moreOptions.scrollDownToPrivacyLegal();
        moreOptions.moreOptionsScreenAssertions();
    }

    /**
     Takes the user to the 'Privacy & Legal' Screen from the 'DashBoard' Screen.
     */
    @And("taps on the Privacy & Legal option")
    public void tapsOnThePrivacyLegalOption() {
        Reporter.info("Navigating to Privacy & Legal Screen");
        this.privacyLegalScreen = moreOptions.goToPrivacyLegalScreen();
    }

    /**
     Validates all the options available on the 'Privacy & Legal' Screen.
     */
    @Then("all Privacy & Legal options are displayed")
    public void allPrivacyLegalOptionsAreDisplayed() {
        privacyLegalScreen.privacyLegalScreenAssertions();
    }

    /**
     * Validates the 'Buy Tickets Reserve Dining' button.
     */
    @Given("The Buy Tickets Reserve Dining button is available")
    public void theBuyTicketsReserveDiningButtonIsAvailable() {
        Reporter.info("Validate 'Buy Tickets Reserve Dining' button.");
        Assert.assertTrue(dashBoard.buyTicketsReserveDiningButtonIsDisplayed(),
                "The 'Buy Tickets Reserve Dining' button is not displayed.");
        Reporter.info("The 'Buy Tickets Reserve Dining' button is displayed.");
    }

    /**
     * Takes the user to the 'Buy Tickets Reserve Dining' Screen from the 'DashBoard' Screen.
     */
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

    /**
     Validates 'Check Dining Availability' button is available.
     */
    @Then("the Check Dining Availability button is displayed")
    public void theCheckDiningAvailabilityButtonIsDisplayed() {
        Reporter.info("Validate 'Check Dining Availability' button.");
        Assert.assertTrue(
                buyTicketsReserveDiningScreen.checkDiningAvailabilityButtonIsDisplayed(),
                "The 'Check Dining Availability' button is not displayed.");
        Reporter.info("The 'Check Dining Availability' button.");
    }
}
