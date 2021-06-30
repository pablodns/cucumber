#Sample Feature Definition Template
@FirstTestFeature
Feature: Google Search
  I want to use this file to search different stuff in Google

  @TestScenario1
  Scenario Outline: Search <value> in google
    Given User opens browser
    And User is on www.google.com page
    When User enters <value> text in search box
    And User hits enter
    Then User is navigated to search results

    Examples: 
      | value  |
      | Selenium |
#| Fail |
      
  @TestScenario1
  Scenario Outline: Search ANOTHER THING stuff in google
    Given User opens browser
    And User is on www.google.com page
    When User enters ANOTHER THING text in search box2
    And User hits enter
    Then User is navigated to search results
