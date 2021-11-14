Feature: To have social media links

  Background: I am on the Swaglabs website
    Given The user is logged in

  Scenario: As a user, I want to go to the company's Twitter page
    When I click on the Twitter icon
    Then I should be redirected to the company's Twitter profile

  Scenario: As a user, I want to go the company's Facebook page
    When I click on the Facebook icon
    Then I should be redirected to the company's Facebook profile

  Scenario: As a user, I want to go to the company's Linkedin page
    When I click on the Linkedin icon
    Then I should be redirected to the company's Linkedin profile

  Scenario: As an admin, I want the company's copyright text to be displayed in the footer
    Then I should see the copyright text at the bottom of the page





