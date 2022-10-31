package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TC03Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC03 {

    TC03Page tc03Page =new TC03Page();

    @Given("Launch browser")
    public void launchBrowser() {

        Driver.getDriver();
    }
    @And("Navigate to url {string}")
    public void navigateToUrlHttpAutomationexerciseCom(String Url){

        Driver.getDriver().get(Url);
    }
    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String expectedUrl = ConfigReader.getProperty("Url"); //https://automationexercise.com/
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @And("Click on {string} button")
    public void clickOnSignupLoginButton(String str) {

        tc03Page.signupLogin.click();
    }

    @Then("Verify {string} is visible")
    public void verifyLoginToYourAccountIsVisible(String str) {
        Assert.assertTrue(tc03Page.loginToYourAccount.isDisplayed());
    }

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        tc03Page.emailAdress.sendKeys("yenihayat@gmail.com");
        tc03Page.password.sendKeys("10000");

    }

    @Then("Verify error {string} is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible(String text) {
        String expectedText=text;
        String actualText =tc03Page.incorrectYazi.getText();
        Assert.assertEquals(expectedText,actualText);
        tc03Page.incorrectYazi.click();

    }

    @And("Click login button")
    public void clickLoginButton() {
        tc03Page.loginButton.click();

    }
}
