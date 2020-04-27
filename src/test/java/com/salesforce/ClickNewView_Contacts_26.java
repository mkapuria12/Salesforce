package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClickNewView_Contacts_26 extends BrowserUtility{

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
	
	static void createnewviewLink()
	{
		try {

		WebElement createviewLink=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		
		waitForPageElementToVisible(createviewLink);
					
		createviewLink.click();
		System.out.println("Clicked on create new view");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
		static void viewName()
		{
			try {
			waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fname']")));
			
			WebElement viewName=driver.findElement(By.xpath("//input[@id='fname']"));
						
			String vName = new String(Contacts_getCellData(12, 3));
			
			viewName.sendKeys(vName);
			System.out.println("View Name is entered.");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		}
		
		static void viewUniqueName()
		{
			try {
				waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='devname']")));
				
				WebElement viewUniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
				
				String vUniName = new String(Contacts_getCellData(13, 3));
				
				viewUniqueName.sendKeys(vUniName);
				System.out.println("View unique name is entered.");

		}catch(Exception e)
		{
			System.out.println(e);
		}
		}
		static void save()
		{
			try {
				waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")));
				
				WebElement save=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
				
				save.click();
				
				System.out.println("New View is saved.");

				
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
		createnewviewLink();
		viewName();
		viewUniqueName();
		save();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		contacts();
		createnewviewLink();
		viewName();
		viewUniqueName();
		save();
		LogOut();		
		quitBrowser();
		
	}


}
