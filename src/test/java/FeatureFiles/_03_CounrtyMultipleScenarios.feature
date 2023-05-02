Feature: Country Multi Scenario

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then user should login successfully
    And Navigate to country page

  Scenario: Create country
      When create a country
      Then Success message should be displayed

  Scenario: Create a country 2
      When create a country name as"emrecan" code as "1789"
      Then Success message should be displayed