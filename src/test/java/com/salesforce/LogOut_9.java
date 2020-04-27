package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOut_9 extends BrowserUtility {
	
	static void mySettings()
	{
		try {
			
			WebElement UsernameArrow=driver.findElement(By.id("userNav-arrow"));
			
			waitForPageElementToVisible(UsernameArrow);
						
			UsernameArrow.click();
			
			Thread.sleep(1000);
			
			WebElement logOut=driver.findElement(By.linkText("Logout"));
			
			waitForPageElementToVisible(logOut);
						
			logOut.click();
			
			Thread.sleep(1000);
			}catch(Exception e) 
		    {
				System.out.println(e);
			}
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		mySettings();
		quitBrowser();
		
		Thread.sleep(3000);
		
		StartBrowser("firefox");
		login();
		mySettings();
		quitBrowser();		
		
	}

}
