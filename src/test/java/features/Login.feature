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
Feature: Application Login

Background:
Given Browser is getting statred
When Browser is launched
Then Validate Browser is up and running


@SmokeTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "IUC1" and "Passowrd12341"
Then Home page is populated
And Cards are displayed

@RegressionTest
Scenario: Mobile Home page default login
Given User is on NetBanking landing page
When User login into application with "SHiva1" and "Jiva1"
Then Home page is populated
And Cards are not displayed

@SanityTest
Scenario: Mobile user signup page
Given User is on NetBanking landing page
When User sign up with required details
|shivaTest1 |Address1 | +91-88883327871 | shiva1farkade@gmail.com|Akot|
Then Home page is populated
And Cards are not displayed

