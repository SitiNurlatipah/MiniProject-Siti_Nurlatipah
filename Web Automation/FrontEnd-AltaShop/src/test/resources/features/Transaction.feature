Feature: Register

  Scenario: As a user, i can short the price of product
    Given I am at transaction page
    When I click login-button
    And I type the email landon.mcdermott@hotmail.com
    And I type the password aiueo
    And I go to transaction page
    And I click price field
    Then The table start from lowlest price
