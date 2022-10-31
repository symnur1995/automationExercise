package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-html-reports/UI_cucumber.html",
                "json:target/json-reports/UI_cucumber.json",
                "junit:target/xml-report/UI_cucumber.xml"},
        features="src/test/resources/uiFeature",
        glue= "src/test/java/stepDefinitions/uiStep",
        tags = "@abcd",
        dryRun = false
)


public class UITestRunner {

}
