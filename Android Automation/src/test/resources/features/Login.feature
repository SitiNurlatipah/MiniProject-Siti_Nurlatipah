Feature: Login
  Scenario: As Android user, I can login to the app
    Given I on homepage
    When I tap login icon
    And I type email alexa@email.com
    And I type password 123123123
    And I tap login button
    Then I get Error Massage
