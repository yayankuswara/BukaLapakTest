Feature: Validate Transaction Data

  Scenario: Validate the Data on Page with Database
    Given I got data from Transaction Page
    When Check with Database
    Then Match the Transaction ID
    And Match all data
