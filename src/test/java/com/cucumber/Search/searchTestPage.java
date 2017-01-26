package com.cucumber.Search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.cucumber.ActionsWeb;

public class searchTestPage extends ActionsWeb{
	

	public static void searchItem(String itemname){
		ActionsWeb.sendkeys("globalSearchInputField",itemname);
		
		List<WebElement> suggestion_list = driver.findElements(By.className("suggestion"));
		System.out.println(suggestion_list.size());
		
		for(int i =0; i<suggestion_list.size(); i++){
			System.out.println("sugges list - " + suggestion_list.get(i).getText());
		}

		ActionsWeb.click("subnavSearchSubmit");
		
	}
	
	public static void addItemCart(int itemno){
		
		ActionsWeb.click("//*[contains(text(),'"+itemno+"')]");
	}
	
	public static void verifyItemCart(){
		Assert.assertEquals("Movado", driver.findElement(By.className("brandNameLink")).getText());
	}
}
