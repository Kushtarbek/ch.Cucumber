package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber",  //report of the execution tests
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@googleParameters",
        dryRun = true


)
public class Runner {



}
