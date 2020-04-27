package com.salesforce;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectDate_36 extends BrowserUtility{
	
	static void homeTab() {
		try {
			WebElement homeLink=driver.findElement(By.linkText("Home"));
			
			waitForPageElementToVisible(homeLink);
						
			homeLink.click();	
			
			System.out.println("Clicked succssfully and navigated to Home page.");
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
			
			driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void selectDateLink() {
		try {
			WebElement dateLink=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[2]/a[1]"));
			
			waitForPageElementToVisible(dateLink);
						
			dateLink.click();	
			
			System.out.println("Clicked succssfully and navigated to calendar page.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void selectTimeLink() {
		try {
			WebElement timeLink=driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
			
			waitForPageElementToVisible(timeLink);
						
			timeLink.click();	
			
			System.out.println("8:00 P.M. is selected.");
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
			
			driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();	
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void subjectComboIcon() {
		try {
			WebElement subject=driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]"));
			
			waitForPageElementToVisible(subject);
						
			subject.click();	
			
			System.out.println("Subject combo is selected and pop up is displayed.");
			
			Thread.sleep(3000);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void switchToSubjectWindow() {
		try {

			ArrayList<String> windowTab=new ArrayList(driver.getWindowHandles());
			
			System.out.println(windowTab.size());
			
			driver.switchTo().window(windowTab.get(1));
			
			Thread.sleep(1000);

			System.out.println("Switched to sunject window.");
			
			WebElement subSelect=driver.findElement(By.xpath("//li[@class='listItem4']//a[contains(text(),'Other')]"));
			
			waitForPageElementToVisible(subSelect);
						
			subSelect.click();
			
			System.out.println("Other is selected");
			
			driver.switchTo().window(windowTab.get(0));
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	static void endTime() {
		try {
			WebElement time=driver.findElement(By.xpath("//input[@id='EndDateTime_time' and @value='9:00 PM']"));
			
			waitForPageElementToVisible(time);
			
			Actions actions=new Actions(driver);
			
			actions.moveToElement(time).click().build().perform();

			WebElement desiredtime=driver.findElement(By.xpath("//div[@id='timePickerItem_42']"));
			
			waitForPageElementToVisible(desiredtime);

			System.out.println(desiredtime.isDisplayed());
			
			desiredtime.click();
						
			System.out.println("9:00 P.M. selected");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void endTimeLimit() {
		try {
			WebElement endTime = driver.findElement(By.xpath("//div[@id='timePickerItem_47']"));
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", endTime);
			
			Thread.sleep(2000);
			
			System.out.println(endTime.isDisplayed());
			
			System.out.println("Last given time is 11:30 P.M.");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void save() {
		try {
			WebElement saveButton=driver.findElement(By.xpath("(//td[@id='bottomButtonRow']//input[contains(@name,'save')])[1]"));
			
			waitForPageElementToVisible(saveButton);
			
			System.out.println(saveButton.isDisplayed());
						
			saveButton.click();
			
			System.out.println("saveButton button clicked.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		homeTab();
		selectDateLink();
		selectTimeLink();
		subjectComboIcon();
		switchToSubjectWindow();
		endTime();
		endTimeLimit();
		save();
		LogOut();
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		homeTab();
		selectDateLink();
		selectTimeLink();
		subjectComboIcon();
		switchToSubjectWindow();
		endTime();
		endTimeLimit();
		save();
		LogOut();		
		quitBrowser();
	
	}

}
