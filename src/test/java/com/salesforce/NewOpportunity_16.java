package com.salesforce;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewOpportunity_16 extends BrowserUtility {

	static void NewOpp() {
		try {
			WebElement opporLink=driver.findElement(By.linkText("Opportunities"));
			
			waitForPageElementToVisible(opporLink);
						
			opporLink.click();
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
			
			driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
			
			WebElement newTab=driver.findElement(By.xpath("//input[@class='btn' and @name='new']"));
			
			waitForPageElementToVisible(newTab);

			newTab.click();
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void AddNewOpp() {
		try {
			waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='opp3']")));
			
			WebElement oppName=driver.findElement(By.xpath("//input[@id='opp3']"));
			
			oppName.clear();
			
			String oName=new String(Cr_getCellData(17, 3));
			
			oppName.sendKeys(oName);
			
			waitForPageElementToVisible(driver.findElement(By.xpath("(//img[@class='lookupIcon'])[1]")));
			
			WebElement accName=driver.findElement(By.xpath("(//img[@class='lookupIcon'])[1]"));
			
			accName.click();
			
			ArrayList<String> windowTabs = new ArrayList(driver.getWindowHandles());
			
			System.out.println(windowTabs.size()); 
			
			driver.switchTo().window(windowTabs.get(1));
			
			WebElement windowframe=driver.findElement(By.xpath("//frame[@id='resultsFrame']"));
			
			driver.switchTo().frame(windowframe);
			
		/*	WebElement table = driver.findElement(By.xpath("//table[@class='list']"));

	        List<WebElement> header = row.findElements(By.tagName("th"));
	            
	            for(WebElement head : header)
	            {
	            	if(head.equals("Miguel Smith")) {
	            		head.click();
	            	}
	    }
			}*/
			waitForPageElementToVisible(driver.findElement(By.xpath("//tr[@class='dataRow even first']//a[contains(@class,'dataCell')][contains(text(),'Miguel Smith')]")));
			
			WebElement selectAccName=driver.findElement(By.xpath("//tr[@class='dataRow even first']//a[contains(@class,'dataCell')][contains(text(),'Miguel Smith')]"));
			
			selectAccName.click();
			
			Thread.sleep(1000);
			
			driver.close();
		
			driver.switchTo().window(windowTabs.get(0));
			
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='opp9']")));
			
			WebElement closeDate=driver.findElement(By.xpath("//input[@id='opp9']"));
			
			closeDate.click();
			
			driver.findElement(By.xpath("//tr[@id='calRow5']//td[contains(@class,'weekday')][contains(text(),'30')]")).click();
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='opp11']")));
			
			WebElement stage=driver.findElement(By.xpath("//select[@id='opp11']"));
			
			Select selectStage=new Select(stage);
			
			selectStage.selectByVisibleText("Needs Analysis");
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='opp12']")));
			
			WebElement probability=driver.findElement(By.xpath("//input[@id='opp12']"));
			
			probability.clear();
			
			double prob = Cr_getNumericCellData(21, 3);
			
			String probOpp=new String(Double.toString(prob));
						
			probability.sendKeys(probOpp);
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='opp6']")));
			
			WebElement leadSource=driver.findElement(By.xpath("//select[@id='opp6']"));
			
			Select selectSource=new Select(leadSource);
			
			selectSource.selectByVisibleText("Purchased List");
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='opp17']")));
			
			WebElement priCamp=driver.findElement(By.xpath("//input[@id='opp17']"));
			
			priCamp.clear();
			
			String camp=new String(Cr_getCellData(23, 3));
			
			priCamp.sendKeys(camp);
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")));
			
			WebElement save=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
			
			save.click();
			
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
		NewOpp();
		AddNewOpp();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		NewOpp();
		LogOut();		
		quitBrowser();
	}

}
