$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/JANBASK/OCT_WEEKDAY_BATCH/BDD_FRAMEWOK/src/main/java/Features/LogOut.feature");
formatter.feature({
  "line": 1,
  "name": "Logout of the application",
  "description": "",
  "id": "logout-of-the-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "LogOut",
  "description": "",
  "id": "logout-of-the-application;logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter the username \"standard_user\" and enter the password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I click submit",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I logOut",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 5122265900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 22
    },
    {
      "val": "secret_sauce",
      "offset": 61
    }
  ],
  "location": "LoginStepDefinition.i_enter_the_username_and_enter_the_password(String,String)"
});
formatter.result({
  "duration": 421349300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_submit()"
});
formatter.result({
  "duration": 543275300,
  "status": "passed"
});
formatter.match({
  "location": "LogOutStepDefintion.i_logOut()"
});
formatter.result({
  "duration": 2436352500,
  "status": "passed"
});
});