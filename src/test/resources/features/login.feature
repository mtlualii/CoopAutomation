
# This scenario allows us to create a new account for Online-Supermarkt
# I could not automate the Captcha at the end (It should not be automated actually, but it can be disabled by developers for test environment)
# That's why at the end I check it whether I get the alertMessage ("Recaptcha war nicht gültig")


@wip
Feature: Neu Anmelden

  Scenario: Create a new account and check alert message
    Given user is on dashboard page
    And user clicks "login"
    And user clicks neu registrieren
    And user picks "Frau" dann enters Vorname Nachname
    And user enters Geburtsdatum
    And user enters Anmeldedaten "varaven42@piftir.com" und "Password123"
    And user enters Kontaktdaten Land "Deutschland" Postleitzahl "52349" City "Düren" Strasse "Malteserstr" Hausnummer "33" Korrespondenzsprache "Deutsch" Mobil-Telefon "49;DE" "17632657173"
    And user accepts Datenschutz
    And user clicks register;
    And user should see the alert message
