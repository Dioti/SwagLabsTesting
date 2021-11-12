Feature: View products

  Background: I am logged in

  Scenario: View product listings on the Products page
    Given I am on the Products page
    Then I see a list of products on the Products page

  Scenario: Navigating to a product page by clicking the product image
    Given I am on the Products page
    And there is at least one product on the Products page
    When I click on the product image
    Then I go to the product page

  Scenario: Navigating to a product page by clicking the product name
    Given I am on the Products page
    And there is at least one product on the Products page
    When I click on the product name
    Then I go to the product page

