@tag
Feature: feature to test google search functionality

  @tag1
  Scenario: checking whether google search is working or not
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
