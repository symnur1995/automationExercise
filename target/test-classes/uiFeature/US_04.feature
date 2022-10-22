Feature: US04 Logout User

  @tc04
  Scenario: TC_04 kullanici cikisi
    Given Kullanici "Url" adresine gider
    Then Home page de oldugunu dogrular
    Then Signup Login ikonuna tiklar
    And "Login to your account" yazisinin gorundugunu test eder.
    Then Gecerli username ve password girer
    Then Login tusuna basar
    And "Logged in as username" yazisinin ciktigini dogrular
    And Logout butonuna tiklar
    And Anasayfaya yonlendirildigini dogrular