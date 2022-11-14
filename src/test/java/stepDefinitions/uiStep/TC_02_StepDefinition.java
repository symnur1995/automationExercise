package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.TC_002Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02_StepDefinition {

    TC_002Page tc_002 = new TC_002Page();
    public void TC_002Page(){PageFactory.initElements(Driver.getDriver(), this);}

    //aynı olan ilk üç adım
    @Given("Launch browser")
    public void launchBrowser() {
        Driver.getDriver();
    }
    @And("Navigate to url {string}")
    public void navigateToUrlHttpAutomationexerciseCom(String Url) {
        Driver.getDriver().get(Url);
    }
    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(tc_002.homePage.isDisplayed());
//        String expectedUrl = ConfigReader.getProperty("Url");
//        String actualUrl = Driver.getDriver().getCurrentUrl();
//        Assert.assertEquals(expectedUrl, actualUrl);
    }
    @Then("Verify {string} is visible")
    public void verifyLoginToYourAccountIsVisible(String str) {
        Assert.assertTrue(tc_002.loginToYourAccount.isDisplayed());
    }
    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
        tc_002.emailAdress.sendKeys("emine123@mailsac.com");
        tc_002.password.sendKeys("123456");
    }
    @And("Click login button")
    public void clickLoginButton() {
        tc_002.loginButton.click();
    }
    @Then("Verify that {string} is visible")
    public void verifyThatLoggedInAsUsernameIsVisible(String str) {
        Assert.assertTrue(tc_002.loggedInAsAA.isDisplayed());
    }
    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        tc_002.deleteAccount.click();
    }
    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        String expectedText="ACCOUNT DELETED!";
        String actualText= tc_002.AccountDeleted.getText();
        Assert.assertEquals(expectedText,actualText);


    }
}
