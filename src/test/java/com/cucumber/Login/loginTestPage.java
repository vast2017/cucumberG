package com.cucumber.Login;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.cucumber.ActionsWeb;

public class loginTestPage extends ActionsWeb{

	public static void clickNewUserBtn(){
		ActionsWeb.click("#createProfileContainer");
	}
	//selauto1@yahoo.com
	public static void validLoginuser(){
		ActionsWeb.sendkeys("email","cukef@yahoo.com");	
		ActionsWeb.sendkeys("password","autoPassword");	
		ActionsWeb.click("#signInBtn");	
	
	}
	
	public static void handlePopUpAlert(){
		if((driver.getPageSource()).contains("Our records show that you")){
			ActionsWeb.dropDown("snssecurityqna", "What was the name of your first pet?");
			ActionsWeb.sendkeys("securityAnswer","mypetname");
			ActionsWeb.click("verifySecurityQASubmit");
		}
	}
	
	public static void verifyLoggedInState(){
		Assert.assertEquals("My Account", driver.findElement(By.id("href_myAccountHeader")).getText());
	}
	
	public static void cleanupuser(){
		driver.manage().deleteAllCookies();
		driver.get("http://www.macys.com");
	}
	
	public static void logOut_ifUserisloggedIn(String what_state_user_is_in){
		
		if(what_state_user_is_in.equalsIgnoreCase("valid")){
			Assert.assertEquals("My Account", driver.findElement(By.id("href_myAccountHeader")).getText());
			driver.findElement(By.id("globalMastheadSignIn")).click();
		}
		
		driver.quit();
		
	}
	
	public static void validLoginuser(String username, String password){
		ActionsWeb.sendkeys("email",username);	
		ActionsWeb.sendkeys("password",password);	
		ActionsWeb.click("#signInBtn");	
	
	}

	
}
//		if((driver.getPageSource()).contains("my account")){