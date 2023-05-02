#Senaryo:
  #Daha önceki Fee Functionality Senaryosunu
  # name, code, intCode, ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature:  Fee multiple value functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then user should login successfully

  Scenario Outline: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from dialog content
      | <name> |

    Then Success message should be displayed
    Examples:
      | name  | code | intCode  | priority |
      | emre  | 789  | payPal   | 3578     |
      | emre1 | 788  | cash     | 3577     |
      | emre2 | 787  | cheque   | 3576     |
      | emre3 | 786  | applePay | 3575     |
      | emre4 | 785  | crypto   | 3574     |