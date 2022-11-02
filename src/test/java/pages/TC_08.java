package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_08 {

    public TC_08(){
        PageFactory.initElements(Driver.getDriver(),this);
            }

            @FindBy(css=".material-icons.card_travel")
            public WebElement productLink;
            @FindBy(id="sale_image")
            public WebElement saleImage;
            @FindBy(css=".brands_products")
            public WebElement productsList;
            @FindBy(css=".fa.fa-plus-square")
            public WebElement firstProductView;
            @FindBy(css=".product-information")
            public WebElement ProductDetails;


}
