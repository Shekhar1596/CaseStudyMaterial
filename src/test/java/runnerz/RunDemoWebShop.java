package runnerz;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pdc3b-training.pdc3b\\my-workspace\\SeleniumProject\\myfeatures\\DemoWebShop.feature", glue= {"stepdefinations"})

public class RunDemoWebShop {

}
