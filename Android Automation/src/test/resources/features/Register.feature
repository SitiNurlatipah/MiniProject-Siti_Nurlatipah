Feature: Register
  Scenario: As Android user, I can creat account on the app
    Given I on landing page
    When I tap login-icon
    And I tap register link
    And I input full name
    And I input email
    And I input password
    And I tap register button
    Then I on got error massage