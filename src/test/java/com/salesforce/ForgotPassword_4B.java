package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword_4B extends BrowserUtility{

	static void invalidUsernamePaasword()
	{
		try {
			
			driver.get("https://login.salesforce.com/");
			
			double sUserName = getNumericCellData(27, 3);
			
			String invalid_username=Double. toString(sUserName);
			 
			double sPassword = getNumericCellData(28, 3);
			
			String invalid_password=Double. toString(sPassword);
			
			Thread.sleep(5000);
			
			WebElement username=driver.findElement(By.id("username"));
			
			waitForPageElementToVisible(username);
			
			username.sendKeys(invalid_username);
			
			Thread.sleep(3000);
			
			WebElement password=driver.findElement(By.id("password"));
			
			waitForPageElementToVisible(password);
			
			password.sendKeys(invalid_password);
			
			WebElement login=driver.findElement(By.id("Login"));
			
			waitForPageElementToVisible(login);
			
			login.click();
			
			Thread.sleep(10000);
			
			driver.quit();
			}catch(Exception e) {
				System.out.println(e);
			}
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BrowserUtility.driver;
		StartBrowser("chrome");
		invalidUsernamePaasword();
		StartBrowser("firefox");
		invalidUsernamePaasword();

	}

}
