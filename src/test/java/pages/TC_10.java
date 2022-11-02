package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_10 {
    public TC_10() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement subscriptionYazisi;
    @FindBy(id = "susbscribe_email")
    public WebElement emailBox;
    @FindBy(id = "subscribe")
    public WebElement arrowBtn;


}
