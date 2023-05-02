Feature: ApachePOI Citizen Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then user should login successfully
    And Navigate to citizenship page

    Scenario: create and delete Citizenship from the Excel
      When user create citizenship with ApachePOI
      Then user delete citizenship with ApachePOI