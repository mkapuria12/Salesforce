package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNew_32 extends BrowserUtility{
	
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
					WebElement lName=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
					
					waitForPageElementToVisible(lName);
					
					String l_name=new String(Contacts_getCellData(45, 3));
								
					lName.sendKeys(l_name);
					
					Thread.sleep(3000);
					
					System.out.println("Last name is added.");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			static void accountName()
			{
				try {
					WebElement accName=driver.findElement(By.xpath("//input[@id='con4']"));
					
					waitForPageElementToVisible(accName);
					
					String aName=new String(Contacts_getCellData(46, 3));
								
					accName.sendKeys(aName);
					
					Thread.sleep(3000);
					
					System.out.println("Account name is added.");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
			static void saveAndNew()
			{
				try {
					waitForPageElementToVisible(driver.findElement(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]")));
					
					WebElement saveNew=driver.findElement(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]"));
					
					saveNew.click();
					
					System.out.println("Save & New clicked.");
					
					Thread.sleep(3000);
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
		contacts();
		newLead();
		lastName();
		accountName();
		saveAndNew();
		LogOut();		
		quitBrowser();
				
		StartBrowser("firefox");
		login();
		contacts();
		newLead();
		lastName();
		accountName();
		saveAndNew();
		LogOut();		
		quitBrowser();

	}


}
