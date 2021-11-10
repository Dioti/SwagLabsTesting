Feature: I want to view the products

  Background: I am logged in

  Scenario: As a user, I want to see information about each product
    Given I am on the products page
    Then I should see Product Title
    And I should see Product Description
    And I should see Product Price

  Scenario: As a user, I want to see information about each product
    Given I am on the Cart page
    Then I should see Product Title
    And I should see Product Description
    And I should see Product Price
    And I should see Product Quantity