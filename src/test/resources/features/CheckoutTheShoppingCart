Feature: Checkout the shopping cart
  Background: click checkout button in shopping cart
    Scenario: Entering information for the fields
      Given I provide information in the relavent fields
      When I click continue
      Then go to confirmation page

    Scenario: Leaving fields blank
      Given I don't write anything in one or more fields
      When I click continue
      Then remain on this page and show an error message

    Scenario: Checkout  confirmation
      Given I am on the confirmation page of checkout
      When I click finish
      Then Display a thank you message