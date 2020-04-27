package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StuckOpportunities_18 extends BrowserUtility{

	static void opportunities() {
		try {
			WebElement opporLink=driver.findElement(By.linkText("Opportunities"));
			
			waitForPageElementToVisible(opporLink);
						
			opporLink.click();	
			
			System.out.println("Clicked succssfully on the opportunities link.");
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
			
			driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void stuckOpp() {
		try {
			WebElement stuckopporLink=driver.findElement(By.linkText("Stuck Opportunities"));
			
			waitForPageElementToVisible(stuckopporLink);
						
			stuckopporLink.click();	
			
			System.out.println("Report Page with the Opportunities that are Stuck will be displayed.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		opportunities();
		stuckOpp();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		opportunities();
		stuckOpp();
		LogOut();		
		quitBrowser();
	}

}
