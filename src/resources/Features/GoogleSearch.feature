#Sample Feature Definition Template
@FirstTestFeature
Feature: Google Search
  I want to use this file to search different stuff in Google

  @TestScenario1
  Scenario Outline: Search Selenium in google
    Given User opens browser
    And User is on www.google.com page
    When User enters Selenium text in search box
    And User hits enter
    Then User is navigated to search results

#    Examples: 
#     | value  |
#     | Selenium |
#			| Fail |
      
