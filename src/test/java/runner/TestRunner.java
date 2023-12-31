package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        publish = true,
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports/report.html"},
        tags = "not @ignore"
)
public class TestRunner {

}
