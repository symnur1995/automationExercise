package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrtakPages {
    public  OrtakPages (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
