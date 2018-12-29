package firsttestngpackage;

import org.testng.annotations.Test;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Hyperlink;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class  LoginDemo3 implements Reusablemethods{
	

    public String baseUrl = "https://www.amazon.in/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    String actualTitle = "";
   public WebDriver driver ; 
    String expectedTitle = "Welcome: Mercury Tours";
    
 
    

   // System.setProperty("webdriver.chrome.driver",driverPath);
	// driver = new ChromeDriver(); 
 
    @BeforeTest
    public void b_verifyHomepageTitle1() throws Exception{
    	  
   	//  setBaseURL();
   	 // logoutmethod();
   	//  closebrowser();

    }
    
    
  @Test
  public void b_verifyHomepageTitle() throws Exception{
  	  
	 // setBaseURL();
	 // logoutmethod();
	//  closebrowser();

 }
 
  public void setBaseURL(){
  	
  	 System.setProperty("webdriver.chrome.driver",driverPath);
 	 driver = new ChromeDriver(); 
 	 driver.get(baseUrl);
 	//Maximizes the browser window
 	driver.manage().window().maximize() ;
  //  WebDriverWait wait=new WebDriverWait(driver, 5);
 	
  }  
  
  public String LoginMethod(String UserName,String Password,String TestCaseName,String TestClassName){
	  
	
	  String loginFlag;
	  
	  if (driver !=null)
	  {
		  System.out.println("Driver is not null");
	  }
	  else
	  {
		  System.out.println("Driver is  null");
	  }
	  
 	driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
 	driver.findElement(By.xpath("//input[@name='email' and @type='email']")).sendKeys(UserName);
 	driver.findElement(By.xpath("//input[@id='continue' and @type='submit']")).click();
 	driver.findElement(By.xpath("//input[@name='password' and @type='password'] ")).sendKeys(Password);
 	
 	try {
    ExcelApiTest3 eat = new ExcelApiTest3();
   // String sheetpath="E://"+TestCaseName+".xls";
    String sheetpath=TestCaseName;
    eat.PutCellData(sheetpath,"Sheet1",1,5, "Login Success");
 	eat.PassPutCellData(sheetpath,"Sheet1",1,6, "PASS");
 	this.takeSnapShot(driver,TestCaseName,TestClassName,1,7,"Login Screen") ;  
 	}catch(Exception e) {}
 	
 	
 	
 	driver.findElement(By.xpath("//input[@id='signInSubmit'] ")).click();
 	
 	
 	
 //	WebElement ele1=driver.findElement(By.xpath("//*[@id='nav-item-signout']/span"));
 	
 	
 	
 	/*
 	
 	if(driver.findElements(By.xpath("//*[@id='nav-item-signout']/span")).size() != 0){
 		System.out.println("Element is Present");
 		}else{
 		System.out.println("Element is Absent");
 		} */
 	
 	// new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(ele1));
 
 	
 	 
 	if(driver.findElements(By.xpath("//*[@id='nav-item-signout']/span")).size() != 0){
 		
 		System.out.println("Valid Credentials ,Home Page Navigation is Success");
 		//ExcelApiTest3 eat = new ExcelApiTest3();
		
 	
 			
 			try {
 			    ExcelApiTest3 eat = new ExcelApiTest3();
 			  // String sheetpath="E://"+TestCaseName+".xls";
 			  String sheetpath=TestCaseName;
 			 	eat.PutCellData(sheetpath,"Sheet1",2,5, "Success fully logged");
 			 	eat.PassPutCellData(sheetpath,"Sheet1",2,6, "PASS");
 			 	 this.takeSnapShot(driver,TestCaseName,TestClassName,2,7,"After Login") ;  
 		 	    //  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
 			 	}catch(Exception e) {}
 			 	
 		
		//UserName1=eat.getCellData("E://Test1.xls","Sheet1",0,0);
		
 		loginFlag="Success";
 		return loginFlag; 		
 		}
 	
 	else{
 		System.out.println("Invalid Credentials ,Home Page Navigation Failed");
 		loginFlag="Failed";
 		
 		
 		try {
 			
 			System.out.println("Invalid Credentials ,Home Page Navigation Failed");
 	 		loginFlag="Failed";
 	 		
			    ExcelApiTest3 eat = new ExcelApiTest3();
			    String sheetpath="E://"+TestCaseName+".xls";
			   // String sheetpath=TestCaseName;
			 	eat.PutCellData(sheetpath,"Sheet1",2,5, "Invalid Credemtials");
			 	eat.FailPutCellData(sheetpath,"Sheet1",2,6, "FAIL");
			 	 this.takeSnapShot(driver,TestCaseName,TestClassName,2,7,"Login Failed") ;  
		 	    //  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
			 	}catch(Exception e) {
			 		
			 		System.out.println("Element Not found trying again  " );
		            e.printStackTrace();
			 	}
 		
 		
 		
 		return loginFlag;
 		}
 	
  }
 	  
 	
 	
  public void logoutmethod(String TestCaseName,String TestClassName) {
	  
	  
	  
	  Actions actions = new Actions(driver);
	 WebElement ele=driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[2]"));
 	 new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(ele));
 
 	try {
 		Thread.sleep(1000);
 	 actions.moveToElement(ele).perform();
 	Thread.sleep(6000);
 	 	
 	//Signout code
 	WebElement ele1=driver.findElement(By.xpath("//*[@id='nav-item-signout']/span"));
  	 new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(ele1));
  	Thread.sleep(1000);
	 actions.moveToElement(ele1).perform();
	   
	
	 try {
		    ExcelApiTest3 eat = new ExcelApiTest3();
		    
		   //String sheetpath="E://"+TestCaseName+".xls";
		    String sheetpath=TestCaseName;
		 	eat.PutCellData(sheetpath,"Sheet1",3,5, "Logged out Successfully");
		 	eat.PassPutCellData(sheetpath,"Sheet1",3,6, "PASS");
		 	this.takeSnapShot(driver,TestCaseName,TestClassName,3,7,"Sign Out Action") ;
	 	    //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 	}catch(Exception e) {}
	
	 
	 
	 Thread.sleep(500);
	 actions.moveToElement(ele1).click().build().perform();
 	  	 
 	}catch (Exception e) {
 		System.out.println(e);
 		
 	}
  
}


 public void closebrowser() {
	 
	 
 	 
	  	 driver.quit();
	  
  }
 
 
 
