#Author: Karthik
#JIRA: 4532
Feature: Test login

  Scenario Outline: Check login with valid credentials
    Given user is on website
    When user enters <name> and <password>
    And user clicks on login
    Then logout button should be displayed

    Examples: 
      | name    | password |
      | Michael |    12345 |
      | Shane   |    12345 |
