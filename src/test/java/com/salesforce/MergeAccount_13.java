package com.salesforce;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MergeAccount_13 extends BrowserUtility{
	
	static void mergeAccount()
	{
		try {

		WebElement accountsTab=driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		
		waitForPageElementToVisible(accountsTab);
					
		accountsTab.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
		
		driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
			
		WebElement merge_account=driver.findElement(By.linkText("Merge Accounts"));
		
		waitForPageElementToVisible(merge_account);
					
		merge_account.click();
		
		Thread.sleep(1000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='srch']")));
		
		WebElement add_text=driver.findElement(By.xpath("//input[@id='srch']"));
		
		add_text.clear();
		
		String aText =new String(C_getCellData(36, 3));
		
		add_text.sendKeys(aText);
		
		Thread.sleep(1000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@class='btn' and @name='srchbutton']")));
		
		WebElement findAccounts=driver.findElement(By.xpath("//input[@class='btn' and @name='srchbutton']"));
		
		findAccounts.click();
		
		Thread.sleep(1000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='cid0']")));
		
		WebElement checkBox1=driver.findElement(By.xpath("//input[@id='cid0']"));	
		
		if(!checkBox1.isEnabled())
		{
			checkBox1.click();
		}
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='cid1']")));
		
		WebElement checkBox2=driver.findElement(By.xpath("//input[@id='cid1']"));	
		
		if(!checkBox2.isEnabled())
		{
			checkBox2.click();
		}
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='cid2']")));
		
		WebElement checkBox3=driver.findElement(By.xpath("//input[@id='cid2']"));	
		
		checkBox3.click();;
		
		Thread.sleep(1000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='goNext']")));
		
		WebElement next=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='goNext']"));	

		next.click();

		Thread.sleep(1000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")));
		
		WebElement merge=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));	
		
		merge.click();
		
		Alert al = driver.switchTo().alert();
		
		al.accept();
		
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
		mergeAccount();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		mergeAccount();
		LogOut();		
		quitBrowser();
	}

}
