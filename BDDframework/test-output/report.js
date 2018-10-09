$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("f1.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I have site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "F1.i_have_site()"
});
formatter.result({
  "duration": 17833260833,
  "status": "passed"
});
formatter.match({
  "location": "F1.i_enter_username_and_password()"
});
formatter.result({
  "duration": 171045380,
  "status": "passed"
});
formatter.match({
  "location": "F1.i_should_get_logged_in()"
});
formatter.result({
  "duration": 580902264,
  "status": "passed"
});
});