$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/GoogleParameters.feature");
formatter.feature({
  "name": "Google search functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@googleParameters"
    }
  ]
});
formatter.scenario({
  "name": "Testing google search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@googleParameters"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User is on google homepage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters \"phones\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should see \"phones\" in the title",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});