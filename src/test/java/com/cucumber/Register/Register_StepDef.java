package com.cucumber.Register;

import com.cucumber.ActionsWeb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_StepDef {
	
	registerTestPage rtp = new registerTestPage();

	@When("^User fills the \"(.*?)\" field as firstname$")
	public void user_fills_the_field_as_firstname(String firstname) throws Throwable {
		rtp.firstname(firstname);
	}

	@When("^User fills the \"(.*?)\" field as lastname$")
	public void user_fills_the_field_as_lastname(String lastname) throws Throwable {
		rtp.lastname(lastname);
	}

	@When("^User fills the \"(.*?)\" field as email$")
	public void user_fills_the_field_as_email(String email) throws Throwable {
		rtp.email(email);
	}

	@When("^User fills the \"(.*?)\" field as password$")
	public void user_fills_the_field_as_password(String password) {
		rtp.password(password);
	}

	@When("^User select the \"(.*?)\" field as dobMonth$")
	public void user_select_the_field_as_dobMonth(String month) throws Throwable {
		rtp.dob_month(month);
	}

	@When("^User select the (\\d+) field as dobDay$")
	public void user_select_the_field_as_dobDay(int day) throws Throwable {
		rtp.dob_day(day);
	}

	@When("^User select the (\\d+) field as dobYear$")
	public void user_select_the_field_as_dobYear(int year) throws Throwable {
		rtp.dob_year(year);
	}
	
	@Then("^I see a user created$")
	public void i_see_a_user_created() throws Throwable {
		rtp.clickCreateUserBtn();
	}	
	

}
