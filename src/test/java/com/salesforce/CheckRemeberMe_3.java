package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckRemeberMe_3 extends BrowserUtility{
	
	static void remember_me()
	{
		try {
			
			
			driver.get("https://login.salesforce.com/");
			
			String sUserName = getCellData(13, 3);
			 
			String sPassword = getCellData(14, 3);
			
			Thread.sleep(5000);
			
			WebElement username=driver.findElement(By.id("username"));
			
			waitForPageElementToVisible(username);
			
			username.sendKeys(sUserName);
			
			Thread.sleep(3000);
			
			WebElement password=driver.findElement(By.id("password"));
			
			waitForPageElementToVisible(password);
			
			password.sendKeys(sPassword);
			
			WebElement rememberMe=driver.findElement(By.id("rememberUn"));
			
			waitForPageElementToVisible(rememberMe);
			
			rememberMe.click();
			
			WebElement login=driver.findElement(By.id("Login"));
			
			waitForPageElementToVisible(login);
			
			login.click();
			
			Thread.sleep(10000);
			
			WebElement UsernameArrow=driver.findElement(By.id("userNav-arrow"));
			
			waitForPageElementToVisible(UsernameArrow);
			
			UsernameArrow.click();
			
			WebElement logOut=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			
			waitForPageElementToVisible(logOut);
			
			logOut.click();
			
			Thread.sleep(5000);
			
			driver.quit();
			}catch(Exception e) {
				System.out.println(e);
			}
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BrowserUtility.driver;
		StartBrowser("chrome");
		remember_me();
		StartBrowser("firefox");
		remember_me();
	}

}
