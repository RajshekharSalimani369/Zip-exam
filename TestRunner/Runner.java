package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features={"src/test/java/Featurefiles/Login.feature"},
        glue={"StepDefinitions1"},
        dryRun = false,
        monochrome = false
)
public class Runner extends AbstractTestNGCucumberTests {

}
