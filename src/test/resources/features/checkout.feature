Feature: Checkout

  Scenario: As a user, I want to checkout from the cart page
    Given I am on the cart page
    When I click on the Checkout button
    Then I go to the Checkout Information page

  Scenario: First name, last name and postcode provided in shipping details
    Given I am on the Checkout Information page
    When I fill in all shipping details
    And I click the Continue button
    Then I go to the Checkout Overview page