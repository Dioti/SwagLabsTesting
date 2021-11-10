Feature:  Add to shopping cart.
  Background: I am logged in.
    Scenario: As a user, I want to add items to the shopping cart
      Given I am on the products page
      When  I click the "Add To Cart" button next to an item
      Then  the item is added to cart
