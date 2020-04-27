package com.salesforce;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountswithLastActivity_14 extends BrowserUtility{

	static void LastActivitywithin30Days()
	{
		try {

		WebElement accountsTab=driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		
		waitForPageElementToVisible(accountsTab);
					
		accountsTab.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
		
		driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
			
		WebElement lastAcitivty=driver.findElement(By.linkText("Accounts with last activity > 30 days"));
		
		waitForPageElementToVisible(lastAcitivty);
					
		lastAcitivty.click();
		
		Thread.sleep(1000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//img[@id='ext-gen148']")));
		
		WebElement dateField=driver.findElement(By.xpath("//img[@id='ext-gen148']"));
		
		dateField.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(text(),'Created Date')]")));
		
		WebElement SelectdateField=driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
		
		SelectdateField.click();
	
		waitForPageElementToVisible(driver.findElement(By.xpath("//img[@id='ext-gen152']")));
		
		WebElement fromImg=driver.findElement(By.xpath("//img[@id='ext-gen152']"));
		
		fromImg.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Today')]")));
		
		WebElement fromToday=driver.findElement(By.xpath("//button[contains(text(),'Today')]"));
		
		fromToday.click();

		waitForPageElementToVisible(driver.findElement(By.xpath("//img[@id='ext-gen154']")));
		
		WebElement toImg=driver.findElement(By.xpath("//img[@id='ext-gen154']"));
		
		toImg.click();
		
		Thread.sleep(2000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='ext-comp-1045']")));
		
		WebElement toToday=driver.findElement(By.xpath("//input[@id='ext-comp-1045']"));	

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','"+4/25/2020+"');", toToday);
		
		Thread.sleep(2000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[@id='ext-gen49']")));
		
		WebElement save=driver.findElement(By.xpath("//button[@id='ext-gen49']"));
		
		save.click();
		
		Thread.sleep(1000);	
		
		ArrayList<String> windowTabs = new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(windowTabs.get(1));
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")));
		
		WebElement reportName=driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
		
		String rName =C_getCellData(56, 3);
		
		reportName.sendKeys(rName);
		
		Thread.sleep(5000);	
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		LastActivitywithin30Days();
		LogOut();		
		quitBrowser();
	
//		StartBrowser("firefox");
//		login();
//		mergeAccount();
//		LogOut();		
//		quitBrowser();
	}

}
