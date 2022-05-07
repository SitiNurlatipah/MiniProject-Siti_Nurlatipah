Feature: Logout

  Scenario: As a user, i can logout of account
    Given I am at transaction page
    When I click people icon
    And I click logout button
    Then I on LoginPage