package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC13Page {

    public TC13Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "View Product")
    public WebElement viewProduct;

    @FindBy(xpath = "//input[@id='quantity']")
    public WebElement quantity;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//button[normalize-space()='4']")
    public WebElement sepet;

    //div[@class='footer-widget']//div[@class='row']




}

