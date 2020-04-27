package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateNewView_11 extends BrowserUtility{

	
	static void createnewviewLink()
	{
		try {

		WebElement accountsTab=driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		
		waitForPageElementToVisible(accountsTab);
					
		accountsTab.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
		
		driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();

		waitForPageElementToVisible(driver.findElement(By.linkText("Create New View")));
		
		WebElement getLink=driver.findElement(By.linkText("Create New View"));
					
		getLink.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fname']")));
		
		WebElement viewName=driver.findElement(By.xpath("//input[@id='fname']"));
					
		String vName = C_getCellData(15, 3);
		
		viewName.sendKeys(vName);
		
		Thread.sleep(2000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='devname']")));
		
		WebElement viewUniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		
		String vUniName = C_getCellData(16, 3);
		
		viewUniqueName.sendKeys(vUniName);
		
		Thread.sleep(2000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")));
		
		WebElement save=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
		
		save.click();
			
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view=driver.findElement(By.xpath("//select[@id='fcf']"));	
		
	    Select selectView=new Select(view);
	    
	    selectView.selectByVisibleText("Automation");
	    
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
		createnewviewLink();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		createnewviewLink();
		LogOut();		
		quitBrowser();
		
	}

}
