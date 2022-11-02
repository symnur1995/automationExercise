package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC19_Page {
    public TC19_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css=".fa.fa-lock")
    public WebElement signUpLink;
    @FindBy(xpath="//h2[text()='New User Signup!']")
    public WebElement newUserSignup;
    @FindBy(xpath="//input[@data-qa='signup-name']")
    public WebElement NameBox;
    @FindBy(xpath="//input[@data-qa='signup-email']")
    public WebElement EmailBox;
    @FindBy(xpath="//input[@data-qa='signup-button']")
    public WebElement signUpBtn;
    @FindBy(xpath="//b[text()='Enter Account Information']")
    public WebElement accountInfo;
    @FindBy(id="id_gender1")
    public WebElement Mr;
    @FindBy(id="id_gender2")
    public WebElement Mrs;
    @FindBy(id="password")
    public WebElement passBox;
    @FindBy(id="days")
    public WebElement days;
    @FindBy(id="months")
    public WebElement months;
    @FindBy(id="years")
    public WebElement years;
    @FindBy(id="newsletter")
    public WebElement newsCheckBox;
    @FindBy(id="optin")
    public WebElement ReceiveCheckBox;
    @FindBy(id="first_name")
    public  WebElement FirstName;
    @FindBy(id="last_name")
    public WebElement LastName;
    @FindBy(id="address1")
    public WebElement address1;
    @FindBy(id="country")
    public WebElement Country;
    @FindBy(id="state")
    public WebElement State;
    @FindBy(id="city")
    public WebElement city;
    @FindBy(id="zipcode")
    public WebElement zipcode;
    @FindBy(id="mobile_number")
    public WebElement mobileNumber;
    @FindBy(xpath="//button[@data-qa='create-account']")
    public WebElement createAccountButton;

    @FindBy(css=".material-icons.card_travel")
    public WebElement productsButton;
    @FindBy(css=".brands_products")
    public WebElement brandsNames;
    @FindBy(xpath = "(//span[@class='pull-right'])[2]")
    public WebElement HM;
    @FindBy(css=".title.text-center")
    public WebElement BrandHm;
    @FindBy(xpath = "(//span[@class='pull-right'])[8]")
    public WebElement biBa;
    @FindBy(css=".title.text-center")
    public WebElement brandBiba;










}
