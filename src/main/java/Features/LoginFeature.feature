Feature: Login feature
Background:
Given I am from Nyka page Scenarios

Scenario: Search in nyka website with valid data
Given I launch the application
When I clicked on search area
And I entered the product name
And I selected the data from the suggestions
Then I verified that search result

Scenario: Search in nyka website without clicking on search field
Given I launch the application
And I entered the product name
And I selected the data from the suggestions
Then I verified that search result