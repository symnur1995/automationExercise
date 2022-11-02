package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TC026Page;
import utilities.Driver;

public class TC026_StepDefinition {

     TC026Page page=new TC026Page();
     Actions actions=new Actions(Driver.getDriver());
    @And("Scroll down page to bottom")
    public void scrollDownPageToBottom() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @And("Verify {string} is visible")
    public void verifySUBSCRIPTIONIsVisible(String str) {
        Assert.assertTrue(page.susbscriptionBox.isDisplayed());

    }

    @And("Scroll up page to top")
    public void scrollUpPageToTop() {
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();



    }

    @And("Verify that page is scrolled up and {string} text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String str) {
        Assert.assertTrue(page.fledgeText.isDisplayed());
    }

    @Given("Launch browser")
    public void launchBrowser() {
        Driver.getDriver();
    }
}
