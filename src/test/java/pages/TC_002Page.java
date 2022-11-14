package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_002Page {

    public TC_002Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginToYourAccount;

//    @FindBy(xpath = "//input[@data-qa='login-email']")
  //  public WebElement emailAdress;

    //@FindBy(xpath = "(//input[@type='password'])[1]")
    //public WebElement password;

    //@FindBy(xpath = "(//button[@type='submit'])[1]")
    //public WebElement loginButton;

    @FindBy(xpath="//li[10]//a[1]")
    public WebElement loggedInAsAA;

    @FindBy(xpath="//a[normalize-space()='Delete Account']")
    public WebElement deleteAccount;

    @FindBy(css = ".title.text-center")
    public WebElement AccountDeleted;


    @FindBy(xpath = "//img[@class='girl img-responsive']")
    public WebElement homePage;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailAdress;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginButton;
}
