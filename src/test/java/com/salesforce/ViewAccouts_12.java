package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ViewAccouts_12 extends BrowserUtility{
	
	static void viewLink()
	{
		try {

		WebElement accountsTab=driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		
		waitForPageElementToVisible(accountsTab);
					
		accountsTab.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
		
		driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
			
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view=driver.findElement(By.xpath("//select[@id='fcf']"));	
		
	    Select selectView=new Select(view);
	    
	    selectView.selectByVisibleText("New This week");
	    
	    Thread.sleep(1000);
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]")));
		
		WebElement edit=driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]"));	
	    
		edit.click();
		
	    Thread.sleep(1000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fname']")));
		
		WebElement viewName=driver.findElement(By.xpath("//input[@id='fname']"));
					
		String vName =new String(C_getCellData(25, 3));
		
		viewName.sendKeys(vName);
		
	    Thread.sleep(1000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcol1']")));
		
		WebElement filterField=driver.findElement(By.xpath("//select[@id='fcol1']"));	
		
	    Select selectField=new Select(filterField);
	    
	    selectField.selectByVisibleText("Account Name");
	    
	    Thread.sleep(1000);
		    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fop2']")));
		
		WebElement filterOperator=driver.findElement(By.xpath("//select[@id='fop2']"));	
		
	    Select selectOperator=new Select(filterOperator);
	    
	    selectOperator.selectByVisibleText("contains");
	    
	    Thread.sleep(1000);
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fval2']")));
		
		WebElement filterValue=driver.findElement(By.xpath("//input[@id='fval2']"));
		
		String fValue =new String(C_getCellData(28, 3));
	    
		filterValue.sendKeys(fValue);
		
	    Thread.sleep(1000);
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@class='btn primary']")));
		
		WebElement save=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@class='btn primary']"));
		
		save.click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		WebElement view1=driver.findElement(By.xpath("//select[@id='fcf']"));	
		
	    Select selectView1=new Select(view1);
	    
	    selectView1.selectByVisibleText("This week");
		
		Thread.sleep(3000);	
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		viewLink();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		viewLink();
		LogOut();		
		quitBrowser();
	}

}
