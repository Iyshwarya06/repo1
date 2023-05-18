#Feature: Searching brand names
#Background:
#Given Hello from background
#@brands
#Scenario: Search valid brand names
#Given I launched the application
#When I hovered over the brands tab
#And I searched for ar valid Brand name
#Then I verified that brandname got selected successfully
#@brands-invalid
#Scenario: Search invalid brand names
#Given I launched the application
#When I hovered over the brands tab
#And I searched for ar valid Brand name
#Then I verified that brandname got selected successfully
#@ABC
#Scenario: ABC
#Given I am "Iyshu"
#When I do B
#Then I get C
#Feature: ABC
#@XYZ
#Scenario: ABC
#Given I am "<NameOfPerson>"
#When I do B
#Then I get C
#
#Examples:
#|NameOfPerson|
#|Iyshu|
#|Vimal|
#|Brindu|
#
@XYZ
Scenario: ABC
Given I am A
|Iyshu|10|
|Vimal|10|
When I do B
Then I get C




