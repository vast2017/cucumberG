package com.cucumber.Login;

import com.cucumber.ActionsWeb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDef extends ActionsWeb {

	loginTestPage ltp = new loginTestPage();
	
	@Given("^User clicks the create new user button$")
	public void user_clicks_the_create_new_user_button() throws Throwable {
		System.out.println("user_clicks_the_create_new_user_button");
		
		ltp.clickNewUserBtn();
		
	}
	
	@Given("^User logs into a valid account$")
	public void user_logs_into_a_valid_account() throws Throwable {
	    ltp.validLoginuser();
	}

	@When("^User handles the popup alert if it exist$")
	public void user_handles_the_popup_alert_if_it_exist() throws Throwable {
	    ltp.handlePopUpAlert();
	}

	@Then("^verify User is in logged in state$")
	public void verify_User_is_in_logged_in_state() throws Throwable {
	    ltp.verifyLoggedInState();
	}
	
	@Given("^User logs in using \"(.*?)\" as username and \"(.*?)\" as password$")
	public void user_logs_in_using_as_username_and_as_password(String uname, String pwd) throws Throwable {
		ltp.validLoginuser(uname, pwd);
	}

	@Then("^verify User is in the \"(.*?)\" state$")
	public void verify_User_is_in_the_state(String exp_state) throws Throwable {
		ltp.logOut_ifUserisloggedIn(exp_state);
		driver.quit();
	}
	

	
}