//Method starts takeSnapShot
 public  void takeSnapShot(WebDriver webdriver,String TestCaseName,String TestClassName,int rownum,int column,String sampletext){
	 
	 

	SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");//dd/MM/yyyy
     Date now = new Date();
     String strDate = sdfDate.format(now);
	 
	 
   //Timestamp timestamp = new Timestamp(System.currentTimeMillis());
   //String str="E:\\" +TestCaseName+"\\"  +sampletext+"_" +java.time.LocalDate.now() +"_" + timestamp.getTime() +".png";
  // String str="E:\\" +TestClassName+"\\"  +sampletext+"_" +strDate +".png";
   String str=TestClassName+sampletext+"_" +strDate +".png";
   String fileWithPath=str;
   
   

   
      //Convert web driver object to TakeScreenshot
	  System.out.println("Function Invoked !");
      TakesScreenshot scrShot =((TakesScreenshot)webdriver);

      //Call getScreenshotAs method to create image file

              File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

          //Move image file to new destination

              File DestFile=new File(fileWithPath);

              //Copy file at destination
              try {
              FileUtils.copyFile(SrcFile, DestFile);
              } catch(Exception e ) {}

  
              //put cell formula starts
          	 try {
          	 ExcelApiTest3 eat = new ExcelApiTest3();
          			
          				
          				// String sheetpath="E://"+TestCaseName+".xls";
          				 String sheetpath=TestCaseName;
          				 String sheetname="Sheet1";
          				// int row,column;
          				// row=1;
          				 //column=11;
          				 
          				 eat.PutCellFormula(sheetpath,sheetname,rownum,column, fileWithPath);
          				
          			} catch (Exception e) {
          				e.printStackTrace();
          	}
          	//put cell formula ends
            
 
 }//Method ends takeSnapShot
 
 
 
 
  

}
