package trailCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/IY20463954/Documents/Assignments/IRCTC/src/main/java/trailCucumber/loginTest.feature"
		,glue={"trailCucumber"}
		)

public class Runner {
	
	

}
