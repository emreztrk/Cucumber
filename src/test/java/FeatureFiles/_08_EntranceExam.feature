#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız

Feature:  Exam Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then user should login successfully

  Scenario: Exam Create and DeleteEntrance Exam
    And Click on the element in LeftNav
      | entranceExam  |
      | examSetup     |
      | entranceExam2 |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | emre1 |

    And Click on the element in Dialog
      | academicPeriod  |
      | academicPeriod2 |
      # iki kere tıklatıyoruz, 1. açılması için 2. tıklaması için
      | gradeLevel      |
      | gradeLevel2     |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in LeftNav
      | entranceExam  |
      | examSetup     |
      | entranceExam2 |
      # silmek için bu leftNav daki menülere tekrar tıklattık

    And User delete item from dialog content
      | emre1 |

    And Click on the element in Dialog

    Then Success message should be displayed







