package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="feature",
		glue={"StepDefinition"},
		format={"pretty","html:test-output"},
		monochrome=true,
		strict=false,
		dryRun=false
		)

public class Runner1 {

}
