package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyAccountHolderName_33 extends BrowserUtility{
	
	static void homeTab() {
		try {
			WebElement homeLink=driver.findElement(By.linkText("Home"));
			
			waitForPageElementToVisible(homeLink);
						
			homeLink.click();	
			
			System.out.println("Clicked succssfully and navigated to Home page.");
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
			
			driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	static void AccountHolderName() {
		try {
			WebElement ownerName=driver.findElement(By.linkText("Mitali Kapuria"));
			
			waitForPageElementToVisible(ownerName);
						
			System.out.println("Here is the first and last name of Account holder:- "+ownerName.getText());
						
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void AccountHolderLink() {
		try {
			WebElement ownerLink=driver.findElement(By.linkText("Mitali Kapuria"));
			
			waitForPageElementToVisible(ownerLink);
						
			ownerLink.click();	
			
			System.out.println("Clicked succssfully and navigated to another page which is same as My Profile page.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		homeTab();
		AccountHolderName();
		AccountHolderLink();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		homeTab();
		AccountHolderName();
		AccountHolderLink();
		LogOut();		
		quitBrowser();
		
	}

}
