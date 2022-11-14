Feature: TC_011
 Scenario:



Given Launch browser
Then Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click 'Cart' button
And Scroll down to footer
Then Verify text 'SUBSCRIPTION'
Then Enter email address in input and click arrow button
And Verify success message 'You have been successfully subscribed!' is visible