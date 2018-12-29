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
import java.text.SimpleDateFormat;

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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
public class TC01 {
	
	String UserName1,Password1,TestCase1,TestClassName;
	 //Reusablemethods rd;
	//LoginDemo3 ld3= new LoginDemo3();
	
	
	
@BeforeTest
public void hai()
{
	
	Hello();
	
}



  @Test
  public void b_verifyHomepageTitle2() throws Exception{
	  
	 Reusablemethods rd= new LoginDemo3();
	  System.out.println ("Class Name 12345666 :"+TestCase1);
	  rd.setBaseURL();

	 
	     GetDatafromExcel(); // Get Login Input Data from Global Sheet
	  	 System.out.println ("UserName :"+UserName1);
		 System.out.println ("UserName :"+Password1);
	  
	 
	String  loginFlag1=  rd.LoginMethod(UserName1,Password1,TestCase1,TestClassName); //Invoke Login Method
	  
		  if(loginFlag1!= null)
		  {
		 		
		 		 rd.logoutmethod(TestCase1,TestClassName);
		 		  rd.closebrowser();
	 		
	 		}
	   		else{
	 		//System.out.println("Login Failed"+loginFlag1);
	 		  rd.closebrowser();
	 		}
	 
	  
 }
 
  public void GetDatafromExcel() throws Exception{
	  
		ExcelApiTest3 eat = new ExcelApiTest3();
		//eat.PutCellData("E://Test1.xls","Sheet1",14,3, "Venkat999");
		UserName1=eat.getCellData("E://Test1.xls","Sheet1",0,0);
		Password1=eat.getCellData("E://Test1.xls","Sheet1",0,1);
		System.out.println ("UserName :"+UserName1);
		System.out.println ("UserName :"+Password1);
  }
  
  
  public void Hello()
  {
	  
	  //Hello starts

		SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");//dd/MM/yyyy
		  Date now1 = new Date();
		  String strDate1 = sdfDate1.format(now1);
		 
		 
		
		 //starts create directory if not exists
		  TestCase1=this.getClass().getSimpleName();
		  System.out.println ("Class Name :"+TestCase1);
		//  TestClassName=TestCase1;
		  
		  TestClassName=TestCase1;

		 String Path5=TestCase1+"_" +strDate1;
		 String folderPath="E:\\Batch2\\" +TestCase1+"\\"+Path5;
		  //Path path = Paths.get("E:\\TC04");
		 Path path = Paths.get(folderPath);
	  //if directory exists?
	  if (!Files.exists(path)) {
	      try {
	          Files.createDirectories(path);
	      } catch (IOException e) {
	          //fail to create directory
	          e.printStackTrace();
	      }
	  }
		//folder creation ends

	  // start Store Test Results in below excel
	  
	  try {
		  
		  System.out.println ("Block started Name :"+TestCase1);
	  ExcelApiTest3 eat = new ExcelApiTest3();
	  TestCase1=this.getClass().getSimpleName();
	  String sheetpath="E://"+TestCase1+".xls";

	  
	 // SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");//dd/MM/yyyy
	 // Date now = new Date();
	//  String strDate = sdfDate.format(now);
	 // String sheetpath1=folderPath+"\\" +TestCase1+"_"+strDate+".xls";
	  
	  String sheetpath1=folderPath+"\\"+Path5+".xls";
	  System.out.println ("sheetpath1 Name 12345666 :"+sheetpath1);
	  
	  //eat.CopyWorkBook(sheetpath,"E://TC11.xls");
	  eat.CopyWorkBook(sheetpath,sheetpath1);
	  
	  System.out.println ("Block ended Name :"+TestCase1);
	 // System.exit(0);
	  
	  TestCase1=sheetpath1;
	 TestClassName=folderPath+"\\"+Path5;
	 System.out.println("Test Class Name folder path "+TestClassName);
	  
	  }catch (Exception e){}
	  
	  // end Store Test Results in below excel
	  
	 
		
  }
  
  //Hello Ends
  
}
