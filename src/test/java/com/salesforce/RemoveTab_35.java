package com.salesforce;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RemoveTab_35 extends BrowserUtility{
	
	static void plusSignOnTab() {
		try {
			WebElement plusLink=driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a"));
			
			waitForPageElementToVisible(plusLink);
						
			plusLink.click();	
			
			System.out.println("Clicked succssfully and navigated to new All Tab page.");
	
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void customizeMyTab() {
		try {
			WebElement customize=driver.findElement(By.xpath("//input[@name='customize']"));
			
			waitForPageElementToVisible(customize);
						
			customize.click();	
			
			System.out.println("Clicked succssfully and navigated to Customize My Tabs page.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void selectedTab() {
		try {
			WebElement selectedTabList=driver.findElement(By.xpath("//select[@id='duel_select_1']"));
			
			waitForPageElementToVisible(selectedTabList);
						
			Select selectTabToRemove=new Select(selectedTabList);
			
			selectTabToRemove.selectByVisibleText("Chatter");
			
			System.out.println("Chatter is selected");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void removeTab() {
		try {
			WebElement remove=driver.findElement(By.xpath("//img[@class='leftArrowIcon']"));
			
			waitForPageElementToVisible(remove);
			
			System.out.println(remove.isDisplayed());
						
			remove.click();
			
			System.out.println("Remove button clicked.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void availableTab() {
		try {
			WebElement available=driver.findElement(By.xpath("//select[@id='duel_select_0']"));
			
			waitForPageElementToVisible(available);
			
			System.out.println(available.isDisplayed());
						
			Select selectTabToavailable=new Select(available);
			
			selectTabToavailable.selectByVisibleText("Chatter");
			
			System.out.println("Chatter is selected");
						
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void save() {
		try {
			WebElement saveButton=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]"));
			
			waitForPageElementToVisible(saveButton);
			
			System.out.println(saveButton.isDisplayed());
						
			saveButton.click();
			
			System.out.println("saveButton button clicked.");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void checkRemovedTabOnBar() {
		try {
						
             WebElement tabBar=driver.findElement(By.xpath("//div[@id='tabContainer']//nav"));
			
			waitForPageElementToVisible(tabBar);
			
			System.out.println(tabBar.isDisplayed());
						
			List<WebElement> li =tabBar.findElements(By.xpath("//div[@id='tabContainer']//nav"));
			
			for(int count=0;count<li.size();count++) 
			{
			System.out.println(li.get(count).getText());
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
		plusSignOnTab();
		customizeMyTab();
		selectedTab();
		removeTab();
		availableTab();
		save();
		checkRemovedTabOnBar();
		LogOut();
		login();
		checkRemovedTabOnBar();
		LogOut();
		quitBrowser();
	
		StartBrowser("firefox");
		login();
		plusSignOnTab();
		customizeMyTab();
		selectedTab();
		removeTab();
		availableTab();
		save();
		checkRemovedTabOnBar();
		LogOut();
		login();
		checkRemovedTabOnBar();
		LogOut();		
		quitBrowser();
	
	}
}
