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


@RegressionTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "IUC" and "Passowrd1234"
Then Home page is populated
And Cards are displayed

@SmokeTest
Scenario: Mobile Home page default login
Given User is on NetBanking landing page
When User login into application with "SHiva" and "Jiva"
Then Home page is populated
And Cards are not displayed

@SmokeTest
Scenario: Mobile user signup page
Given User is on NetBanking landing page
When User sign up with required details
|shivaTest |Address | +91-8888332787 | shivafarkade@gmail.com|Akot|
Then Home page is populated
And Cards are not displayed

@RegressionTest @SmokeTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login into application with <userName> and <Password>
Then Home page is populated
And Cards are displayed


Examples:
|userName |Password |
|Test1    |Password1|
|Test2	  |Password2|
|Test3	  |Password3|
|Test4	  |Password4|
|Test5	  |Password5|
