@tag
Feature: Login to ypur application

@tag1
Scenario: Login to the application
Given Navigate to application
When user click on sign in
	And enter email address as "test902@gmail.com"
	And enter password as "password"
Then login is successful
	
