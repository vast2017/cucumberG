@signup_global
Feature: Testing124

Background:
Given I open the browser and navigate to the site
And I am on the homepage
     
@signup
Scenario: registering an account in macys.com
Given User clicks the signin button 
And User clicks the create new user button
When User fills the "cukefirst" field as firstname
And User fills the "cukelast" field as lastname
And User fills the "cukef@yahoo.com" field as email
And User fills the "autoPassword" field as password
And User select the "May" field as dobMonth
And User select the 10 field as dobDay
And User select the 1991 field as dobYear
Then I see a user created

@login
Scenario: Logging in the user
Given User clicks the signin button
And User logs in using "cukef@yahoo.com" as username and "autoPassword" as password
And User handles the popup alert if it exist
Then verify User is in the "valid" state


@loginOutline
Scenario Outline: Logging multiple users
Given User clicks the signin button
And User logs in using "<username>" as username and "<password>" as password
And User handles the popup alert if it exist
Then verify User is in the "<status>" state

Examples:
| username 	| password 			| status 		|	
|	cukebad		|autoPassword		|	invalid		|
|	cukefirst	|autobad					|	invalid		|
|	cukef@yahoo.com	|autoPassword		|	valid			|
|						|								|	invalid		|
|			null		|								|	invalid		|


@search
Scenario: Logging in the user
Given User clicks the signin button
And User logs into a valid account
And User handles the popup alert if it exist
When verify search for "movado" in the globalsearch
And User adds this model 0606897 to the cart
Then verify the right model is added in the cart 

@parallel
Scenario: Logging in the user
Given User clicks the signin button
