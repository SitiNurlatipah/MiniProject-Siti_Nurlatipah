Feature: Login

  Scenario: As a user, i have able to login
    Given I am at login page
    When I type my email landon.mcdermott@hotmail.com
    And I type my password aiueo
    And I click Login button
    Then I on home page