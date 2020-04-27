package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RecentlyCreated_27 extends BrowserUtility{

		static void contacts() {
			try {
				WebElement contactsLink=driver.findElement(By.linkText("Contacts"));
				
				waitForPageElementToVisible(contactsLink);
							
				contactsLink.click();	
				
				System.out.println("Clicked succssfully and navigated to contatcs Homepage.");
				
				waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
				
				driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}

		static void recentlyView() {
			try {
				WebElement recViewed=driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
				
				waitForPageElementToVisible(recViewed);
				
				Select selectRecent=new Select(recViewed);
							
				selectRecent.selectByVisibleText("Recently Created");
				
				System.out.println("Clicked succssfully and navigated to Recently Created Homepage.");
		
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=BrowserUtility.driver;
	
	StartBrowser("chrome");
	login();
	contacts();
	recentlyView();
	LogOut();		
	quitBrowser();

	StartBrowser("firefox");
	login();
	contacts();
	recentlyView();
	LogOut();		
	quitBrowser();
	
}
}
