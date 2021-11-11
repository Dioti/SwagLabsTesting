Feature: Remove from shopping cart
  Background: I am logged in and there is at least 1 item in the cart
    Scenario: As a user, I want to remove an item from the cart from the products page
      Given I am on the products page
      When I click the remove button
      Then Remove item from cart

    Scenario: As a user, I want to remove an item from the cart from the cart inventory page
      Given I am on the cart inventory page
      When I click the remove button
      Then Remove item from cart
