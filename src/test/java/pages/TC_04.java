package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_04 {
    public TC_04() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//img[@class='girl img-responsive']")
    public WebElement homePage;

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signinButonu;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement LoginYazisi;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@class='btn btn-default'][1]")
    public WebElement LoginButonu;

    @FindBy(xpath = "//*[text()='Şeyma Nur Yıldırım']")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutButonu;

    @FindBy(xpath = "//div[@class='col-sm-1']")
    public WebElement orButonu;
}
