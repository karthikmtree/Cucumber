Feature: Testing Google Search

  Scenario: checking the search reults
    Given user has browser open
    When user enters text in search bar
    And user clicks on enter or search
    Then Search results are displayed
