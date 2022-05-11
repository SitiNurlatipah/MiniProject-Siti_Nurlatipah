Feature: Register

  Scenario: As a user, i have able to create account
    Given I am at register page
    When I type fullname Mei Apriliani
    And I type email
    And I type password aiueo
    And I click Register button
    Then I on Login Page

  Scenario: As a user, i have not able to create account
    Given I am on register page
    When I type My fullname Aisyah
    And I type My password 123qwer
    And I click a Register button
    Then I got error massage