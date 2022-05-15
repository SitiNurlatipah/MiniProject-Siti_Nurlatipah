Feature: Logout

  Scenario: As a user, i can logout of account
    Given I on login-page
    When I input my email landon.mcdermott@hotmail.com
    And I input my password aiueo
    And I on landing page
    And I click people-icon
    And I click logout button
    Then I on LoginPage