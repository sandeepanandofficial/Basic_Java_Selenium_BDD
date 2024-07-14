package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".\\src\\test\\java\\featureFiles\\Login.feature",
		glue = "stepDefinition",
		dryRun = false
		//true - for the feature file step definition methods will be generated
		//			copy it and paste in step definition
		//false - browser will be launched and execution will take place
		)

public class RunnerIO extends AbstractTestNGCucumberTests{

}
