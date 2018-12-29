package firsttestngpackage;


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

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
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
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstTestNGFile8 {
	
	
	
    public String baseUrl = "Http://Newtours.Demoaut.Com/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    String driverPath1 = "C:\\Users\\sudhakar\\Desktop\\seleni\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe";
    String actualTitle = "";
    public WebDriver driver ; 
    String expectedTitle = "Welcome: Mercury Tours";
    
    
  
    
    @BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		if(browser.equalsIgnoreCase("firefox")){

			System.setProperty("webdriver.firefox.marionette", ".\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if(browser.equalsIgnoreCase("chrome")){
		
			System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		  	 System.setProperty("webdriver.chrome.driver",driverPath);
			
			driver = new ChromeDriver();
		}

				else if(browser.equalsIgnoreCase("IE")){
	
					
					System.setProperty("webdriver.ie.driver",driverPath1);
					
					//System.setProperty("webdriver.chrome.driver",".\\ieexplore.exe");
				  //	 System.setProperty("webdriver.chrome.driver",driverPath1);
					
					 driver = new InternetExplorerDriver();

				}
		else{
		
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
    

    @Test
    public void b_verifyHomepageTitle() throws Exception{
    	
    	 driver.get(baseUrl);
     	
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
  	  
    	 actualTitle = driver.getTitle();
         Assert.assertEquals(actualTitle, expectedTitle);
        
         if (actualTitle.contentEquals(expectedTitle)){
             System.out.println("Test Passed!");
       
         } else {
             System.out.println("Test Failed");
        
        
        	
         }
         
    	
    	 System.out.println("b_verifyHomepageTitle");

    }
    
    
    @AfterTest
    
    public void c_Closesession()
    {
        driver.quit();
    }
    
    
  
	
}
  
  
