@aut
  Feature: Contact Us form

    Scenario:Fills in the contact us form with valid credentials


   Given Kullanici "Url" adresine gider
   Then Home page de oldugunu dogrular
   Given  User Click on 'Contact Us' button
   Given  User Verify 'GET IN TOUCH' is visible successfully
   Given  User Enters  name, email, subject and message
   Given User click 'Submit' button
   Given User click  Click OK button
   Given User Verify success message 'Success! Your details have been submitted successfully.' is visible
   Then  User Click 'Home' button and verify that landed to home page successfully







