Feature: Room verify

@aa
Scenario: Asserting selected book Date & Time
Given As a team leader I logged into web page
When I clicked on the hunt button
And I chose 8/15/2018
Then Selected available hours 1.00 - 3.00 for Stanford Room
Then I should be able to see on 8/15 from 1:00pm to 3:00pm