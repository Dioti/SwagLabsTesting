Feature: Filter Products

  Background:
    Given I am on the Products page

  Scenario: As a user, I want to sort products by name (A-Z)
    When I click on the filter dropdown
    And I click on the "Name (A to Z)" dropdown option
    Then The filter option should display "NAME (A TO Z)"
    And The products should be displayed alphabetically, in ascending order

  Scenario: As a user, I want to sort products by name (Z-A)
    When I click on the filter dropdown
    And I click on the "Name (Z to A)" dropdown option
    Then The filter option should display "NAME (Z TO A)"
    And The products should be displayed alphabetically, in descending order

  Scenario: As a user, I want to sort products by price (low-high)
    When I click on the filter dropdown
    And I click on "Price (low to high)" dropdown option
    Then The filter option should display "PRICE (LOW TO HIGH)"
    And The products should be displayed by price, in ascending order

  Scenario: As a user, I want to sort products by price (high-low)
    When I click on the filter dropdown
    And I click on "Price (high to low)" dropdown option
    Then The filter option should display "PRICE (HIGH TO LOW)"
    And The products should be displayed by price, in descending order