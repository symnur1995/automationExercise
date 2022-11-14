package stepDefinitions.uiStep;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.OrtakPages;
import utilities.ConfigReader;
import utilities.Driver;


public class OrtakSteps {

    OrtakPages ortakPages =new OrtakPages();
    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));

    }
    @Then("Home page de oldugunu dogrular")
    public void home_page_de_oldugunu_dogrular() {

        Assert.assertTrue(ortakPages.homePage.isDisplayed());
    }

    @Then("Signup Login ikonuna tiklar")
    public void signup_login_ikonuna_tiklar() {

        ortakPages.signinButonu.click();
    }

    }
