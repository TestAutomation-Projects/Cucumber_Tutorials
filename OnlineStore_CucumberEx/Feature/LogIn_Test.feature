Feature: Login Action
Scenario: Successful login with valid credentials
	Given User is on Home page
	When User Navigate to LogIn Page
	And User enters username and pwd
	Then Message displayed login Successfully
	
Scenario: Successful Logout
	When User Logout from the Application
	Then Message displayed logout Successfully
