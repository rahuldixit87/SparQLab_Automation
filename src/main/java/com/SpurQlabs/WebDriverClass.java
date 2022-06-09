package com.SpurQlabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverClass {

	
	public static ThreadLocal<WebDriver> thread = new ThreadLocal<WebDriver>();
	
	@BeforeMethod (alwaysRun=true)
	public  static void  LaunchBrowser () {
	
		
	WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	 
	 
	 setDriver(driver);
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 
	 driver.get("https://www.calculator.net/");
	
	 
}
	private static synchronized void setDriver(WebDriver driver) {
		// TODO Auto-generated method stub
		thread.set(driver);
	}
	
	//protected   WebDriver driver  ;
	
	 public static WebDriver getDriver () {
		 return thread.get();
	 }
	 
	 @AfterMethod (alwaysRun=true)

		public  void closeBrowser() {
		 getDriver().quit();
			
		}
}