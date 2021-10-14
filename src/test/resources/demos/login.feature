#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: feature to test login funtionality

  @tag1
  Scenario Outline: check whether login is successful with valid credentials or not
    Given browser is opened
    And user is on login page
    When user enters <username> and <password>
    And clicks on login page
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | bob      |    12345 |
      | howard   |   123456 |
      | aether   |      123 |
