package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword_4A extends BrowserUtility{
	
	static void forgot_passowrd()
	{
		try {
			
			driver.get("https://login.salesforce.com/");
			
			String sUserName = getCellData(23, 3);
			
			System.out.println(sUserName);
			
			WebElement forgotPassword=driver.findElement(By.id("forgot_password_link"));
			
			waitForPageElementToVisible(forgotPassword);
			
			forgotPassword.click();
			
			WebElement username=driver.findElement(By.id("un"));
			
			waitForPageElementToVisible(username);
			
			username.sendKeys(sUserName);	
			
			Thread.sleep(3000);
			
			WebElement continueButton=driver.findElement(By.id("continue"));
			
			waitForPageElementToVisible(continueButton);
			
			continueButton.click();
			
			Thread.sleep(5000);
			
			driver.quit();
			}catch(Exception e) {
				System.out.println(e);
			}
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BrowserUtility.driver;
		StartBrowser("chrome");
		forgot_passowrd();
		StartBrowser("firefox");
		forgot_passowrd();
	}

}
