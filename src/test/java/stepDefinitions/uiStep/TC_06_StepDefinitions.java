package stepDefinitions.uiStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC_06;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_06_StepDefinitions {

    TC_06 page = new TC_06();

//    @When("User Launch Browser")
//    public void UserLaunchBrowser() {
//     Driver.getDriver();
//
//    }
    @Given("User navigate to  {string}")
    public void userNavigateTo(String arg0) {
        Driver.getDriver().get("https://www.automationexercise.com");
    }

    @Given("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() throws InterruptedException {
      Assert.assertTrue(page.logo.isDisplayed());
      Thread.sleep(1000);
    }
    @Given("User Click on {string} button")
    public void userClickOnContactUsButton(String ContactUs) {
      page.contactUsLink.click();
    }

    @Given("User Verify {string} is visible successfully")
    public void userVerifyGETINTOUCHIsVisibleSuccessfully(String GETINTOUCH) {
        Assert.assertTrue(page.getInTouchTitle.isDisplayed());
    }


    @Given("User Enters  name, email, subject and message")
    public void userEntersNameEmailSubjectAndMessage() {


     page.getInTouchName.sendKeys("mahmut");
     page.getInTouchEmail.sendKeys("mahmut@gmail.com");
     page.getInTouchSubject.sendKeys("Forest");
     page.getInTouchMessage.sendKeys("I love tree.I love flowers.I love nature.");

    }

    @Given("User upload file")
    public void user_upload_file() throws InterruptedException {
        page.DosyaSec.sendKeys("/C:/Users/QP/Downloads/cozum.jpg");
        Thread.sleep(3000);

    }



    @Given("User click {string} button")
    public void userClickSubmitButton(String Submit) {
        page.getInTouchSubmit.click();
    }


    @Given("User click  Click OK button")
    public void userClickClickOKButton() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Given("User Verify success message {string} is visible")
    public void userVerifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible(String Success) {
            Assert.assertTrue(page.successMessage.isDisplayed());

    }


    @Then("User Click {string} button and verify that landed to home page successfully")
    public void userClickHomeButtonAndVerifyThatLandedToHomePageSuccessfully(String homeBtn) {
        page.homeBtn.click();
        Assert.assertTrue(page.logo.isDisplayed());
    }
}