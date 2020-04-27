package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OppPipeline_17 extends BrowserUtility{

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
	
	static void pipeline()
	{	
		try {
		waitForPageElementToVisible(driver.findElement(By.linkText("Opportunity Pipeline")));
		
		WebElement oppPipeline=driver.findElement(By.linkText("Opportunity Pipeline"));
	
		oppPipeline.click();
		
		System.out.println("Report Page with the Opportunities that are pipelined will be displayed.");
		
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
		opportunities();
		pipeline();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		opportunities();
		pipeline();
		LogOut();		
		quitBrowser();
	}

}
