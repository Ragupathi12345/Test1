package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonmethods.CommonMethods;

public class LocatorsClass extends CommonMethods {
	
	public LocatorsClass() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement login;
	
	@FindBy(xpath="//input[@id='pass']")
	public WebElement password;
	
	
	@FindBy(xpath="//button[@name='login']")
	public WebElement btnfb;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	public WebElement quitebtn;
	
	
	
	@FindBy(xpath="//input[@name='q']")
	public WebElement serch;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement click;
	
	@FindBy(xpath="//a[contains(@aria-label,'Facebo')]")
	public WebElement fblogo;
	
	@FindBy(xpath="(//img[contains(@alt,'F22')])[1]")
	public WebElement phon;

}
