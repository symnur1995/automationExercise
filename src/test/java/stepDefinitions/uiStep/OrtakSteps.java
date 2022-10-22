package stepDefinitions.uiStep;


import io.cucumber.java.en.Given;
import pages.OrtakPages;
import utilities.ConfigReader;
import utilities.Driver;


public class OrtakSteps {

    OrtakPages ortakPages =new OrtakPages();
    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    }
