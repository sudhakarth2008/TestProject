package firsttestngpackage;

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


public class DirstTestNGFile7 {
	
	
	
    public String baseUrl = "Http://Newtours.Demoaut.Com/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    String actualTitle = "";
    public WebDriver driver ; 
    String expectedTitle = "Welcome: Mercury Tours";
 
    
    @BeforeTest
    public void setBaseURL(){
    	
    	 System.setProperty("webdriver.chrome.driver",driverPath);
    	 driver = new ChromeDriver(); 
    	 
    	 BasicConfigurator.configure();
    	
    	 
    	 Logger log = Logger.getLogger("FirstTestNGFile6");
    	 PropertyConfigurator.configure("log4j.properties");
    	 
    	//Logger log1 = Logger.getLogger(name)
    	 driver.get(baseUrl);
    	 log.info("opening webiste");
    	    System.out.println("launching chrome browser"); 
    	    
    	    log.info("opening webiste123");
    	    
         driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
     
         driver.quit();
    }
  
  
	
}
  
  
