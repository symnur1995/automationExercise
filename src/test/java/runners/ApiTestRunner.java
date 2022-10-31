package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin={"html:target/cucumber-html-reports/API_cucumber.html",
                "json:target/json-reports/API_cucumber.json",
                "junit:target/xml-report/API_cucumber.xml"},
        features = "src/test/resources/features/apiFeatures",
        glue = "src/test/java/stepDefinitions/uiStep",
        tags = "@api1",
        dryRun = false
)

public class ApiTestRunner {
}