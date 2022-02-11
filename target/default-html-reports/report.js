$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Neu Anmelden",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "Create a new account and check alert message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on dashboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "de.coop.step_definitions.LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \"login\"",
  "keyword": "And "
});
formatter.match({
  "location": "de.coop.step_definitions.LoginStepDefinitions.user_clicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks neu registrieren",
  "keyword": "And "
});
formatter.match({
  "location": "de.coop.step_definitions.LoginStepDefinitions.user_clicks_neu_registrieren()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user picks \"Frau\" dann enters Vorname Nachname",
  "keyword": "And "
});
formatter.match({
  "location": "de.coop.step_definitions.LoginStepDefinitions.userPicksDannEntersVornameNachname(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Geburtsdatum",
  "keyword": "And "
});
formatter.match({
  "location": "de.coop.step_definitions.LoginStepDefinitions.userEntersGeburtsdatum()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Anmeldedaten \"varaven42@piftir.com\" und \"Password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "de.coop.step_definitions.LoginStepDefinitions.userEntersAnmeldedatenUnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Kontaktdaten Land \"Deutschland\" Postleitzahl \"52349\" City \"Düren\" Strasse \"Malteserstr\" Hausnummer \"33\" Korrespondenzsprache \"Deutsch\" Mobil-Telefon \"49;DE\" \"17632657173\"",
  "keyword": "And "
});
formatter.match({
  "location": "de.coop.step_definitions.LoginStepDefinitions.userEntersKontaktdatenLandPostleitzahlCityStrasseHausnummerKorrespondenzspracheMobilTelefon(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user accepts Datenschutz",
  "keyword": "And "
});
formatter.match({
  "location": "de.coop.step_definitions.LoginStepDefinitions.userAcceptsDatenschutz()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks register;",
  "keyword": "And "
});
formatter.match({
  "location": "de.coop.step_definitions.LoginStepDefinitions.userClicksRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the alert message",
  "keyword": "And "
});
formatter.match({
  "location": "de.coop.step_definitions.LoginStepDefinitions.userShouldSeeTheAlertMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});