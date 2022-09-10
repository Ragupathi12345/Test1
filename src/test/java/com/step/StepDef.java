package com.step;

import com.commonmethods.CommonMethods;
import com.locators.LocatorsClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDef extends CommonMethods {
public static	LocatorsClass l;
	
	@Given("launch the URL FB")
	public void launch_the_URL_FB() {
		launchBrowser();
		 l=new LocatorsClass();
		
		launchURL("https://www.facebook.com/");
		
		
	    	}

	@Given("go to login")
	public void go_to_login() {
		passText(l.login, "ragurandy5122@gmail.com");
		passText(l.password, "ragutamil$");
	   
	}

	@When("click login")
	public void click_login() {
		toClick(l.btnfb);
		
		
		
	
	   
	}

			
		
	   
	}




