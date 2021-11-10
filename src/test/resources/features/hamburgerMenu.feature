Feature: To have a burger menu with different options to chose from

  Background: I am logged in

  Scenario: As a user, I want to see all products
    When I click on the burger menu
    And I click the All Items link
    Then I am redirected to the Products page

  Scenario: As a user, I want to view more about the company
    When I click on the burger menu
    And I click the About link
    Then I am redirected to saucelabs.com

  Scenario: As a user, I want to log out
    When I click on the burger menu
    And I click on the log out link
    Then I am logged out and redirected to the log in page

  Scenario: As a user, I want to clear the cart
    When I click on the burger menu
    And I click on Reset App State link
    Then All items in the cart are removed