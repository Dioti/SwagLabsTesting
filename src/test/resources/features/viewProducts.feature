Feature: View products

  Background: I am logged in

    Scenario: View product listings on the Products page
      Given I am on the Products page
      Then I see a list of products on the Products page

