Feature: Logout  of the application
Scenario: LogOut Test
Given I launch the chrome browser
When I enter the url "https://wwww.saucelabs.com"
And I enter the username "standarduser"
And I enter the password "secretsauce1"
And I click submit
Then I am logged in successfully
And I click menu
And I click logout
Then I am logged out of the application