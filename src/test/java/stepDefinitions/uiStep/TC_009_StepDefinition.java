package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TC_009Page;
import utilities.Driver;

public class TC_009_StepDefinition {
    TC_009Page Page=new TC_009Page();

    @And("Click on {string} button")
    public void clickOnProductsButton(String str) {
        Page.productlink.click();

    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertTrue("sayfa görünüyor",Page.allProducttext.isDisplayed());
    }
    @And("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
        Page.searchProductButton.sendKeys("DRESS");
        Page.searchProductArama.click();
    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {


    }

    @And("Verify home page is visible successfully")
    public void verifyHomePageIsVisibleSuccessfully() {
        String expectedUrl="https://www.automationexercise.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
Assert.assertTrue(Page.serchedProduct.isDisplayed());
    }
}
