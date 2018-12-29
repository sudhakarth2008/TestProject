package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginDemo2 {
	
	public String baseUrl = "http://newtours.demoaut.com/index.php?osCsid=94133982b062a4bd77adfb95d86c77dd";
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
	 	 	
	 	 	driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
	 	 	driver.findElement(By.xpath("//input[@name='email' and @type='email']")).sendKeys("sudhakarth2008@gmail.com");
	 	 	driver.findElement(By.xpath("//input[@id='continue' and @type='submit']")).click();
	 	 	driver.findElement(By.xpath("//input[@name='password' and @type='password'] ")).sendKeys("babli1234");
	 	 	driver.findElement(By.xpath("//input[@id='signInSubmit'] ")).click();
  }
  
  

  @AfterTest
  public void afterTest() {
  }

}
