package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.TC_025Page;
import utilities.Driver;

public class TC_025StepDefinition {
    TC_025Page Page=new TC_025Page();

    @And("Scroll down page to bottom")
    public void scrollDownPageToBottom(){
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("window.scrollBy(0,600)", "");
        js.executeScript("window.scrollBy(600,1200)", "");
        js.executeScript("window.scrollBy(1200,1800)", "");
        js.executeScript("window.scrollBy(1800,2400)", "");
        js.executeScript("window.scrollBy(2400,3000)", "");
    }


    @Then("Verify SUBSCRIPTION is visible")
    public void verifySUBSCRIPTIONIsVisible() {
    }

    @And("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() throws InterruptedException {
        Page.bottomArrow.click();
        Thread.sleep(3000);
    }

    @Then("Verify that home page is visible")
    public void verifyThatHomePageIsVisible() {
        Assert.assertTrue(Page.text2.isDisplayed());
    }

    @Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String str) {
        Assert.assertTrue(Page.text.isDisplayed());
    }
}
