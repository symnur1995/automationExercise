package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TC03Page;

public class TC07 {

    TC03Page tc03Page =new TC03Page();

    @And("Click on Test Cases button")
    public void clickOnTestCasesButton() {

            tc03Page.testCase.click();
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {

        String expectedText="Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:";
        String actualText= tc03Page.stringText.getText();

        Assert.assertEquals(expectedText,actualText);

    }
}
