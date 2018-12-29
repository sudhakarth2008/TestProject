package firsttestngpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

public class Facebook2 {
	
    public String baseUrl = "https://www.facebook.com/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ; 

  @Test
  public void b_verifyHomepageTitle() throws Exception{
  	
	 }
 
  
  
  @BeforeTest
  public void setBaseURL() throws IOException
	{
  	
	  File src= new File("C:\\Users\\sudhakar\\Desktop\\application.properties");
	  FileInputStream fis = new FileInputStream(src);
	  Properties prop = new Properties(); 
	  prop.load(fis);
	  
	  String EmailTextBox = prop.getProperty("EmailTextBox");
	  String PasswordTextBox = prop.getProperty("PasswordTextBox");
	  String LoginButton = prop.getProperty("LoginButton");
	  String LogoutMenuInvoke = prop.getProperty("LogoutMenuInvoke");
	  String Logout = prop.getProperty("Logout");
	  
	  
 	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--disable-notifications");
	 
	 System.setProperty("webdriver.chrome.driver",driverPath);
	 driver =new ChromeDriver(options);
	 driver.get(baseUrl);
 	 driver.manage().window().maximize() ;
 	 
	 Actions actions = new Actions(driver);
	 
	   driver.findElement(By.xpath(EmailTextBox)).sendKeys("sudhakarth2009@gmail.com");
       driver.findElement(By.xpath(PasswordTextBox)).sendKeys("babli12345");
       driver.findElement(By.xpath(LoginButton)).click();


	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
	  
	  
      driver.findElement(By.xpath(LogoutMenuInvoke)).click();

    	
      try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
     driver.findElement(By.xpath(Logout)).click();
     
	}


  @AfterTest
  public void afterTest() {
	  
	driver.quit();
	  
  }
  

}
