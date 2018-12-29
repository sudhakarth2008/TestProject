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
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
public class LoginDemo4 {
	

    public String baseUrl = "https://www.amazon.in/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
       public WebDriver driver ; 
       
       
    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = "";
		
  @Test
  public void b_verifyHomepageTitle() throws Exception{
  	 

 }
 
  
  
  @BeforeTest
  public void setBaseURL(){
  	
  	
 	 System.setProperty("webdriver.chrome.driver",driverPath);
 	 driver = new ChromeDriver(); 
 	 
 	 
 	 driver.get(baseUrl);
 	
     
 	 
 	driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
 	 
 	driver.findElement(By.xpath("//input[@name='email' and @type='email']")).sendKeys("sudhakarth2008@gmail.com");
 	driver.findElement(By.xpath("//input[@id='continue' and @type='submit']")).click();
 	driver.findElement(By.xpath("//input[@name='password' and @type='password'] ")).sendKeys("babli1234");
 	driver.findElement(By.xpath("//input[@id='signInSubmit'] ")).click();

 	
 }

  @AfterTest
  public void afterTest() {
	  
	 driver.quit();
	  
  }
  

}
