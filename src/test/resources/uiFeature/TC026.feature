Feature:TC026


  Scenario: Verify Scroll up And down

  Given  Launch browser
  And    Navigate to url 'http://automationexercise.com'
  And    Verify that home page is visible successfully
  And    Scroll down page to bottom
  And    Verify 'SUBSCRIPTION' is visible
  And    Scroll up page to top
  And    Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen