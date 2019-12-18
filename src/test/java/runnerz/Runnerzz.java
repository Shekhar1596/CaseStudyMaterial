package runnerz;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pdc3b-training.pdc3b\\my-workspace\\SeleniumProject\\myfeatures\\login.feature", glue= {"stepdefinations"},tags= {"@UAT,@Smoke"})
public class Runnerzz {

}
