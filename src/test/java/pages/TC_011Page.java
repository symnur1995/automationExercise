package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_011Page {
    public TC_011Page(){PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = ".fa.fa-shopping-cart")
    public WebElement cardButton;

    @FindBy(css = ".single-widget")
    public WebElement subcription;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailKutusu;
    @FindBy(css = ".fa.fa-arrow-circle-o-right")
    public WebElement arrowButton;
    @FindBy(xpath = "//div[@class='alert-success alert']")
    public WebElement YouHaveBeenText;
}

