Feature: Login

  Background:
    Given I am on the Login page

  Scenario: Missing username
    When I type in a valid password in the password field
    And I press the Login button
    Then I should see a "username is required" error message

  Scenario: Missing password
    When I type in a valid username in the username field
    And I press the Login button
    Then I should see a "password is required" error message

  Scenario: Correct username and correct password
    When I type in a valid username in the username field
    And I type in a valid password in the password field
    And I press the Login button
    Then I should login successfully

  Scenario: Correct username and incorrect password
    When I type in a valid username in the username field
    And I type in an invalid password in the password field
    And I press the Login button
    Then I should see an error message about invalid credentials

  Scenario: Incorrect username and correct password
    When I type in an invalid username in the username field
    And I type in a valid password in the password field
    And I press the Login button
    Then I should see an error message about invalid credentials

  Scenario: Incorrect username and incorrect password
    When I type in an invalid username in the username field
    And I type in an invalid password in the password field
    And I press the Login button
    Then I should see an error message about invalid credentials

  Scenario: User is locked out
    Given The user account is locked
    When I type in a valid password in the password field
    And I press the Login button
    Then I should see an error message about the account being locked