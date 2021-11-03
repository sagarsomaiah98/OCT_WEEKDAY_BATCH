$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/JANBASK/OCT_WEEKDAY_BATCH/BDD_Cucumber_Sample/Features/OrangeLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login to orange hrm application",
  "description": "",
  "id": "login-to-orange-hrm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Orange Test",
  "description": "",
  "id": "login-to-orange-hrm-application;login-orange-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I launch the Firefox Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I navigate to url",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I enter the username",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter the password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginOrangeStepDefinition.i_launch_the_Firefox_Browser()"
});
formatter.result({
  "duration": 6612741400,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangeStepDefinition.i_navigate_to_url()"
});
formatter.result({
  "duration": 7843279100,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangeStepDefinition.i_enter_the_username()"
});
formatter.result({
  "duration": 106830700,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangeStepDefinition.i_enter_the_password()"
});
formatter.result({
  "duration": 60740200,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangeStepDefinition.i_click_on_login()"
});
formatter.result({
  "duration": 7022368800,
  "status": "passed"
});
formatter.match({
  "location": "LoginOrangeStepDefinition.i_am_on_home_page()"
});
formatter.result({
  "duration": 80252500,
  "status": "passed"
});
});