package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC026Page {
    public TC026Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
       @FindBy(id="susbscribe_email")
       public WebElement susbscriptionBox;
       @FindBy(xpath = "(//h2[text()='Full-Fledged practice website for Automation Engineers'])[1]")
       public WebElement fledgeText;
}
