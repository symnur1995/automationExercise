package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.TC_002Page;
import utilities.ConfigReader;

public class TC_002StepDef {
    TC_002Page tc_002 =new TC_002Page();


    @Given("Launch browser")
    public void launchBrowser() {
        String expectedUrl = ConfigReader.getProperty("Url");
        String actualUrl= utulities.Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @And("Navigate to url {string}")
    public void navigateToUrlHttpAutomationexerciseCom() {


    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        tc_002.signupLogin.click();
    }

    @And("Click on {string} button")
    public void clickOnSignupLoginButton() {
    }

    @Then("Verify {string} is visible")
    public void verifyLoginToYourAccountIsVisible() {

        Assert.assertTrue(tc_002.loginToYourAccount.isDisplayed());
    }

    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
    }

    @And("Click login button")
    public void clickLoginButton() {
        tc_002.loginButton.click();
    }

    @Then("Verify that {string} is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
    }

    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
    }
}
