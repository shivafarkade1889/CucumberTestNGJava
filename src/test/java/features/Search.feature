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

Feature: Search and place order for vegetables
  I want to use this template for my feature file

@SeleniumTest
  Scenario: Search for items and validate results
    Given User is on Greencart Landing page
    When User searched for "Cucumber" vegetable
    Then "Cucumber" results are Displayed


@SeleniumTest1
  Scenario: Search for other items and validate results
    Given User is on Greencart Landing page
    When User searched for "Brinjal" vegetable
    And Add itmes to the Cart
    And User processed to the checkout page
    Then Verify that selected "Brinjal" items are displayed in checkout page
