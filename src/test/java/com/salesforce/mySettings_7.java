package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class mySettings_7 extends BrowserUtility {
	
	static void mySettings()
	{
		try {
			
			WebElement UsernameArrow=driver.findElement(By.id("userNav-arrow"));
			
			waitForPageElementToVisible(UsernameArrow);
						
			UsernameArrow.click();
			
			Thread.sleep(1000);
			
			WebElement open_mySettings=driver.findElement(By.linkText("My Settings"));
			
			waitForPageElementToVisible(open_mySettings);
						
			open_mySettings.click();
			
			Thread.sleep(1000);
			}catch(Exception e) 
		    {
				System.out.println(e);
			}
	}

	static void personLink()
	{
		try {
			
			WebElement personal=driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));
			
			waitForPageElementToVisible(personal);
						
			personal.click();
			
			Thread.sleep(1000);

			WebElement loginHistory=driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
			
			waitForPageElementToVisible(loginHistory);
						
			loginHistory.click();
			
			Thread.sleep(1000);
			
			WebElement DownloadloginHistory=driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
			
			waitForPageElementToVisible(DownloadloginHistory);
						
			DownloadloginHistory.click();
			
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void displayLayout()
	{
		try {
			WebElement display=driver.findElement(By.id("DisplayAndLayout_font"));
			
			waitForPageElementToVisible(display);
						
			display.click();
			
			Thread.sleep(1000);
			
			WebElement customizeTab=driver.findElement(By.xpath("//span[contains(text(),'Customize My Tabs')]"));
			
			waitForPageElementToVisible(customizeTab);
						
			customizeTab.click();
			
			Thread.sleep(1000);
			
			WebElement customApp=driver.findElement(By.xpath("//select[@id='p4']"));
			
			waitForPageElementToVisible(customApp);
			
			Select option=new Select(customApp);
			
			option.selectByVisibleText("Salesforce Chatter");
			
			Thread.sleep(1000);
			
			WebElement availableTab=driver.findElement(By.xpath("//select[@id='duel_select_0']"));
			
			waitForPageElementToVisible(availableTab);
			
			Select optiontab=new Select(availableTab);
			
			optiontab.selectByVisibleText("Reports");
			
			Thread.sleep(1000);
			
			WebElement add=driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
			
			waitForPageElementToVisible(add);
			
			add.click();
			
			Thread.sleep(3000);

			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void email()
	{
		try {
			WebElement emailLink=driver.findElement(By.id("EmailSetup_font"));
			
			waitForPageElementToVisible(emailLink);
						
			emailLink.click();
			
			Thread.sleep(1000);
			
			WebElement myEmail=driver.findElement(By.xpath("//span[contains(text(),'My Email Settings')]"));
			
			waitForPageElementToVisible(myEmail);
						
			myEmail.click();
			
			Thread.sleep(1000);
		
			WebElement emailNameText=driver.findElement(By.xpath("//label[contains(text(),'Email Name')]"));
			
			waitForPageElementToVisible(emailNameText);	
			
			System.out.println(emailNameText.getText());
			
			Thread.sleep(1000);
			
			WebElement emaiName=driver.findElement(By.xpath("//input[@id='sender_name']"));
			
			waitForPageElementToVisible(emaiName);
			
			String eName = S_getCellData(39, 3);

			emaiName.sendKeys(eName);
			
			System.out.println("The email name is:- "+eName);
			
			Thread.sleep(2000);
			
			WebElement emailAddressText=driver.findElement(By.xpath("//label[contains(text(),'Email Address')]"));
			
			waitForPageElementToVisible(emailAddressText);	
			
			System.out.println(emailAddressText.getText());
			
			Thread.sleep(1000);
			
			WebElement emailAddress=driver.findElement(By.xpath("//input[@id='sender_email']"));
			
			waitForPageElementToVisible(emailAddress);
			
			String eAddress = S_getCellData(40, 3);

			emailAddress.sendKeys(eAddress);
			
			System.out.println("The email address is:- "+eAddress);
			
			Thread.sleep(2000);
			
			WebElement bccYes=driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
			
			waitForPageElementToVisible(bccYes);
			
			Thread.sleep(1000);
					
			WebElement bccNo=driver.findElement(By.xpath("//input[@id='auto_bcc0']"));
			
			waitForPageElementToVisible(bccNo);
			
			Thread.sleep(1000);
			
			if(bccYes.isEnabled())
			{
				bccNo.click();
			}
			else			
			{
				bccYes.click();
			}
			
			Thread.sleep(1000);
			
			WebElement save=driver.findElement(By.xpath("//input[@class='btn primary']"));
			
			waitForPageElementToVisible(save);
			
			save.click();
			
			Thread.sleep(3000);

			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void calender()
	{
		try {
			
			WebElement calenderRemainder=driver.findElement(By.id("CalendarAndReminders_font"));
			
			waitForPageElementToVisible(calenderRemainder);
						
			calenderRemainder.click();
			
			Thread.sleep(1000);
			
			WebElement activityRemainders=driver.findElement(By.xpath("//span[contains(text(),'Activity Reminders')]"));
			
			waitForPageElementToVisible(activityRemainders);
						
			activityRemainders.click();
			
			Thread.sleep(1000);
			
			WebElement openTestRemainders=driver.findElement(By.id("testbtn"));
			
			waitForPageElementToVisible(openTestRemainders);
						
			openTestRemainders.click();
			
			Thread.sleep(2000);
				
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		mySettings();
		personLink();
		displayLayout();
		email();
		calender();
		quitBrowser();
		
		Thread.sleep(3000);
		
		StartBrowser("firefox");
		login();
		mySettings();
		personLink();
		displayLayout();
		email();
		calender();
		quitBrowser();	
	}

}
