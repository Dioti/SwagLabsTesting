Feature: Checkout

  Scenario: Checkout from the cart page
    Given I am viewing the shopping cart
    When I click the Checkout button
    Then I go to the Checkout Information page

  Scenario: Submit all shipping details
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

  Scenario: Finalise checkout
    Given I am on the Checkout Overview page
    When I press the Finish button
    Then I go to the Checkout Complete page

  Scenario: Edit shipping details from the Checkout Overview page
    Given I am on the Checkout Overview page
    When I press the Cancel button
    Then I go to the Checkout Information page