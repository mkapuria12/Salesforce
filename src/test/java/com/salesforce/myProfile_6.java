package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class myProfile_6 extends BrowserUtility{
	
	static void myProfile()
	{
		try {
			
			WebElement UsernameArrow=driver.findElement(By.id("userNav-arrow"));
			
			waitForPageElementToVisible(UsernameArrow);
						
			UsernameArrow.click();
			
			Thread.sleep(2000);
			
			WebElement open_myProfile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
			
			waitForPageElementToVisible(open_myProfile);
						
			open_myProfile.click();
			
			Thread.sleep(1000);
			
			WebElement editProfile=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
			
			waitForPageElementToVisible(editProfile);
			
			editProfile.click();
			
			Thread.sleep(1000);
			
			driver.switchTo().frame("contactInfoContentId");
			
			WebElement editProfile_about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
			
			waitForPageElementToVisible(editProfile_about);
			
			editProfile_about.click();
			
			String uLastName = S_getCellData(13, 3);
			
			WebElement update_Lastname=driver.findElement(By.id("lastName"));
			
			waitForPageElementToVisible(update_Lastname);
			
			update_Lastname.sendKeys(uLastName);
			
			WebElement saveAll=driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
			
			waitForPageElementToVisible(saveAll);
			
			saveAll.click();
		
			Thread.sleep(3000);
		
			}catch(Exception e) 
		    {
				System.out.println(e);
			}
	}

	
	static void postLink()
	{
		try {
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']/span[1]")));
			driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']/span[1]")).click();
			
			waitForPageElementToVisible(driver.findElement(By.tagName("iframe")));
			WebElement frame=driver.findElement(By.tagName("iframe"));
			driver.switchTo().frame(frame);
			System.out.println("Switched to frame"+ frame);
		
			
			WebElement messagebox=driver.findElement(By.xpath("/html/body"));
			messagebox.click();
			System.out.println("Msg box clicked");
			Thread.sleep(2000);
			
			
			WebElement messagebox1=driver.findElement(By.xpath("/html/body"));
			System.out.println("Sending msg to post");
			String textPost1 =S_getCellData(16, 3);
			messagebox1.clear();
			messagebox1.sendKeys("textPost1");
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			System.out.println("back to default frame");

		WebElement sharePost=driver.findElement(By.id("publishersharebutton"));
		
		waitForPageElementToVisible(sharePost);
		
		sharePost.click();
		
		Thread.sleep(3000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void fileLink()
	{
		try {
			
			WebElement file=driver.findElement(By.xpath("//span[contains(text(),'File')]"));
			
			waitForPageElementToVisible(file);
			
			file.click();
			
			WebElement uploadFile=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
			
			waitForPageElementToVisible(uploadFile);
			
			uploadFile.click();
			
			WebElement chooseFile=driver.findElement(By.xpath("//input[@id='chatterFile']"));
			
			waitForPageElementToVisible(chooseFile);
			
			String choosefileCell =S_getCellData(19, 3);
			
			chooseFile.sendKeys(choosefileCell);
			
			Thread.sleep(5000);
			
			WebElement shareFile=driver.findElement(By.id("publishersharebutton"));
			
			waitForPageElementToVisible(shareFile);
			
			shareFile.click();
		
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			System.out.println(e);

		}
	}
	
	/*static void addPhoto()
	{
		try {
			
			waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='displayBadge']")));
			
			WebElement moderator=driver.findElement(By.xpath("//span[@id='displayBadge']"));
			
			Actions action=new Actions(driver);
			
			action.moveToElement(moderator);*/
			
//			waitForPageElementToVisible(driver.findElement(By.xpath("///span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")));
//			
//			WebElement add_photo=driver.findElement(By.xpath("//img[@class='recImage photo']"));
//			
//			add_photo.click();
//			
			/*driver.switchTo().frame("/userprofile/photo/upload.apexp?u=0055w00000C04wq");
			
			waitForPageElementToVisible(driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile")));
			
			WebElement choose_photo=driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
			
			choose_photo.click();	

			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}*/

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=BrowserUtility.driver;
		
		StartBrowser("chrome");
		login();
		myProfile();
		postLink();
		fileLink();
		//addPhoto();
		quitBrowser();
		
		StartBrowser("firefox");
		login();
		myProfile();
		postLink();
		fileLink();
		//addPhoto();
		quitBrowser();	
	}

}
