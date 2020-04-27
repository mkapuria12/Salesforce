package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewLead_24 extends BrowserUtility{
	
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
		
	static void newLead()	
	{
			WebElement newTab=driver.findElement(By.xpath("//input[@class='btn' and @name='new']"));
			
			waitForPageElementToVisible(newTab);
			
			newTab.click();	
			
			System.out.println("New tab clicked and nevigated to new page to create new lead.");
	}
	
			static void lastName()
			{
				try {
					WebElement lName=driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
					
					waitForPageElementToVisible(lName);
					
					String l_name=new String(L_getCellData(26, 3));
								
					lName.sendKeys(l_name);
					
					Thread.sleep(3000);
					
					System.out.println("Last name is added.");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			static void compnay()
			{
				try {
					WebElement compnayName=driver.findElement(By.xpath("//input[@id='lea3']"));
					
					waitForPageElementToVisible(compnayName);
					
					String comName=new String(L_getCellData(27, 3));
								
					compnayName.sendKeys(comName);
					
					Thread.sleep(3000);
					
					System.out.println("Compnay name is added.");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
			static void leadStatus()
			{
				try {
					WebElement lStatus=driver.findElement(By.xpath("//select[@id='lea13']"));
					
					waitForPageElementToVisible(lStatus);
					
					Select selectLeadStatus=new Select(lStatus);
								
					selectLeadStatus.selectByVisibleText("Closed - Converted");
					
					System.out.println("Closed - Converted is selected.");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
	
			static void save()
			{
				try {
					waitForPageElementToVisible(driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@class='btn' and @name='save']")));
					
					WebElement saveButton=driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@class='btn' and @name='save']"));
					
					saveButton.click();
					
					System.out.println("New lead is saved.");
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
		newLead();
		lastName();
		compnay();
		leadStatus();
		save();
		LogOut();		
		quitBrowser();
				
		StartBrowser("firefox");
		login();
		viewList();
		newLead();
		lastName();
		compnay();
		leadStatus();
		save();
		LogOut();		
		quitBrowser();

	}

}
