package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_06 {

    public TC_06(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = ".logo.pull-left")
    public WebElement logo;
    @FindBy(css = ".fa.fa-envelope")
    public WebElement contactUsLink;
    @FindBy(css = ".title.text-center")
    public WebElement getInTouchTitle;
    @FindBy(name = "name")
    public WebElement getInTouchName;
    @FindBy(name = "email")
    public WebElement getInTouchEmail;
    @FindBy(name = "subject")
    public WebElement getInTouchSubject;
    @FindBy(name = "message")
    public WebElement getInTouchMessage;
    @FindBy(name = "submit")
    public WebElement getInTouchSubmit;
    @FindBy(css=".status.alert.alert-success")
    public WebElement  successMessage;
    @FindBy(css=".btn.btn-success")
    public WebElement homeBtn;
    @FindBy(name = "upload_file")
    public WebElement DosyaSec;

}
