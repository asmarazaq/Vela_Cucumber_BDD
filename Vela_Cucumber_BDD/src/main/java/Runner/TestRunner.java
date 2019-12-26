package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="/Users/arazaq/Documents/Vela_Cucumber_BDD/src/main/java/Feature/Cucumber_feature"
,glue={"StepDefinition"},
plugin={"html:target/cucumber-html-report"}
)
		
public class TestRunner {

}
