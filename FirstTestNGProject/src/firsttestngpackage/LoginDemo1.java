package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginDemo1 {
	
	
	 	public String baseUrl = "https://www.amazon.in/";
	    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	    public WebDriver driver ; 
	
	
  @Test
  public void f() {
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver",driverPath);
	 	 driver = new ChromeDriver(); 
	 	 
	 	driver.get(baseUrl);
	  
  }
  
  

  @AfterTest
  public void afterTest() {
	  
	 // driver.quit();
  }
  
  
  

}
