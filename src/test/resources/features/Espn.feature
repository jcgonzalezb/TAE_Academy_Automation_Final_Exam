Feature: Sign up and Log Out functionalities

  In order to do have a great user experience,
  the user should be able to sign up and log out
  from the ESPN landing page successfully.

  Scenario: Login successfully
    Given The user navigates the ESPN landing page
    When checks an icon and some buttons
    And enters valid credentials for sign up
    Then the ESPN landing page should display in logged in state

  Scenario: Navigate the watch page
    Given The user navigates the Watch page
    When checks second card in the first carousel
    And closes the open window
    Then returns to the ESPN landing page

  Scenario: Logout successfully
    Given The user navigates the ESPN landing page
    When checks his name in the welcome message
    And logs out
    Then his name does not appeared in the welcome message