package com.cucumber.Search;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_StepDef {

	searchTestPage stp = new searchTestPage();
	
	@When("^verify search for \"(.*?)\" in the globalsearch$")
	public void verify_search_for_in_the_globalsearch(String name) throws Throwable {
		stp.searchItem(name);
	}

	@When("^User adds this model (\\d+) to the cart$")
	public void user_adds_this_model_to_the_cart(int item_number) throws Throwable {
		stp.addItemCart(item_number);		
	}

	@Then("^verify the right model is added in the cart$")
	public void verify_the_right_model_is_added_in_the_cart() throws Throwable {
		stp.verifyItemCart();
	}
	
}
