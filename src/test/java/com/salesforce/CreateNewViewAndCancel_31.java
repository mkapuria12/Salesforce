package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewViewAndCancel_31 extends BrowserUtility{

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
		viewName.clear();
					
		String vName = new String(Contacts_getCellData(38, 3));
		
		viewName.sendKeys(vName);
		System.out.println("View Name is entered.");
		
		Thread.sleep(5000);
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
				viewUniqueName.clear();
				
				String vUniName = new String(Contacts_getCellData(39, 3));
				
				viewUniqueName.sendKeys(vUniName);
				System.out.println("View unique name is entered.");

		}catch(Exception e)
		{
			System.out.println(e);
		}
		}
		static void cancel()
		{
			try {
				waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']")));
				
				WebElement cancelButton=driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']"));
				
				cancelButton.click();
				
				System.out.println("Cancel button clicked.");
		
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
		cancel();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		contacts();
		createnewviewLink();
		viewName();
		viewUniqueName();
		cancel();
		LogOut();		
		quitBrowser();
		
	}


}
