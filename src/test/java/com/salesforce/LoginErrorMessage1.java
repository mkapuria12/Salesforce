package com.salesforce;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginErrorMessage1 extends BrowserUtility{

	public static void main(String[] args) throws FileNotFoundException {
		try {
		
		WebDriver driver=null;
		
		WebDriverManager.chromedriver().setup();
			
		driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		
		driver.get("https://login.salesforce.com/");
		
		String sUserName = getCellData(3, 3);
		 
		String sPassword = getCellData(4, 3);
		
		Thread.sleep(10000);
		
		WebElement username=driver.findElement(By.id("username"));
		
		username.sendKeys(sUserName);
		
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.id("password"));
		
		password.sendKeys(sPassword);
		
		WebElement login=driver.findElement(By.id("Login"));
		
		login.click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
