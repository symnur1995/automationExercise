Feature: TC13

  Scenario:


    Given Launch browser
    And   Navigate to url 'http://automationexercise.com'
    Then  Verify that home page is visible successfully
    And   Click 'View Product' for any product on home page
    Then  Verify product detail is opened
    When  Increase quantity to 4
    And   Click Add to cart button
    And   Click View Cart button
    Then  Verify that product is displayed in cart page with exact quantity