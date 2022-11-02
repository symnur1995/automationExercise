Feature: TC_10 Verify Subscriptions in home page

  Scenario: TC_10 User Verify Subscriptions
  Given Launch browser
  Then  Navigate to url 'http://automationexercise.com'
  And Verify that home page is visible successfully
  And  Scroll down to footer
  And  Verify text 'SUBSCRIPTION'
  And  Enter email address in input and click arrow button
  And  Verify success message 'You have been successfully subscribed!' is visible
  Then User close Driver