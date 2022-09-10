package com.commonmethods;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {
	public static WebDriver driver;
	public static Alert a;

	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void launchURL(String URL) {

		driver.get(URL);

	}

	public static void toClick(WebElement ele) {
		ele.click();

	}

	public static void passText(WebElement ele, String Text) {

		ele.sendKeys(Text);
	}

	public static String getAttribute(WebElement ele, String value) {

		String attribute = ele.getAttribute(value);
		return attribute;

	}

	public static String getText(WebElement ele) {
		String text = ele.getText();
		return text;

	}

	public static void disMiss() {

		a = driver.switchTo().alert();
		a.dismiss();

	}

	public static void toAccept() {
		a.accept();

	}

	public static void select1(WebElement ele,int index) {
		Select s = new Select(ele);
		s.deselectByIndex(index);

	}

	public static void windows1() {

		String parent = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for (String w : allwindow) {
			if (!w.equals(parent)) {
				driver.switchTo().window(w);
				driver.switchTo().window(parent);

			}

		}

	}
	public static void iFrame1(int index) {
		driver.switchTo().frame(index);

	}

}
