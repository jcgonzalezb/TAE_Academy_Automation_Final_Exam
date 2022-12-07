Feature: Sign up and Log Out functionalities

  In order to do have a great user experience,
  the user should be able to sign up and log out
  from the ESPN landing page successfully.

  @webTesting
  Scenario: Sign Up and Log Out from ESPN page
    Given the user navigates the ESPN landing page
    When the user enters valid credentials for sign up
    And the user navigates to the Watch page
    And the user returns to the ESPN landing page
    And the user logs out
    Then the user's name does not appeared in the welcome message
