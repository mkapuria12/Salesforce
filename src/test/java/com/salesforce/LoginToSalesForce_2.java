package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToSalesForce_2 extends BrowserUtility{

	public static void main(String[] args) {

		try {
		StartBrowser("chrome");
		
		WebDriver driver=BrowserUtility.driver;
		
		driver.get("https://login.salesforce.com/");
		
		String sUserName = getCellData(8, 3);
		 
		String sPassword = getCellData(9, 3);
		
		Thread.sleep(10000);
		
		WebElement username=driver.findElement(By.id("username"));
		
		username.sendKeys(sUserName);
		
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.id("password"));
		
		password.sendKeys(sPassword);
		
		WebElement login=driver.findElement(By.id("Login"));
		
		login.click();
		
		Thread.sleep(10000);
		
		driver.quit();
		}catch(Exception e) {
			System.out.println(e);
		}

}	
}
