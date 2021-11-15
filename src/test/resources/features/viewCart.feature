Feature: View the shopping cart
  Background: I am logged in
    Scenario: As a user I want to see the contents of my shopping cart
      Given I'm on the products page
      When I click on the cart icon
      Then I want to see the products in my shopping cart

    Scenario: As a user I want to see the details of the items in my shhopping cart
    Given I've added an item to the cart
    When I am on the cart page
    Then I want to see the details of the products in my shopping cart