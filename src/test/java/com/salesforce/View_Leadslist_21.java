package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class View_Leadslist_21 extends BrowserUtility{
	
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
			WebElement leadsLink=driver.findElement(By.linkText("Leads"));
			
			waitForPageElementToVisible(leadsLink);
						
			leadsLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("My Unread Leads");
		
		System.out.println("My Unread Leads is selected");
		
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void Option2()
	{
		try {
			WebElement leadsLink=driver.findElement(By.linkText("Leads"));
			
			waitForPageElementToVisible(leadsLink);
						
			leadsLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("Recently Viewed Leads");
		
		System.out.println("Recently Viewed Leads is selected");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void Option3()
	{
		try {
			WebElement leadsLink=driver.findElement(By.linkText("Leads"));
			
			waitForPageElementToVisible(leadsLink);
						
			leadsLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("Today's Leads");
		
		System.out.println("Today's Leads is selected");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void Option4()
	{
		try {
			WebElement leadsLink=driver.findElement(By.linkText("Leads"));
			
			waitForPageElementToVisible(leadsLink);
						
			leadsLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("View - Custom 1");
		
		System.out.println("View - Custom 1 is selected");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void Option5()
	{
		try {
			WebElement leadsLink=driver.findElement(By.linkText("Leads"));
			
			waitForPageElementToVisible(leadsLink);
						
			leadsLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("View - Custom 2");
		
		System.out.println("View - Custom 2 is selected");

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
		Option2();
		Option3();
		Option4();
		Option5();		
		LogOut();		
		quitBrowser();
				
		StartBrowser("firefox");
		login();
		viewList();
		Option1();
		Option2();
		Option3();
		Option4();
		Option5();
		LogOut();		
		quitBrowser();

	}


}
