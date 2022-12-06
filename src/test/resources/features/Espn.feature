Feature: Sign up and Log Out functionalities

  In order to do have a great user experience,
  the user should be able to sign up and log out
  from the ESPN landing page successfully.

  Scenario: Sign Up and Log Out from ESPN page
    Given The user navigates the ESPN landing page
    When enters valid credentials for sign up
    And navigates to the Watch page
    And returns to the ESPN landing page
    And logs out
    Then his name does not appeared in the welcome message
