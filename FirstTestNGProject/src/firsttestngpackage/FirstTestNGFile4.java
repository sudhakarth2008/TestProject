package firsttestngpackage;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import java.io.File;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.awt.*;
import java.awt.event.*;


public class FirstTestNGFile4 {
	
    
	  
	
    
    @BeforeTest
    public void setBaseURL(){
    	
    	// System.setProperty("webdriver.chrome.driver",driverPath);
    	// driver = new ChromeDriver();      
    	// driver.get(baseUrl);
        // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
         System.out.println("launching chrome browser1"); 
     
    }
    
 
  
  
  
  @AfterTest
  public void endSession(){
  //driver.quit();
  
     // System.out.println("launching chrome browser3"); 

  }

  @Test  
public void c_DataDriven() throws Exception
{

  try{ 
		// Runtime.getRuntime().exec("\"D:\\prog file\\090422.xls\""); 
		String[] cmdarray=new String[]{"cmd.exe","/c","E:\\Test.xls"}; 
		Runtime.getRuntime().exec(cmdarray); 

	
		// or Runtime.getRuntime().exec("cmd /c start \"\" \"D:\\prog file\\090422.xls\""); 
	      // System.out.println("launching chrome browser2"); 
		}catch(IOException e){ }
  
  	/*	
  try{
      Robot robot=new Robot();
      robot.keyPress(KeyEvent.VK_ALT);
      Thread.sleep(1000);
      robot.keyPress(KeyEvent.VK_S);
      robot.keyRelease(KeyEvent.VK_ALT);
      robot.keyRelease(KeyEvent.VK_S);        
  }
  catch(Exception ex){
      System.out.println(ex.getMessage());
  }
*/

	 
	  /*System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	  driver.navigate().to("E:\\Test.xls");*/

  
}
}

  
	

  
  
