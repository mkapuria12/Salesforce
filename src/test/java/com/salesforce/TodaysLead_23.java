package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TodaysLead_23 extends BrowserUtility{
	
	static void viewList() {
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
		
	static void Option1()	
	{
		try {
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("Today's Leads");
		
		System.out.println("Today's Leads is selected");
		
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
			static void clickOnGo()
			{
				try {
					WebElement go=driver.findElement(By.xpath("(//input[@class='btn' and @name='go'])[1]"));
					
					waitForPageElementToVisible(go);
								
					go.click();
					
					System.out.println("Clicked go button successfully!");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		viewList();
		Option1();
		clickOnGo();
		LogOut();		
		quitBrowser();
				
		StartBrowser("firefox");
		login();
		viewList();
		Option1();
		clickOnGo();
		LogOut();		
		quitBrowser();

	}

}
