package stepDefinitions.uiStep;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.TC19_Page;

import utilities.ConfigReader;
import utilities.Driver;

public class TC19_StepDefinitions {
    TC19_Page page=new TC19_Page();
    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());


    @Given("navigate to url {string}")
    public void navigateToUrl(String arg0) {



        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }


    @And("Click  {string} button")
    public void clickProductsButton(String str) {

        page.productsButton.click();



    }

    @And("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() throws InterruptedException {
        Assert.assertTrue(page.brandsNames.isDisplayed());


    }

    @And("Click on any brand name")
    public void clickOnAnyBrandName() throws InterruptedException {

        js.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(2000);
        page.HM.click();

    }

    @And("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        Assert.assertTrue(page.BrandHm.isDisplayed());


    }

    @And("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        page.biBa.click();

    }

    @And("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        Assert.assertTrue(page.brandBiba.isDisplayed());
    }

    @And("Driver close")
    public void driverClose() {
        Driver.closeDriver();
    }



}
