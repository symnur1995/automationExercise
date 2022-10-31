package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TC13Page;
import utilities.Driver;

public class TC13 {

    TC13Page tc13Page =new TC13Page();


    @And("Click {string} for any product on home page")
    public void clickViewProductForAnyProductOnHomePage(String str) {

        int random = Faker.instance().random().nextInt(2, 35);

        WebElement vewProductRandom = Driver.getDriver().findElement(By.xpath("//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div["+random+"]/div[1]/div[2]/ul[1]/li[1]/a[1]"));

        Driver.jsScroolAndClck(vewProductRandom);
    }

    @Then("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {

        Driver.getDriver().getTitle();
    }

    @When("Increase quantity to {int}")
    public void ıncreaseQuantityTo(int arg0) {

        tc13Page.quantity.clear();
        tc13Page.quantity.sendKeys("4");
    }

    @And("Click Add to cart button")
    public void clickAddToCartButton() {

        tc13Page.addToCart.click();
    }

    @And("Click View Cart button")
    public void clickViewCartButton() {

        tc13Page.viewCart.click();
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {

        String expectedText ="4";
        String actualText = tc13Page.sepet.getText();
        Assert.assertEquals(expectedText,actualText);

    }
}
