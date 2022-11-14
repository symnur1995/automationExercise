package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_025Page {

    public TC_025Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(css = ".fa.fa-angle-up")
    public WebElement bottomArrow;
    @FindBy(xpath = "//h2[text()='Full-Fledged practice website for Automation Engineers']")
    public WebElement text;

    @FindBy(css = ".features_items")
    public WebElement text2;
}
