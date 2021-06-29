#Sample Feature Definition Template
@FirstTestFeature
Feature: Google Search
  I want to use this file to search different stuff in Google

  @TestScenario1
  Scenario Outline: Search different stuff in google
    Given User opens browser
    And User is on www.google.com page
    When User enters <value> text in search box
    And User hits enter
    Then User is navigated to search results
    And User closes browser

    Examples: 
      | value  |
      | Selenium |
      | Cucumber |
      | Pablo Garcia |