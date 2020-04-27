package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Opportunities_15 extends BrowserUtility{
	
	static void opportunitieOption1()
	{
		try {
		WebElement opporLink=driver.findElement(By.linkText("Opportunities"));
		
		waitForPageElementToVisible(opporLink);
					
		opporLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
		
		driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("Closing Next Month");
		
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
	static void opportunitieOption2()
	{
		try {
		WebElement opporLink=driver.findElement(By.linkText("Opportunities"));
		
		waitForPageElementToVisible(opporLink);
					
		opporLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("Closing This Month");
		
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void opportunitieOption3()
	{
		try {
		WebElement opporLink=driver.findElement(By.linkText("Opportunities"));
		
		waitForPageElementToVisible(opporLink);
					
		opporLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("My Opportunities");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void opportunitieOption4()
	{
		try {
		WebElement opporLink=driver.findElement(By.linkText("Opportunities"));
		
		waitForPageElementToVisible(opporLink);
					
		opporLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("New Last Week");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void opportunitieOption5()
	{
		try {
		WebElement opporLink=driver.findElement(By.linkText("Opportunities"));
		
		waitForPageElementToVisible(opporLink);
					
		opporLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("New This Week");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void opportunitieOption6()
	{
		try {
		WebElement opporLink=driver.findElement(By.linkText("Opportunities"));
		
		waitForPageElementToVisible(opporLink);
					
		opporLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("Opportunity Pipeline");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void opportunitieOption7()
	{
		try {
		WebElement opporLink=driver.findElement(By.linkText("Opportunities"));
		
		waitForPageElementToVisible(opporLink);
					
		opporLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("Private");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void opportunitieOption8()
	{
		try {
		WebElement opporLink=driver.findElement(By.linkText("Opportunities"));
		
		waitForPageElementToVisible(opporLink);
					
		opporLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("Recently Viewed Opportunities");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void opportunitieOption9()
	{
		try {
		WebElement opporLink=driver.findElement(By.linkText("Opportunities"));
		
		waitForPageElementToVisible(opporLink);
					
		opporLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));

		Select selectView1 = new Select(view1);
		
		selectView1.selectByVisibleText("Won");
		
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
		opportunitieOption1();
		opportunitieOption2();
		opportunitieOption3();
		opportunitieOption4();
		opportunitieOption5();
		opportunitieOption6();
		opportunitieOption7();
		opportunitieOption8();
		opportunitieOption9();
		
		LogOut();		
		quitBrowser();
				
		StartBrowser("firefox");
		login();
		opportunitieOption1();
		opportunitieOption2();
		opportunitieOption3();
		opportunitieOption4();
		opportunitieOption5();
		opportunitieOption6();
		opportunitieOption7();
		opportunitieOption8();
		opportunitieOption9();
		LogOut();		
		quitBrowser();

	}

}
