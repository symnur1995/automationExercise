Feature:TC_002
  Scenario:


    Given Kullanici "Url" adresine gider
    Then Home page de oldugunu dogrular
    Then Signup Login ikonuna tiklar
    Then Verify 'Login to your account' is visible
    And  Enter correct email address and password
    And  Click login button
    Then Verify that 'Logged in as username' is visible
    And  Click Delete Account button
    Then Verify that 'ACCOUNT DELETED!' is visible