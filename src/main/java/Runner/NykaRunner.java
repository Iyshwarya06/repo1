package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/IY20463954/Documents/Assignments/IRCTC/src/main/java/Features/BrandSearchFeature.feature"
		,glue={"Bindings"},
		tags="@XYZ",
		dryRun=true,
		monochrome=true
		,plugin= {"pretty","html:target/cucumber-reports"}
		)
public class NykaRunner {

}
