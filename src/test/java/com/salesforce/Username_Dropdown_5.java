package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Username_Dropdown_5 extends BrowserUtility{

	static void check_usernameDropdown()
	{
		try {

			WebElement UsernameDisplayed=driver.findElement(By.id("userNavLabel"));
			
			waitForPageElementToVisible(UsernameDisplayed);
			
			System.out.println(UsernameDisplayed.getText());
			
			WebElement UsernameArrow=driver.findElement(By.id("userNav-arrow"));
			
			waitForPageElementToVisible(UsernameArrow);
						
			UsernameArrow.click();
			
			Thread.sleep(5000);
		
			}catch(Exception e) 
		    {
				System.out.println(e);
			}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BrowserUtility.driver;
		StartBrowser("chrome");
		login();
		check_usernameDropdown();
		LogOut();
		quitBrowser();
		StartBrowser("firefox");
		login();
		check_usernameDropdown();
		LogOut();
		quitBrowser();	
	}

}
