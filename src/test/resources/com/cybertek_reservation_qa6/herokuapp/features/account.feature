Feature: Student should see team information in account page.

Scenario: Student should see own team information
Given User is on the home page
When the user hover over to my page
And the user clicks the team
Then team informations should be visible

Scenario: Student should see own information
Given User is on the home page
When the user hover over to my page
And the user clicks the self
Then personal informations should be visible


