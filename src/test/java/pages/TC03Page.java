package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC03Page {


    public TC03Page() {PageFactory.initElements(Driver.getDriver(), this);}




    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement signupLogin;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginToYourAccount;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailAdress;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement incorrectYazi;












}