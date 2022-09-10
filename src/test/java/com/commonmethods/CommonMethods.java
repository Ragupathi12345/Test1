package com.commonmethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods  {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	public static void launchURL(String URL) {
		
		driver.get(URL);

	}
	
	public static void toClick(WebElement ele) {
		ele.click();

	}
	public static void passText(WebElement ele,String Text) {
		
		ele.sendKeys(Text);
	}
	
	public static String getAttribute(WebElement ele,String value) {
		
		String attribute = ele.getAttribute(value);
		return attribute;

	}
	public static String getText(WebElement ele) {
		String text = ele.getText();
		return text;
	

	}
	public static void disMiss() {
		
		
		Alert a=driver.switchTo().alert();
		a.dismiss();
	

	}
	
	

}
