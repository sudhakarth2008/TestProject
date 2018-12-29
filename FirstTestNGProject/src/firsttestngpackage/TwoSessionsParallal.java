package firsttestngpackage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TwoSessionsParallal {
	
	   public String baseUrl = "Http://Newtours.Demoaut.Com/";
	    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	    String driverPath1 = "C:\\Users\\sudhakar\\Desktop\\seleni\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe";
	    String actualTitle = "";
	    public WebDriver driver ; 
	    String expectedTitle = "Welcome: Mercury Tours";
	    
    @Test    
    public void executSessionOne(){
         
	  	 System.setProperty("webdriver.chrome.driver",driverPath);
        
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("Driver 1");
            
        }
        
    @Test    
        public void executeSessionTwo(){
          
    	System.setProperty("webdriver.ie.driver",driverPath1);
   	   driver = new InternetExplorerDriver();
   	   driver.get("http://demo.guru99.com/V4/");
       driver.findElement(By.name("uid")).sendKeys("Driver 2");
        
        }
        
   
}