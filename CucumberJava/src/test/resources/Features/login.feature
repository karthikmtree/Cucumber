#Autor
#Date
#Jira id
@Smoke
Feature: feature to test login functionality

  Scenario: Check login for valid credentials
    Given user is on login page
    When user enters Username and password
    And user clicks on login button
    Then user is taken to home page

