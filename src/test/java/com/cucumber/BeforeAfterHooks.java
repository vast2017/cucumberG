package com.cucumber;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAfterHooks {
	
	@Before
	public void beforeScenario(Scenario scenario) {

		String scenarioName = scenario.getName();
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Executing Scenario : " + scenarioName);
		System.out.println("------------------------------------------------------------------------");
	}


	@After
	public void afterScenario(Scenario scenario) {
		
	}

	public void embedScreenshot(Scenario scenario) {
		
	}
}