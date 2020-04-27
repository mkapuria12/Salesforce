package com.salesforce;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountLink_10 extends BrowserUtility{
	
	static void Accounts()
	{
		try {
		WebElement accountsTab=driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		
		waitForPageElementToVisible(accountsTab);
					
		accountsTab.click();
		
		Thread.sleep(3000);
		
		WebElement newTab=driver.findElement(By.xpath("//input[@class='btn' and @name='new']"));
		
		waitForPageElementToVisible(newTab);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
		
		driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
	
		newTab.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='acc2']")));
		
		WebElement account_name=driver.findElement(By.xpath("//input[@id='acc2']"));
		
		account_name.clear();
		
		String aName = C_getCellData(6, 3);

		account_name.sendKeys(aName);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='acc6']")));
		
		WebElement accountType=driver.findElement(By.xpath("//select[@id='acc6']"));
		
		Select selectType=new Select(accountType);
		
		selectType.selectByVisibleText("Technology Partner");
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='00N5w00000HYEtp']")));
		
		WebElement customerPriority=driver.findElement(By.xpath("//select[@id='00N5w00000HYEtp']"));
		
		Select selectPriority=new Select(customerPriority);
		
		selectPriority.selectByVisibleText("High");
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@class='btn' and @name='save']")));
		
		WebElement saveButton=driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@class='btn' and @name='save']"));
		
		saveButton.click();
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		Accounts();
		LogOut();		
		quitBrowser();
		
		Thread.sleep(3000);
		
		StartBrowser("firefox");
		login();
		Accounts();
		LogOut();		
		quitBrowser();
		
	}

}
