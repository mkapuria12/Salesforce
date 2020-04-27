package com.salesforce;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeveloperConsole_8 extends BrowserUtility{

	static void Developer_Console()
	{
		try {
			
			WebElement UsernameArrow=driver.findElement(By.id("userNav-arrow"));
			
			waitForPageElementToVisible(UsernameArrow);
						
			UsernameArrow.click();
			
			Thread.sleep(1000);
			
			WebElement DevCons=driver.findElement(By.linkText("Developer Console"));
			
			waitForPageElementToVisible(DevCons);
						
			DevCons.click();
			
			ArrayList<String> windowTabs = new ArrayList(driver.getWindowHandles());
			
			System.out.println(windowTabs.size()); 
			
			driver.switchTo().window(windowTabs.get(1));
			
			Thread.sleep(2000);
			
			driver.close();
			
			Thread.sleep(2000);

			}catch(Exception e) 
		    {
				System.out.println(e);
			}
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		Developer_Console();
		quitBrowser();
		
		Thread.sleep(3000);
		
		StartBrowser("firefox");
		login();
		Developer_Console();
		quitBrowser();
		
	}

}
