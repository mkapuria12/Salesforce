package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateLastName_34 extends BrowserUtility{
	
	static void homeTab() {
		try {
			WebElement homeLink=driver.findElement(By.linkText("Home"));
			
			waitForPageElementToVisible(homeLink);
						
			homeLink.click();	
			
			System.out.println("Clicked succssfully and navigated to Home page.");
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")));
			
			driver.findElement(By.xpath("//a[@id='tryLexDialogX' and @class='dialogClose']")).click();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void AccountHolderLink() {
		try {
			WebElement ownerLink=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]"));
			
			waitForPageElementToVisible(ownerLink);
						
			ownerLink.click();	
			
			System.out.println("Clicked succssfully and navigated to another page which is same as My Profile page.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void editProfileIcon() {
		try {
			WebElement editProfile=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
			
			waitForPageElementToVisible(editProfile);
			
			editProfile.click();
			Thread.sleep(1000);
			
			System.out.println("Clicked succssfully and navigated to another window.");
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void about() {
		try {
			driver.switchTo().frame("contactInfoContentId");
			
			Thread.sleep(2000);
			
			WebElement editProfile_about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
			
			waitForPageElementToVisible(editProfile_about);
			
			editProfile_about.click();
			
			System.out.println("About button is clicked.");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void firstNameAbout() {
		try {
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='firstName']")));
			
			WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
			
			firstName.click();
			
			System.out.println("Focus is on first name now.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void lastNameAbout() {
		try {
			String uLastName = new String(Random_getCellData(12, 3));
			
			WebElement update_Lastname=driver.findElement(By.id("lastName"));
			
			waitForPageElementToVisible(update_Lastname);
			
			System.out.println("Focus is on last name now.");
			
			update_Lastname.clear();
			
			update_Lastname.sendKeys(uLastName);
			
			System.out.println(update_Lastname.getText());
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void saveAll() {
		try {
			WebElement saveAll=driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
			
			waitForPageElementToVisible(saveAll);
			
			saveAll.click();
			
			System.out.println("Clicked on save all button.");
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void AccountHolderNameLeft() {
		try {
			WebElement ownerNameL=driver.findElement(By.id("tailBreadcrumbNode"));
			
			waitForPageElementToVisible(ownerNameL);
						
			System.out.println("Here is the updated last name of Account holder:- "+ownerNameL.getText());
						
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void AccountHolderNameRight() {
		try {
			WebElement ownerNameR=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			
			waitForPageElementToVisible(ownerNameR);
						
			System.out.println("Here is the updated last name of Account holder at right top:- "+ownerNameR.getText());
						
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void verifyNameleftRight() {
		try {
			
			WebElement ownerNameL=driver.findElement(By.id("tailBreadcrumbNode"));
			
			waitForPageElementToVisible(ownerNameL);
			
			String left=ownerNameL.getText();
			WebElement ownerNameR=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			
			waitForPageElementToVisible(ownerNameR);
			String right=ownerNameR.getText();

			if(left.equalsIgnoreCase(right)) {
				System.out.println("The updated last name of Account holder are same at left and right sides of the page.");
			}
						
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		homeTab();
		AccountHolderLink();
		editProfileIcon();
		about();
		firstNameAbout();
		lastNameAbout();
		saveAll();
		AccountHolderNameLeft();
		AccountHolderNameRight();
		verifyNameleftRight();
		LogOut();		
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		homeTab();
		AccountHolderLink();
		editProfileIcon();
		about();
		saveAll();
		AccountHolderNameLeft();
		AccountHolderNameRight();
		verifyNameleftRight();
		LogOut();		
		quitBrowser();
	
	}

}
