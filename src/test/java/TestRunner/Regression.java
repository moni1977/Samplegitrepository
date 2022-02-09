package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 
features = {"src/test/java/Features"},		
glue = {"StepDefCucumber"},
tags = "@UAT",
plugin = {"pretty","html:target/cucumber-reports"}
//		features= {"src/Features"},
//		 glue= {"StepDefCucumber"},
//		 plugin= {"pretty","html:target/cucumber-reports"}
		
	)
public class Regression {

}
