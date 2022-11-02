package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import pages.TC_08;
import utilities.Driver;

public class TC08_StepDefinition {
    TC_08 page=new TC_08();





    @And("Click on {string} button")
    public void clickOnProductsButton(String productsBtn) {
        page.productLink.click();


    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertTrue(page.saleImage.isDisplayed());
    }

    @And("The products list is visible")
    public void theProductsListIsVisible() throws InterruptedException {
        Assert.assertTrue(page.productsList.isDisplayed());
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("window.scrollBy(0,250)", "");

    }

    @And("Click on {string} of first product")
    public void clickOnViewProductOfFirstProduct(String str) throws InterruptedException {


        page.firstProductView.click();
    }

    @And("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        String expectedUrl="https://www.automationexercise.com/product_details/1";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @And("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        Assert.assertTrue(page.ProductDetails.isDisplayed());
    }





    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String expectedUrl="https://www.automationexercise.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    @Then("close driver.")
    public void closeDriver() {
        Driver.closeDriver();
    }

//    @Given("Launch browser")
//    public void launchBrowser() {
//        Driver.getDriver();
//    }
//
//    @Then("Navigate to url {string}")
//    public void navigateToUrl(String str) {
//
//        Driver.getDriver().get("https://www.automationexercise.com");
//    }


}

