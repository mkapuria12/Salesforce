package com.salesforce;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Recurrence_37 extends BrowserUtility{
	
	static void homeTab() {
		try {
			WebElement homeLink=driver.findElement(By.linkText("Home"));
			
			waitForPageElementToVisible(homeLink);
						
			homeLink.click();	
			
			System.out.println("Clicked succssfully and navigated to Home page.");
			
			//waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
			
			//driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
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
			WebElement timeLink=driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
			
			waitForPageElementToVisible(timeLink);
						
			timeLink.click();	
			
			System.out.println("4:00 P.M. is selected.");
			
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
			WebElement time=driver.findElement(By.xpath("//input[@id='EndDateTime_time' and @value='5:00 PM']"));
			
			waitForPageElementToVisible(time);
			
			Actions actions=new Actions(driver);
			
			actions.moveToElement(time).click().build().perform();

			WebElement newTime = driver.findElement(By.xpath("//div[@id='timePickerItem_38']"));
			
			Thread.sleep(2000);
			
			newTime.click();
			
			System.out.println("The new selected time is 7:00 P.M."+newTime.isDisplayed());
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void recur() {
		try {
			WebElement recurCheckbox=driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
			
			waitForPageElementToVisible(recurCheckbox);
			
			if(!recurCheckbox.isSelected())
			{
				recurCheckbox.click();
				System.out.println("Create Recurring Series of Events checkbox is checked.");
				
				WebElement Frequency=driver.findElement(By.xpath("//label[contains(text(),'Frequency')]"));
				
				waitForPageElementToVisible(Frequency);
				
				System.out.println("Frequency is displayed:- "+Frequency.isDisplayed());
				
				WebElement recurrenceStart=driver.findElement(By.xpath("//label[contains(text(),'Recurrence Start')]"));
				
				waitForPageElementToVisible(recurrenceStart);
				
				System.out.println("Recurrence Start is displayed:- "+recurrenceStart.isDisplayed());
				
				WebElement recurrenceEnd=driver.findElement(By.xpath("//label[contains(text(),'Recurrence End')]"));
				
				waitForPageElementToVisible(recurrenceEnd);
				
				System.out.println("Recurrence End is displayed:- "+recurrenceEnd.isDisplayed());
			}
			else
				System.out.println("Create Recurring Series of Events checkbox is not checked.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void recurFrequencyWeekly() {
		try {
				
				WebElement frequencyWeekly=driver.findElement(By.xpath("//input[@id='rectypeftw']"));
				
				waitForPageElementToVisible(frequencyWeekly);
				
				WebElement weeklyPrinted=driver.findElement(By.xpath("//label[contains(text(),'Weekly')]"));
				
				waitForPageElementToVisible(weeklyPrinted);
				
				System.out.println(weeklyPrinted.getText());
							
				if(!frequencyWeekly.isSelected())
				{
				frequencyWeekly.click();
				System.out.println("Radio button of weekly is checked:- ");

				}
				System.out.println("Radio button of weekly is displayed:- "+frequencyWeekly.isDisplayed());
	
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void recurFrequencyEvery() {
		try {
				
				WebElement recursEvery=driver.findElement(By.xpath("//input[@id='wi']"));
				
				waitForPageElementToVisible(recursEvery);
				
				WebElement recursEveryPrinted=driver.findElement(By.xpath("//div[contains(text(),'Recurs every ')]"));
				
				waitForPageElementToVisible(recursEveryPrinted);
				
				System.out.println(recursEveryPrinted.getText());
	
				System.out.println("1 is displayed."+recursEvery.getText());					
	
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void recurFrequencyDay() {
		try {
				
				WebElement recursDay=driver.findElement(By.xpath("//input[@id='16']"));
				
				waitForPageElementToVisible(recursDay);
				
				WebElement recursDayPrinted=driver.findElement(By.xpath("//label[contains(text(),'Thursday')]"));
				
				waitForPageElementToVisible(recursDayPrinted);
				
				System.out.println(recursDayPrinted.getText());
	
				if(!recursDay.isSelected())
				{
					recursDay.click();
					System.out.println("Thursday is checked:-"+recursDay.isDisplayed());					
				}		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	static void recurrenceEndDate() {
		try {
			WebElement rendDate=driver.findElement(By.xpath("(//td[@id='bottomButtonRow']//input[contains(@name,'save')])[1]"));
			
			waitForPageElementToVisible(rendDate);
			
			System.out.println("The recurrence end date is displayed:-"+rendDate.isDisplayed());
						
			Actions action=new Actions(driver);
			
			action.moveToElement(rendDate).click().build().perform();
			
			System.out.println("The calendar is opened and displayed.");
			
			Thread.sleep(2000);
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='calMonthPicker']")));
			
			WebElement month=driver.findElement(By.xpath("//select[@id='calMonthPicker']"));
			
			Select sc=new Select(month);	
			
			sc.selectByVisibleText("November");
			
			System.out.println("The month is selected.");
				
			List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='calDays']//td"));
			
			for(WebElement ele:allDates)
			{
				
				String date=ele.getText();
				
				if(date.equalsIgnoreCase("28"))
				{
					ele.click();
					break;
				}
				
			}

			System.out.println("The date is selected and calendar is closed.");

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
	
	
	
	static void monthViewIconOn() {
		try {
			WebElement monthView=driver.findElement(By.xpath("//img[contains(@class,'monthViewIcon')]"));
			
			waitForPageElementToVisible(monthView);
			
			System.out.println(monthView.isDisplayed());
						
			monthView.click();
			
			System.out.println("monthView button clicked.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	static void pageType() {
		try {
			WebElement pageView=driver.findElement(By.xpath("//h1[@class='pageType']"));
			
			waitForPageElementToVisible(pageView);
			
			System.out.println(pageView.isDisplayed());
						
			System.out.println(pageView.getText());
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	static void eventBlock() {
		try {
			WebElement event=driver.findElement(By.xpath("//td[contains(@class,'calToday')]//div[2]//a[1]"));
			
			waitForPageElementToVisible(event);
			waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
			
			driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
			System.out.println(event.isDisplayed());
						
			System.out.println(event.getText());
			
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
		recur();
		recurFrequencyWeekly();
		recurFrequencyEvery();
		recurFrequencyDay();
		recurrenceEndDate();
		save();
		monthViewIconOn();
		pageType();
		eventBlock();
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
		recur();
		recurFrequencyWeekly();
		recurFrequencyEvery();
		recurFrequencyDay();
		recurrenceEndDate();
		save();
		monthViewIconOn();
		pageType();
		eventBlock();
		LogOut();		
		quitBrowser();
	
	}


}
