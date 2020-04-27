package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Leads_20 extends BrowserUtility{
	static void leadsTab() {
		try {
			WebElement leadsLink=driver.findElement(By.linkText("Leads"));
			
			waitForPageElementToVisible(leadsLink);
						
			leadsLink.click();	
			
			System.out.println("Clicked succssfully and navigated to leads Homepage.");
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
			
			driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		leadsTab();		
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		leadsTab();
		LogOut();		
		quitBrowser();
	}

}
