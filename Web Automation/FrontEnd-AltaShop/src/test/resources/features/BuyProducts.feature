Feature: Buy Product

  Scenario: As a user, i have able to buy a product and add to chart
    Given I at login page
    When I enter email landon.mcdermott@hotmail.com
    And I enter password aiueo
    And First I buy Tensi Darah Eelktrik
    And Second I buy Camera
    And Third I buy Cincin Emas
    And I click chart button
    Then I on order page and The product I bought it is here


  Scenario: As a user, i have not able to buy a product and add to chart
    Given I am at home page
    When First I click beli button on Tensi Darah Eelktrik
    And Second I click beli button on Camera
    And Third I click beli button on Cincin Emas
    Then The number of chart increased

