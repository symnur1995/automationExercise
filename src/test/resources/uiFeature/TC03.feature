Feature: TC03



  Scenario:
    Given Kullanici "Url" adresine gider
    Then  Home page de oldugunu dogrular
    Then  Signup Login ikonuna tiklar
    Then  Verify 'Login to your account' is visible
    And   Enter incorrect email address and password
    And   Click login button
    Then  Verify error 'Your email or password is incorrect!' is visible