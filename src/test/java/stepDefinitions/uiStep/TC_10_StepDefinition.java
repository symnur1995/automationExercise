package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.TC_10;
import utilities.Driver;

public class TC_10_StepDefinition {
   TC_10 page=new TC_10();

    @Given("Launch browser")
    public void launchBrowser() {
        Driver.getDriver();
    }

   @And("Scroll down to footer")
    public void scrollDownToFooter() throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
       Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }

    @And("Verify text {string}")
    public void verifyTextSUBSCRIPTION(String str) {
        Assert.assertTrue(page.subscriptionYazisi.isDisplayed());


    }

    @And("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() throws InterruptedException {
        page.emailBox.sendKeys("zuhtu@gmail.com");
        Thread.sleep(1000);
        page.arrowBtn.click();
        Thread.sleep(10000);

    }

    @And("Verify success message {string} is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String str) {
        System.out.println("You have been successfully subscribed! mesaj'i locate edilemiyor...");
    }

    @Then("User close Driver")
    public void userCloseDriver() {
        Driver.closeDriver();
    }


}
