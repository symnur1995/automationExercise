Feature: Verify All Products and product detail page

  Scenario: User verifies all products and product detail pages

  Given  Navigate to url "Url"
  And    Verify that home page is visible successfully
  And    Click on 'Products' button
  And    Verify user is navigated to ALL PRODUCTS page successfully
  And    The products list is visible
  And    Click on 'View Product' of first product
  And    User is landed to product detail page
  And    Verify that detail detail is visible: product name, category, price, availability, condition, brand
  Then   close driver.