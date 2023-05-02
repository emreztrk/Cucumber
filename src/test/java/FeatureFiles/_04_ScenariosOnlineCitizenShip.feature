#Senaryo
  #CitizenShip sayfasına gidiniz. create işlemini doğrulayınız.
  # daha sonra aynı bilgilerle tekrar create yapılamadıgını doğrulayınız. (negatif test)

  Feature: Citizenship Functionality

    Background:
      Given Navigate to Campus
      When Enter username and password and click login button
      Then user should login successfully
      And Navigate to citizenship page

      Scenario Outline: CitizenShip create
        When User a CitizenShip name as "<name>" short name as "<short>"
        Then Success message should be displayed

        When User a CitizenShip name as "<name>" short name as "<short>"
        Then Already exist message should be displayed

        When User delete the "<name>"
        Then Success message should be displayed

        Examples:
          | name  | short  |
          | emre2 | ozturk |
          | ali2  | ozturk |
          | ahmet2| ozturk |

        #testNG dataProvide burada Scenario Outline olarak krşımıza çıkıyor.