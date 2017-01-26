package com.cucumber.Home;

import com.cucumber.Login.loginTestPage;

import cucumber.api.java.en.Given;

public class Home_StepDef {

	homeTestPage htp = new homeTestPage();

	@Given("^I open the browser and navigate to the site$")
	public void i_open_the_browser_and_navigate_to_the_site() throws Throwable {
		
		htp.browserOpen();
		htp.navigate();
	}


	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable {
	    System.out.println("i_am_on_the_homepage");
	}
	
	
	
	@Given("^User clicks the signin button$")
	public void user_clicks_the_signin_button() throws Throwable {
		System.out.println("user_clicks_the_signin_button_and");
		
		loginTestPage ltp = new loginTestPage();
		htp.clicksignInBtn();
		
	}
	
	
}
