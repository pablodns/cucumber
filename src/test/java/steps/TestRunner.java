package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features="src/resources/Features", glue = {"steps"}, monochrome = true, plugin = {"pretty", "html:target/HTMLReport/report.html"})
//@CucumberOptions(features="src/resources/Features", glue = {"steps"}, monochrome = true, plugin = {"json", "json:target/JSONReport/report.json"})
//@CucumberOptions(features="src/resources/Features", glue = {"steps"}, monochrome = true, plugin = {"pretty", "junit:target/JUNITReport/report.xml"})
@CucumberOptions(
		features="src/resources/Features"
		,glue = {"steps"}
		,monochrome = true 
		,plugin = {"pretty", "junit:target/JUNITReport/report.xml", "json:target/JSONReport/report.json","html:target/HTMLReport/report.html"}
		//,tags = "@TestScenario1 or @SmokeTest")
		//,tags = "@FirstTestFeature"
)
public class TestRunner {

}
