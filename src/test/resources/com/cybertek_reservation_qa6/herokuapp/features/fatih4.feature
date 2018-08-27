Feature: Rooms` capacity

@db
Scenario: Verifying 13 rooms with 6 capacity 5 rooms with 4 capacity
Given As a qa_user I logged into cybertekbnb database
When I sent "<select * from room ; >" query
Then Number of rooms would be 13