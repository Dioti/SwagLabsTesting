Feature: Filter Products

  Background: I am on the Product page

  Scenario: As a user, I want to sort products by name (A-Z)
    When I click on the filter dropdown
    And I click on the Name (A-Z) dropdown option
    Then The filter option should display Name(A-Z)
    And The products should be displayed alphabetically, in ascending order

  Scenario: As a user, I want to sort products by name (Z-A)
    When I click on the filter dropdown
    And I click on the Name (Z-A) dropdown option
    Then The filter option should display Name(Z-A)
    And The products should be displayed alphabetically, in descending order

  Scenario: As a user, I want to sort products by price (low to high)
    When I click on the filter dropdown
    And I click on Price (low to high) dropdown option
    Then The filter option should display Price (low to high)
    And The products should be displayed by price, in ascending order

    Scenario: As a user, I want to sort products by price (high to low)
      When I click on the filter dropdown
      And I click on Price (high to low) dropdown option
      Then The filter option should display Price (high to low)
      And The products should be displayed by price, in descending order