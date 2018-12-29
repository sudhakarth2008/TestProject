package firsttestngpackage;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FirstTestNGFile3 {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    String actualTitle = "";
    public WebDriver driver ; 
    String expectedTitle = "Welcome: Mercury Tours";
 
    
    @BeforeTest
    public void setBaseURL(){
    	
    	// System.setProperty("webdriver.chrome.driver",driverPath);
    	// driver = new ChromeDriver();      
    	// driver.get(baseUrl);
        // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
         System.out.println("launching chrome browser"); 
     
    }
    
 
  
  
  
  @AfterTest
  public void endSession(){
  //driver.quit();
  

  }

  @Test  
public void c_DataDriven() throws Exception
{
	
    	ExcelApiTest4 eat = new ExcelApiTest4();
    	 eat.PutCellFormula("E://Test.xls","Sheet1", 5 , 1 , "Monkey123");
    	
    	 /* System.out.println(eat.getCellData("E://Test.xls","Sheet1",0,0));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",0,1));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",1,0));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",1,1));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",2,0));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",2,1));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",3,0));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",3,1));
           	
    	eat.PutCellData("E://Test.xls","Sheet1", 4 , 0 , "Venkat");
        eat.PutCellData("E://Test.xls","Sheet1", 4 , 1 , "Venkat123");
        eat.PutCellData("E://Test.xls","Sheet1", 5 , 0 , "Monkey");
        eat.PutCellData("E://Test.xls","Sheet1", 5 , 1 , "Monkey123"); 
    
      System.out.println(eat.getCellData("E://Test.xls","Sheet1",4,0));
  	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",4,1));
  	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",5,0));
  	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",5,1));
  	  */
     
    }
  

  
	
}
  
  
