Feature: Order

  Scenario: As a user, i have able to order and pay product
    Given I am at order page
    When I click login icon
    And I input email landon.mcdermott@hotmail.com
    And I input password aiueo
    And I buy Mousepad
    And I click bayar
    Then I on transaction page