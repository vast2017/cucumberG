package com.cucumber;

public class replace {

	public static void main(String[] args) {
		
		String my_resp = "I am testing script 9 change value";
		
		my_resp =  my_resp.replaceAll("(.*)testing", "").replaceAll("change(.*)", "").trim();

		
		System.out.println(my_resp);

	}

}
