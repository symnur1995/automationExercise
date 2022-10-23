Feature:TC_002
  Scenario:


Given Launch browser
And  Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And  Click on 'Signup / Login' button
Then Verify 'Login to your account' is visible
And  Enter correct email address and password
And  Click login button
Then Verify that 'Logged in as username' is visible
And  Click Delete Account button
Then Verify that 'ACCOUNT DELETED!' is visible