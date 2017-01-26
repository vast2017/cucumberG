@signup_global
Feature: Testing124

Background:
Given I open the browser and navigate to the site
And I am on the homepage

@search_splitted
Scenario: Logging in the user
Given User clicks the signin button
And User logs into a valid account
And User handles the popup alert if it exist
When verify search for "movado" in the globalsearch
And User adds this model 0606897 to the cart
Then verify the right model is added in the cart 