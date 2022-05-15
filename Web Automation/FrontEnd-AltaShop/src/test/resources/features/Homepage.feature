Feature: Homepage

  Scenario: As a user, i can see details product and give rating
    Given I at homepage
    When I click detail product
    And I give rating for product
    Then Rating count added

