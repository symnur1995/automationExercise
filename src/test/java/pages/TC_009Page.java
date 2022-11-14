package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_009Page {
    public TC_009Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = ".material-icons.card_travel")
    public WebElement productlink;
@FindBy(css = ".title.text-center")
    public WebElement allProducttext;

@FindBy(id = "search_product")
    public WebElement searchProductButton;
@FindBy(css = ".fa.fa-search")
    public WebElement searchProductArama;

@FindBy(css = ".title.text-center")
    public WebElement serchedProduct;











}



