Feature: Login LinkedIn Account
Scenario: Ligin with Valid Credentials
Given I launched the Application
When I clicked the username field
And I entered the username
And I clicked the password field
And I entered the password
And I clicked the Sign in button
Then I verified the account got signed in successfully