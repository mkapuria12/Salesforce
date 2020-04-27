package com.salesforce;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {
	
	public static WebDriver driver;
	
    public static String getCellData(int RowNum, int ColNum) throws Exception
    {
	String sFile ="/Users/Mit/eclipse-workspace/Salesforce/Salesforce_TestData.xls";

		    FileInputStream fi = new FileInputStream(sFile);
			
			HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(sFile));
			
			HSSFSheet myfirstSheet = myExcelBook.getSheet("SFDC Login");
			
			HSSFCell Cell =myfirstSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();
	      
			return CellData;	
    }
    
    public static double getNumericCellData(int RowNum, int ColNum) throws Exception
    {
	String sFile ="/Users/Mit/eclipse-workspace/Salesforce/Salesforce_TestData.xls";

		    FileInputStream fi = new FileInputStream(sFile);
			
			HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(sFile));
			
			HSSFSheet myfirstSheet = myExcelBook.getSheet("SFDC Login");
			
			HSSFCell Cell =myfirstSheet.getRow(RowNum).getCell(ColNum);
				
			double CellData = Cell.getNumericCellValue();
				
			return CellData;
      
    }
    
    public static String S_getCellData(int RowNum, int ColNum) throws Exception
    {
	String sFile ="/Users/Mit/eclipse-workspace/Salesforce/Salesforce_TestData.xls";

		    FileInputStream fi1 = new FileInputStream(sFile);
			
			HSSFWorkbook myExcelBook1 = new HSSFWorkbook(new FileInputStream(sFile));
			
			HSSFSheet mySecondSheet1 = myExcelBook1.getSheet("User menu drop down");
			
			HSSFCell S_Cell =mySecondSheet1.getRow(RowNum).getCell(ColNum);

			String S_CellData = S_Cell.getStringCellValue();
	      
			return S_CellData;	
    }
    
    public static String C_getCellData(int RowNum2, int ColNum2) throws Exception
    {
	String sFile ="/Users/Mit/eclipse-workspace/Salesforce/Salesforce_TestData.xls";

		    FileInputStream fi2 = new FileInputStream(sFile);
			
			HSSFWorkbook myExcelBook2 = new HSSFWorkbook(new FileInputStream(sFile));
			
			HSSFSheet mySecondSheet2 = myExcelBook2.getSheet("Create Account");
			
			HSSFCell C_Cell =null;
			
			C_Cell=mySecondSheet2.getRow(RowNum2).getCell(ColNum2);
			
			String C_CellData = null;
			
			C_CellData=C_Cell.getStringCellValue();
	      
			return C_CellData;	
    }
    public static String Cr_getCellData(int RowNum2, int ColNum2) throws Exception
    {
	String sFile ="/Users/Mit/eclipse-workspace/Salesforce/Salesforce_TestData.xls";

		    FileInputStream fi2 = new FileInputStream(sFile);
			
			HSSFWorkbook myExcelBook2 = new HSSFWorkbook(new FileInputStream(sFile));
			
			HSSFSheet mySecondSheet2 = myExcelBook2.getSheet("Create Opty");
			
			HSSFCell Cr_Cell =null;
			
			Cr_Cell=mySecondSheet2.getRow(RowNum2).getCell(ColNum2);
			
			String Cr_CellData = null;
			
			Cr_CellData=Cr_Cell.getStringCellValue();
	      
			return Cr_CellData;	
    }
    
    public static double Cr_getNumericCellData(int RowNum, int ColNum) throws Exception
    {
	String sFile ="/Users/Mit/eclipse-workspace/Salesforce/Salesforce_TestData.xls";

		    FileInputStream fi = new FileInputStream(sFile);
			
			HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(sFile));
			
			HSSFSheet myfirstSheet = myExcelBook.getSheet("Create Opty");
			
			HSSFCell Cell =myfirstSheet.getRow(RowNum).getCell(ColNum);
				
			double CellData = Cell.getNumericCellValue();
				
			return CellData;
      
    }
    public static String L_getCellData(int RowNum2, int ColNum2) throws Exception
    {
	String sFile ="/Users/Mit/eclipse-workspace/Salesforce/Salesforce_TestData.xls";

		    FileInputStream fi2 = new FileInputStream(sFile);
			
			HSSFWorkbook myExcelBook2 = new HSSFWorkbook(new FileInputStream(sFile));
			
			HSSFSheet mySecondSheet2 = myExcelBook2.getSheet("Leads");
			
			HSSFCell L_Cell =null;
			
			L_Cell=mySecondSheet2.getRow(RowNum2).getCell(ColNum2);
			
			String L_CellData = null;
			
			L_CellData=L_Cell.getStringCellValue();
	      
			return L_CellData;	
    }
    public static String Contacts_getCellData(int RowNum2, int ColNum2) throws Exception
    {
	String sFile ="/Users/Mit/eclipse-workspace/Salesforce/Salesforce_TestData.xls";

		    FileInputStream fi2 = new FileInputStream(sFile);
			
			HSSFWorkbook myExcelBook2 = new HSSFWorkbook(new FileInputStream(sFile));
			
			HSSFSheet mySecondSheet2 = myExcelBook2.getSheet("Contacts");
			
			HSSFCell L_Cell =mySecondSheet2.getRow(RowNum2).getCell(ColNum2);

			String L_CellData = new String(L_Cell.getStringCellValue());
      
			return L_CellData;	
    }
    public static String Random_getCellData(int RowNum2, int ColNum2) throws Exception
    {
	String sFile ="/Users/Mit/eclipse-workspace/Salesforce/Salesforce_TestData.xls";

		    FileInputStream fi2 = new FileInputStream(sFile);
			
			HSSFWorkbook myExcelBook2 = new HSSFWorkbook(new FileInputStream(sFile));
			
			HSSFSheet mySecondSheet2 = myExcelBook2.getSheet("RandomScenarios");
			
			HSSFCell L_Cell =mySecondSheet2.getRow(RowNum2).getCell(ColNum2);

			String L_CellData = new String(L_Cell.getStringCellValue());
      
			return L_CellData;	
    }
	static void StartBrowser(String str) throws InterruptedException
	{
		try {
		if(str.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
				
		}
		else if(str.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			driver=new FirefoxDriver();
			
			driver.get("http://google.com");
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static void login()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://login.salesforce.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("mitali.k@salesforce.com");

		WebElement password=driver.findElement(By.id("password"));

		password.sendKeys("test@123");

		driver.findElement(By.id("Login")).click();

	}
	
    static void LogOut()
    {
    	
    	WebElement UsernameArrow=driver.findElement(By.id("userNav-arrow"));
		
		waitForPageElementToVisible(UsernameArrow);
					
		UsernameArrow.click();
				
    	WebElement logOut=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		
		waitForPageElementToVisible(logOut);
		
		logOut.click();
    }
    
    static void waitForPageElementToVisible(WebElement eleToWait) 
    {
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		
		wait.until(ExpectedConditions.visibilityOf(eleToWait));
		
	}	
	static void quitBrowser()
	{
		driver.quit();
	}



}
