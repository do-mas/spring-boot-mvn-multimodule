Feature: Invoice

  Scenario: active invoices
    Given there are 2 invoices with pay due date 6 days in future, receiving company Maxima paying company Obuoliai
    When I request a list of active invoices
    Then I receive 2 payable and 0 receivable invoices for Maxima
    And 0 payable and 2 receivable for Obuoliai

