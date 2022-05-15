Feature: Homepage
  Scenario: As Android user, I can buy product and add to chart
    Given I am on homepage
    When I tap beli button on Durian
    Then The number on the chart increased 1