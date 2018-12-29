package firsttestngpackage;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByPixel {

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
        driver.get(baseUrl);

        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
      //  driver.manage().window().maximize();

        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
        
        driver.quit();
        
        
        
        
    }
}