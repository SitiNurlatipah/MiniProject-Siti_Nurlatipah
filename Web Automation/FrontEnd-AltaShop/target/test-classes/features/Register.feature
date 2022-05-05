Feature: Register

  Scenario: As a user, i have able to create account
    Given I am at register page
    When I type fullname Mei Apriliani
    And I type email
    And I type password aiueo
    And I click Register button
    Then I on Login Page