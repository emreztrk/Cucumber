#Senaryo

  # siteye git -> test case -> adım
  # login bilgilerini gir
  # siteye girdiğini doğrula

  Feature: Login Funtionality

    Scenario: Login with valid username and password

      Given Navigate to Campus
      When Enter username and password and click login button
      Then user should login successfully