Feature: Country Functionality

  @SmokeTest
  Scenario: Create Country
    Given Navigate to Campus
    When Enter username and password and click login button
    Then user should login successfully
    And Navigate to country page
    When create a country
    Then Success message should be displayed