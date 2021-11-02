Feature: Login to the application
Scenario: Login Test
Given I launch the chrome browser
When I enter the url "https://wwww.saucelabs.com"
And I enter the username "standarduser"
And I enter the password "secretsauce1"
And I click submit
Then I am logged in successfully