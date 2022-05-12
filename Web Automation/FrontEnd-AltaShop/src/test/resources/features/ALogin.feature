Feature: Login

  Scenario: As a user, i have able to login
    Given I am at login-page
    When I type my email landon.mcdermott@hotmail.com
    And I type my password aiueo
    And I click Login button
    Then I on home page

  Scenario: As a user, i have not able to login because password is wrong
    Given I am on loginpage
    When I type valid email landon.mcdermott@hotmail.com
    And I type unvalid password abcdefg
    And I click a Login button
    Then I got error massage "record not found"

  Scenario: As a user, i have not able to login because email is wrong
    Given I on login page
    When I type unvalid email aisyah@gmail.com
    And I type valid password aiueo
    And I click login button
    Then I got Error Massage "record not found"