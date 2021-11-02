$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to the application",
  "description": "",
  "id": "login-to-the-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Test",
  "description": "",
  "id": "login-to-the-application;login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter the url \"https://wwww.saucelabs.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I enter the username \"standarduser\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter the password \"secretsauce1\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click submit",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.i_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 352652300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://wwww.saucelabs.com",
      "offset": 17
    }
  ],
  "location": "LoginStepDefinition.i_enter_the_url(String)"
});
formatter.result({
  "duration": 2997700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standarduser",
      "offset": 22
    }
  ],
  "location": "LoginStepDefinition.i_enter_the_username(String)"
});
formatter.result({
  "duration": 143500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secretsauce1",
      "offset": 22
    }
  ],
  "location": "LoginStepDefinition.i_enter_the_password(String)"
});
formatter.result({
  "duration": 183100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_submit()"
});
formatter.result({
  "duration": 102100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_am_logged_in_successfully()"
});
formatter.result({
  "duration": 85900,
  "status": "passed"
});
formatter.uri("logout.feature");
formatter.feature({
  "line": 1,
  "name": "Logout  of the application",
  "description": "",
  "id": "logout--of-the-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "LogOut Test",
  "description": "",
  "id": "logout--of-the-application;logout-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter the url \"https://wwww.saucelabs.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I enter the username \"standarduser\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter the password \"secretsauce1\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click submit",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am logged in successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click logout",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I am logged out of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.i_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 109100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://wwww.saucelabs.com",
      "offset": 17
    }
  ],
  "location": "LoginStepDefinition.i_enter_the_url(String)"
});
formatter.result({
  "duration": 224600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standarduser",
      "offset": 22
    }
  ],
  "location": "LoginStepDefinition.i_enter_the_username(String)"
});
formatter.result({
  "duration": 185800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secretsauce1",
      "offset": 22
    }
  ],
  "location": "LoginStepDefinition.i_enter_the_password(String)"
});
formatter.result({
  "duration": 140300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_submit()"
});
formatter.result({
  "duration": 73900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_am_logged_in_successfully()"
});
formatter.result({
  "duration": 134500,
  "status": "passed"
});
formatter.match({
  "location": "LogOutStepDefinition.i_click_menu()"
});
formatter.result({
  "duration": 248000,
  "status": "passed"
});
formatter.match({
  "location": "LogOutStepDefinition.i_click_logout()"
});
formatter.result({
  "duration": 136600,
  "status": "passed"
});
formatter.match({
  "location": "LogOutStepDefinition.i_am_logged_out_of_the_application()"
});
formatter.result({
  "duration": 81900,
  "status": "passed"
});
});