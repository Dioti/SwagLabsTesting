Feature: Checkout

  Scenario: As a user, I want to checkout from the cart page
    Given I am viewing the shopping cart
    When I click the Checkout button
    Then I go to the Checkout Information page

  Scenario: First name, last name and postcode provided in shipping details
    Given I am on the Checkout Information page
    When I fill in all shipping details
    And I click the Continue button
    Then I go to the Checkout Overview page

  Scenario: First name is missing from shipping details
    Given I am on the Checkout Information page
    When I fill in last name
    And I fill in postcode
    And I click the Continue button
    Then I see a "First Name is required" error message