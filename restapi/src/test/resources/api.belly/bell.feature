Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  Scenario: more cukes
    Given I have 23 cukes in my belly
    When I wait 1 hour
    Then my belly should silent