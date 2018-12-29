package firsttestngpackage;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
public class ScrollByVisibleElement {

    //WebDriver driver;
    public String baseUrl = "Http://Newtours.Demoaut.Com/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    String actualTitle = "";
    public WebDriver driver ; 
    String expectedTitle = "Welcome: Mercury Tours";
    
    
    
    @Test
    public void ByPixel() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        driver.get("C://Users//sudhakar//Desktop//Login.html");

        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
        driver.manage().window().maximize();

        // This  will scroll down the page by  1000 pixel vertical		
      //  js.executeScript("window.scrollBy(0,1000)");
        
      //Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.name("fname"));
        driver.findElement(By.name("fname")).sendKeys("sudhakar");
        
        WebElement Element1 = driver.findElement(By.name("fname1"));
     

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element1);
        
      //  driver.findElement(By.name("fname1")).sendKeys("Raju");
        
       // driver.quit();
        
        
        
        
    }
}