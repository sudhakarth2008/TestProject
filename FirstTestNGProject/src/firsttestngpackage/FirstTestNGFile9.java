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
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstTestNGFile9 {
	
	
	
    public String baseUrl = "Http://Newtours.Demoaut.Com/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    String driverPath1 = "C:\\Users\\sudhakar\\Desktop\\seleni\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe";
    String actualTitle = "";
    public WebDriver driver ; 
    String expectedTitle = "Welcome: Mercury Tours";
    
    String nodeUrl;
  
    //java -jar selenium-server-standalone-3.141.59.jar -role node  -hub http://localhost:4444/grid/register
   
    //java -Dwebdriver.chrome.driver="C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.0.3:4444/grid/register -port 5566
    
    @BeforeTest
	public void setup() throws Exception{
    	   
    	 baseUrl="Http://Newtours.Demoaut.Com/";
    	 nodeUrl="http://192.168.0.3:5566/wd/hub";
    	DesiredCapabilities capability = DesiredCapabilities.chrome();
      	capability.setBrowserName("chrome");
    	driver = new RemoteWebDriver(new URL(nodeUrl), capability);
    	
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
  
  
