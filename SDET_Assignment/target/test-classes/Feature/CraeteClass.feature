@tag
Feature: To verify whether application allows admin to create class
Scenario: Validate succesful creation of class for admin
Given user should have launched the application
When user should have logged in as admin and present in home screen
And click on administration tab
And click on classes link
And click on add classes icon
And Enter valid credentials
And Click on add button 
Then Item added message should get display