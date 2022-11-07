package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TC012Page;
import utilities.Driver;

public class MyStepdefs {
    TC012Page page=new TC012Page();
    Actions action=new Actions(Driver.getDriver());
    @And("Hover over first product and click {string}")
    public void hoverOverFirstProductAndClickAddToCart(String str) throws InterruptedException {
       action.sendKeys(Keys.PAGE_DOWN).perform();
       action.moveToElement(page.ProductHover).build().perform();
       page.addToCart.click();



    }

    @And("Click {string} button")
    public void clickContinueShoppingButton(String str) throws InterruptedException {
        page.continueShopping.click();

    }

    @And("Hover over second product and click {string}")
    public void hoverOverSecondProductAndClickAddToCart(String str) throws InterruptedException {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        Actions action1=new Actions(Driver.getDriver());
        action1.moveToElement(page.secondProduct).build().perform();
        page.getAddToCart.click();
        Thread.sleep(1000);
    }

    @And("Click on{string} button")
    public void clickOnViewCartButton(String str) {

        page.viewCart.click();
    }

    @And("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {

        Assert.assertTrue(page.cartMenu.isDisplayed());
    }

    @And("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        Assert.assertTrue("quantity is right",page.quanTity.isDisplayed());
        Assert.assertTrue("total is right",page.toTal.isDisplayed());
        Assert.assertTrue("price is right",page.priCe.isDisplayed());

    }
}
