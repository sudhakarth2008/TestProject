package firsttestngpackage;
import java.io.FileInputStream;



import org.apache.poi.hssf.usermodel.HSSFDateUtil;



public class ReadExcelDataUsingUtilClass2
{
    public static void main(String args[]) throws Exception
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
    
    
    
}