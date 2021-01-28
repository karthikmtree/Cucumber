Feature: To Test the HRM Website

  Background: user is logged in
    Given user is on Landing page
    When user enters credentials
    And user clicks on login button
    Then Home page is displayed

  #Test case 1
  Scenario:  test logout link
    When user clicks on Welcome link
    Then logout is displayed

  #Test case 2
  Scenario:  test Dashboard
    When user clicks on Recruitment tab
    Then Dashboard is dispalyed
