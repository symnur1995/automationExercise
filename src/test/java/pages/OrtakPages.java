package pages;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrtakPages {

    public  OrtakPages (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@class='girl img-responsive']")
    public WebElement homePage;

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signinButonu;



}
