package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QuarterlySummary_19 extends BrowserUtility{
	static void opportunities() {
		try {
			WebElement opporLink=driver.findElement(By.linkText("Opportunities"));
			
			waitForPageElementToVisible(opporLink);
						
			opporLink.click();	
			
			System.out.println("Clicked succssfully on the opportunities link.");
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
			
			driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void interval() {
		try {
			WebElement intervalQuat=driver.findElement(By.xpath("//select[@id='quarter_q']"));
			
			waitForPageElementToVisible(intervalQuat);
						
			Select selectInterval=new Select(intervalQuat);
			
			selectInterval.selectByVisibleText("Current and Next FQ");

			System.out.println("Current and Next FQ is selected and displayed.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void include() {
		try {
			WebElement includeQuat=driver.findElement(By.xpath("//select[@id='open']"));
			
			waitForPageElementToVisible(includeQuat);
						
			Select selectInclude=new Select(includeQuat);
			
			selectInclude.selectByVisibleText("Open Opportunities");

			System.out.println("Open Opportunities is selected and displayed.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void runReport() {
		try {
			WebElement run=driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']"));
			
			waitForPageElementToVisible(run);
						
			run.click();

			System.out.println("Run successfully!");
			System.out.println("Report is displayed.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	//table[@class='opportunitySummary']//input[@name='go']
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		opportunities();
		interval();
		include();
		runReport();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		opportunities();
		interval();
		include();
		runReport();
		LogOut();		
		quitBrowser();
	}

}
