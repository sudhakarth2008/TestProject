package firsttestngpackage;
import org.apache.commons.io.FileUtils;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FirstTestNGFile2 {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    String actualTitle = "";
    public WebDriver driver ; 
    String expectedTitle = "Welcome: Mercury Tours";
 
    
    @BeforeTest
    public void setBaseURL(){
    	
    	 System.setProperty("webdriver.chrome.driver",driverPath);
    	 driver = new ChromeDriver();      
    	 driver.get(baseUrl);
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
         System.out.println("launching chrome browser"); 
     
    }
    
  @Test
  public void b_verifyHomepageTitle() throws Exception{
	  
     
      actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      
      ExcelApiTest3 eat = new ExcelApiTest3();
      
      if (actualTitle.contentEquals(expectedTitle)){
          System.out.println("Test Passed!");
          eat.PutCellData("E://Test1.xls","Sheet1", 0 , 2 , "Pass");
      } else {
          System.out.println("Test Failed");
          eat.PutCellData("E://Test1.xls","Sheet1", 0 , 2 , "Fail");
      }
      

  }
  
  
  
  @Test
  public void a_verifyLogin() throws Exception { 
	  
      
		ExcelApiTest3 eat = new ExcelApiTest3();
    	 	  
  	  String UserName= eat.getCellData("E://Test1.xls","Sheet1",0,0);
  	  String password1= eat.getCellData("E://Test1.xls","Sheet1",0,1);
  	  String str="";
  	  
      driver.findElement(By.name("userName")).sendKeys(UserName);
      driver.findElement(By.name("password")).sendKeys(password1);
      
     // driver.findElement(By.name("c")).sendKeys("mercury");
      
      driver.findElement(By.name("submit")).click();
     
    
      //driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
      WebDriverWait wait=new WebDriverWait(driver, 5);
    //Maximizes the browser window
  	  driver.manage().window().maximize() ;
      driver.getTitle();
      
      //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
      //LocalDateTime now = LocalDateTime.now();  
      //System.out.println(dtf.format(now));  
     // Timestamp timestamp = new Timestamp(System.currentTimeMillis());
      //str="E://" + java.time.LocalDate.now() +"_" + timestamp.getTime() +".png";
      //str="E://" + timestamp.getTime() +".png";
      //System.out.println(str);
      
      
      Timestamp timestamp = new Timestamp(System.currentTimeMillis());
      str="E:\\" + java.time.LocalDate.now() +"_" + timestamp.getTime() +".png";
      //System.out.println("Image Path :"+str);
       this.takeSnapShot(driver,str) ;
       eat.PutCellFormula("E://Test1.xls","Sheet1",15,1,str);
   
     //  ExcelApiTest3 eat1 = new ExcelApiTest3();
      
      timestamp = new Timestamp(System.currentTimeMillis());
      str="E:\\" + java.time.LocalDate.now() +"_" + timestamp.getTime() +".png";
      //System.out.println(str);
      this.takeSnapShot(driver,str) ;  
      //System.out.println("One");
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
      //System.out.println("three");
      eat.PutCellFormula("E://Test1.xls","Sheet1",15,2,str);
      //System.out.println("two"); 
      
      
      
      timestamp = new Timestamp(System.currentTimeMillis());
      str="E:\\" + java.time.LocalDate.now() +"_" + timestamp.getTime() +".png";
 //     System.out.println(str);
      this.takeSnapShot(driver,str) ;  

      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

      eat.PutCellFormula("E://Test1.xls","Sheet1",15,3,str);
      //System.out.println("two"); 
  
     // eat.PutCellData("E://Test1.xls","Sheet1", 19 , 2 , "Venkat");
  
  }
  
  
  @AfterTest
  public void endSession(){
  driver.quit();
  

  }
  /*
  @Test  
public void c_DataDriven() throws Exception
{
	
    	ExcelApiTest3 eat = new ExcelApiTest3();
    	
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",0,0));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",0,1));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",1,0));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",1,1));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",2,0));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",2,1));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",3,0));
    	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",3,1));
           	
    	eat.PutCellData("E://Test.xls","Sheet1", 4 , 0 , "Venkat");
        eat.PutCellData("E://Test.xls","Sheet1", 4 , 1 , "Venkat123");
        eat.PutCellData("E://Test.xls","Sheet1", 5 , 0 , "Monkey");
        eat.PutCellData("E://Test.xls","Sheet1", 5 , 1 , "Monkey123"); 
    
      System.out.println(eat.getCellData("E://Test.xls","Sheet1",4,0));
  	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",4,1));
  	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",5,0));
  	  System.out.println(eat.getCellData("E://Test.xls","Sheet1",5,1));
     
    }
  
  */
  
  /* started
  
  @Test

  public void testGuru99TakeScreenShot() throws Exception{

	
      //Call take screenshot function

      this.takeSnapShot(driver, "c://test.png") ;     

  }



   * This function will take screenshot

   * @param webdriver

   * @param fileWithPath

   * @throws Exception

 */

  public  void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
	  
	 // String str="";
			//  String fileWithPath ="";
	  
	
      
      
      //fileWithPath=str;

      //Convert web driver object to TakeScreenshot
	  System.out.println("Function Invoked !");
      TakesScreenshot scrShot =((TakesScreenshot)webdriver);

      //Call getScreenshotAs method to create image file

              File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

          //Move image file to new destination

              File DestFile=new File(fileWithPath);

              //Copy file at destination

              FileUtils.copyFile(SrcFile, DestFile);

  }

    
	
}
  
  
