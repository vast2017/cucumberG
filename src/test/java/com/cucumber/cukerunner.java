package com.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


// JUNIT Implementation 
import org.junit.runner.RunWith;
import org.testng.annotations.Parameters;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

/*
@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/com/cucumber"},
		glue = {"com.cucumber"},
		plugin = {"pretty","html:target/cucumber-html-report","junit:target/cucumber-junit-report/allcukes.xml"},
		tags = {"@search"}
		)


public class cukerunner {

}
*/


@CucumberOptions(features = "src/test",
					tags = "@search",
					glue = {"com.cucumber"}, 
			//		plugin = { "pretty:STDOUT" }, 
					plugin = {"pretty",
					        "html:target/site/cucumber-pretty",
					        "json:target/cucumber.json"},
					dryRun = false)

public class cukerunner extends AbstractTestNGCucumberTests {
	
	
}


