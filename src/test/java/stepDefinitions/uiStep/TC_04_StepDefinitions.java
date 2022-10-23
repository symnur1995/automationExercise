package stepDefinitions.uiStep;


import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TC_04;
import utilities.ConfigReader;

public class TC_04_StepDefinitions {
    TC_04 tc_04 =new TC_04();



    @Then("{string} yazisinin gorundugunu test eder.")
    public void yazisinin_gorundugunu_test_eder(String string) {
    Assert.assertTrue(tc_04.LoginYazisi.isDisplayed());
    }
    @Then("Gecerli username ve password girer")
    public void gecerli_username_ve_password_girer() {
    tc_04.emailKutusu.sendKeys(ConfigReader.getProperty("email"));
    tc_04.passwordKutusu.sendKeys(ConfigReader.getProperty("password"));
    }
    @Then("Login tusuna basar")
    public void login_tusuna_basar() {

        tc_04.LoginButonu.click();
    }
    @Then("{string} yazisinin ciktigini dogrular")
    public void yazisinin_ciktigini_dogrular(String string) {

        Assert.assertTrue(tc_04.LoginYazisi.isDisplayed());
    }
    @Then("Logout butonuna tiklar")
    public void logout_butonuna_tiklar() {

        tc_04.logoutButonu.click();
    }
    @Then("Anasayfaya yonlendirildigini dogrular")
    public void anasayfaya_yonlendirildigini_dogrular() {
    Assert.assertTrue(tc_04.orButonu.isDisplayed());
    }

}
