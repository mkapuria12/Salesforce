package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyContacts_28 extends BrowserUtility{
	
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
	static void viewList()	
	{
		try {
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("My Contacts");
		
		System.out.println("My Contacts is selected");
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
		viewList();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		contacts();
		viewList();
		LogOut();		
		quitBrowser();
		
	}

}
