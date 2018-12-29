package firsttestngpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class FirstTestNGFile5 {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    String actualTitle = "";
    public WebDriver driver ; 
    String expectedTitle = "Welcome: Mercury Tours";
     
    
    @BeforeTest
    public void setBaseURL(){
    	 
    
    }
    
  @Test
  public void a_verifyHomepageTitle() {
	  
     
  }
  
  
  
  @Test
  public void b_verifyLogin() { 
	  
/*
      driver.findElement(By.name("userName")).sendKeys("mercury");
      driver.findElement(By.name("password")).sendKeys("mercury");
      
     // driver.findElement(By.name("c")).sendKeys("mercury");
      
      driver.findElement(By.name("submit")).click();
      

  */
  }
  
  
  @AfterTest
  public void endSession(){
  //driver.quit();
  

  }
  
  @Test  
public void c_DataDriven() throws Exception
{
	
    	ExcelApiTest3 eat = new ExcelApiTest3();
    	
    	/*  System.out.println(eat.getCellData("E://Test1.xls","Sheet1",0,0));
    	  System.out.println(eat.getCellData("E://Test1.xls","Sheet1",0,1));
    	  System.out.println(eat.getCellData("E://Test1.xls","Sheet1",1,0));
    	  System.out.println(eat.getCellData("E://Test1.xls","Sheet1",1,1));
    	  System.out.println(eat.getCellData("E://Test1.xls","Sheet1",2,0));
    	  System.out.println(eat.getCellData("E://Test1.xls","Sheet1",2,1));
    	  System.out.println(eat.getCellData("E://Test1.xls","Sheet1",3,0));
    	  System.out.println(eat.getCellData("E://Test1.xls","Sheet1",3,1));
           	*/
    	
    	 // System.out.println(eat.getCellData("E://Test1.xls","Sheet1",3,1));
    	
		 eat.PutCellData("E://Test1.xls","Sheet1",14,3, "Venkat999");
    	
    	//WebDriverWait wait=new WebDriverWait(driver, 10);
       //eat.PutCellData("E://Test1.xls","Sheet2",13,1, "Venkat123");
      //eat.PutCellData("E://Test1.xls","Sheet2",13,1, "Venkat123");
    	//eat=null;
    	
    	//ExcelApiTest3 eat1 = new ExcelApiTest3();
    	
    	//ExcelApiTest3 eat1 = new ExcelApiTest3();
  	//eat.PutCellData("E://Test1.xls","Sheet1",13,1, "Venkat123");
  	
	//eat1=null;
	//System.gc();
  	
  	
   
	  //System.out.println(eat.getCellData("E://Test1.xls","Sheet1",13,1));
	
	  
		
        //eat.PutCellData("E://Test1.xls","Sheet1",14,0, "Monkey");
       // eat.PutCellData("E://Test1.xls","Sheet1",14,1, "Monkey123"); 
        
    // System.out.println(eat.getCellData("E://Test1.xls","Sheet1",13,0));
  	 // System.out.println(eat.getCellData("E://Test1.xls","Sheet1",13,1));
  	  //System.out.println(eat.getCellData("E://Test1.xls","Sheet1",14,0));
  	 // System.out.println(eat.getCellData("E://Test1.xls","Sheet1",14,1));
    /*
      System.out.println(eat.getCellData("E://Test1.xls","Sheet1",4,0));
  	  System.out.println(eat.getCellData("E://Test1.xls","Sheet1",4,1));
  	  System.out.println(eat.getCellData("E://Test1.xls","Sheet1",5,0));
  	  System.out.println(eat.getCellData("E://Test1.xls","Sheet1",5,1));
  	  
  	  */
     
    }
    
	
}
  
  
