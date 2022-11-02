
Feature:TC01 Register User

  Scenario:As a User I should register


       Given navigate to url "Url"

       And    Click  'Products' button
       And    Verify that Brands are visible on left side bar
       And    Click on any brand name
       And    Verify that user is navigated to brand page and brand products are displayed
       And    On left side bar, click on any other brand link
       And    Verify that user is navigated to that brand page and can see products
       And    Driver close