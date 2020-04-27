package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactName_29 extends BrowserUtility{
	
	static void contacts() {
		try {
			WebElement contactsLink=driver.findElement(By.linkText("Contacts"));
			
			waitForPageElementToVisible(contactsLink);
						
			contactsLink.click();	
			
			System.out.println("Clicked succssfully and navigated to contatcs Homepage.");
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
			
			driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void recentcontactName() {
		try {
			WebElement recentcontactLink=driver.findElement(By.linkText("Gonzalez, Rose"));
			
			waitForPageElementToVisible(recentcontactLink);
						
			recentcontactLink.click();	
			
			System.out.println("Clicked succssfully and navigated to Gonzalez, Rose Homepage.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		contacts();
		recentcontactName();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		contacts();
		recentcontactName();
		LogOut();		
		quitBrowser();
		
	}
	
}
