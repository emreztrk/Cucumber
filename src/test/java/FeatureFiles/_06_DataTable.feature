Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then user should login successfully

  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | emreUlk2 |
      | codeInput | 1234     |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from dialog content
      | emreUlk2 |

    Then Success message should be displayed

  @Regression
  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | emreCan1 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from dialog content
      | emreCan1 |

    Then Success message should be displayed

    @Regression
  Scenario: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | emreCan2 |
      | codeInput       | 123   |
      | integrationCode | 123 |
      | priorityCode    | 123    |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from dialog content
      | emreCan2 |

    Then Success message should be displayed
