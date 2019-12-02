$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
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
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "some other precondition",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I complete action",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "some other action",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "yet another action",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "check more outcomes",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "duration": 168762600,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.some_other_precondition()"
});
formatter.result({
  "duration": 94181,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.i_complete_action()"
});
formatter.result({
  "duration": 73417,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.some_other_action()"
});
formatter.result({
  "duration": 188130,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.yet_another_action()"
});
formatter.result({
  "duration": 1015438,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.i_validate_the_outcomes()"
});
formatter.result({
  "duration": 88226,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.check_more_outcomes()"
});
formatter.result({
  "duration": 193550,
  "status": "passed"
});
});