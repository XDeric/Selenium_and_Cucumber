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
Feature: Database Test

  @tag1
  Scenario: we should be able to connect to database and get the data
    #When connection is established using <url> <driver> <username> and <password>
    When connection is established using url driver username and password
    And I run a select query to get data
    Then I should see the result as mouse

   # Examples: 
    #  | url                                         | driver                | username | password |
    #  | 'jdbc:postgresql://localhost:5432/postgres' | org.postgresql.Driver | xdred    | password |
