package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.TC_011Page;
import utilities.Driver;

public class TC_011StepDefinition {

    TC_011Page Page=new TC_011Page();
    @And("Click {string} button")
    public void clickCartButton(String str) {
        Page.cardButton.click();
    }
    @And("Scroll down to footer")
    public void scrollDownToFooter() {
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("window.scrollBy(0,600)", "");
        js.executeScript("window.scrollBy(600,1200)", "");
    }
    @Then("Verify text {string}")
    public void verifyTextSUBSCRIPTION(String str) {
        Assert.assertTrue(Page.subcription.isDisplayed());
    }
    @Then("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {
    Page.emailKutusu.sendKeys("emine123@mailsac.com");
    Page.arrowButton.click();
    }
    @And("Verify success message {string} is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String str) {
        Assert.assertTrue(Page.YouHaveBeenText.isDisplayed());



    }

}
