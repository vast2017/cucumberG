package com.cucumber.Home;

import com.cucumber.ActionsWeb;

public class homeTestPage {
	
	
	public static void browserOpen(){
		ActionsWeb.openBrowser("chrome");
	}
	
	public static void navigate(){
		ActionsWeb.navigate("http://www.macys.com");
	}

	public static void gotoHome(){
		
	}
	
	public static void clicksignInBtn(){
		ActionsWeb.click("#globalMastheadSignIn");
	}

}
