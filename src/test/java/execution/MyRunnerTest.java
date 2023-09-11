package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/Features", // Location of your feature files
	    glue = "steps", // Location of your step definition classes
	    tags = "@Success" // Specify which scenarios to run based on tags
	)
public class MyRunnerTest extends AbstractTestNGCucumberTests {

}
