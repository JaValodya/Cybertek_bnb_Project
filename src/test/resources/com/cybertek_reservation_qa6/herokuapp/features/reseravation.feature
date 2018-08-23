Feature: Student reserving a room

Scenario: Reserve a room as a Student by himself
Given User is on the home page
When the user goes to hunt page
And select the <date> and <time>
And avalible rooms are displayed
Then the book buttons are not visible