package StepDefinision;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "StepDefinision",  
    plugin = {"pretty","html:target/htmlReport.html"},
    monochrome = true
)

public class TestRunner {

}
