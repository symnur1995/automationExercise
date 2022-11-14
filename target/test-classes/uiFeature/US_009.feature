Feature: TC_009
  Scenario:



Given Launch browser
And Navigate to url 'http://automationexercise.com'
#And Verify home page is visible successfully
And Click on 'Products' button
Then Verify user is navigated to ALL PRODUCTS page successfully
And Enter product name in search input and click search button
And Verify SEARCHED PRODUCTS is visible
#Then Verify all the products related to search are visible