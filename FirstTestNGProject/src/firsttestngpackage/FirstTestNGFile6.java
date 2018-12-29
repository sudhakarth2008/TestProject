package firsttestngpackage;

import org.openqa.selenium.logging.*;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

public class FirstTestNGFile6 {
	
	
	
    public String baseUrl = "Http://Newtours.Demoaut.Com/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    String actualTitle = "";
    public WebDriver driver ; 
    String expectedTitle = "Welcome: Mercury Tours";
    
     /* BasicConfigurator.configurator();
	 Logger log = Logger.getLogger("FirstTestNGFile6");
	 PropertyConfigurator.configure("log4j.properties");  */
    private static final Logger log = Logger.getLogger(FirstTestNGFile6.class);
    
    @BeforeTest
    public void setBaseURL(){
    	
    	 System.setProperty("webdriver.chrome.driver",driverPath);
    	 driver = new ChromeDriver(); 
    	 
    	 BasicConfigurator.configure();  	 
    	//Logger log = Logger.getLogger("devpinoyLogger");
    	// Logger log = Logger.getLogger("FirstTestNGFile6");
    	 
    	 
    	 PropertyConfigurator.configure("log4j.properties");
    	 
    	//Logger log1 = Logger.getLogger(name)
    	 driver.get(baseUrl);
    	// log.info("opening webiste567");
    	  //  System.out.println("launching chrome browser"); 
    	  /*  
    	    log.info("opening webiste123");
    	    log.info("opening webiste5678");
    	    log.info("opening webiste5679");
    	    log.info("opening webiste56710");
   
    	    log.info("opening webiste56711");
    	    log.info("opening webiste56712");
    	    log.info("opening webiste56713");
    	    log.info("opening webiste567141");
    	    */
         driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
         
         actualTitle = driver.getTitle();
         Assert.assertEquals(actualTitle, expectedTitle);
         
        // ExcelApiTest3 eat = new ExcelApiTest3();
         
         if (actualTitle.contentEquals(expectedTitle)){
             System.out.println("Test Passed!");
            // eat.PutCellData("E://Test1.xls","Sheet1", 0 , 2 , "Pass");
        	   log.info("opening webiste5671888");
        	  //  log.debug("selecting kilograms777");
         } else {
             System.out.println("Test Failed");
             //eat.PutCellData("E://Test1.xls","Sheet1", 0 , 2 , "Fail");
        	    log.info("opening webiste567999");
        	
         }
         
     
         driver.quit();
    }
  
    

    @Test
    public void b_verifyHomepageTitle() throws Exception{
  	  
    	// Logger log = Logger.getLogger("FirstTestNGFile6");
    	
    	 System.out.println("b_verifyHomepageTitle");

    }
    
    
    
    
    
  
	
}
  
  
