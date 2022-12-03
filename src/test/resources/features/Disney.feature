Feature: Review some lists present in the Disneyland mobile
  application.

  In order to do have a great client experience, the app user
  should be able check some lists which are useful when he is
  visiting Disneyland, such as category list and Privacy &
  Legal.

  Background:
    Given The user navigates to the dashboard page

  Scenario: The Hotel Option is available
    Given The user navigates to check the Disneyland Map
    When taps the category list
    Then the Hotels option should be available in the category list

  Scenario: The Privacy & Legal screen displays several options
    Given The user is on the more other options Menu
    When checks all the options available
    And taps on the Privacy & Legal option
    Then all Privacy & Legal options are displayed

  Scenario: The Check Dining Availability button is available
    Given The Buy Tickets Reserve Dining button is available
    When taps on the Buy Tickets Reserve Dining button
    Then the Check Dining Availability button is displayed