package com.cucumber.Register;

import com.cucumber.ActionsWeb;

public class registerTestPage{
	
	public static void firstname(String first){
		ActionsWeb.sendkeys("firstName",first);
	}
	
	public static void lastname(String last){
		ActionsWeb.sendkeys("lastName", last);		
		
	}

	public static void email(String email){
		ActionsWeb.sendkeys("email", email);
		
	}
	
	public static void password(String password){
		ActionsWeb.sendkeys("password", password);
	}

	public static void dob_month(String month){
		ActionsWeb.dropDown("month",month);
	}


	public static void dob_day(int dayvijay){
		ActionsWeb.dropDown("day",String.valueOf(dayvijay));
	
	}

	public static void dob_year(int year){
		ActionsWeb.dropDown("year",String.valueOf(year));
		
	}

	public static void clickCreateUserBtn(){
		ActionsWeb.click("#createProfileBtn");
	}



}
