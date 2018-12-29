package firsttestngpackage;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;

import org.apache.poi.ss.usermodel.CellType;

/*import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
*/
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
 
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
 
public class ExcelApiTest4
{
    public FileInputStream fis = null;
    public HSSFWorkbook workbook = null;
    public HSSFSheet sheet = null;
    public HSSFRow row = null;
    public HSSFCell cell = null;
    public FileOutputStream fout=null;
 

 
    public String getCellData(String xlFilePath, String sheetName,int rowNum,int column) throws Exception
    {
    	
    	/*
    	
     	System.out.println("FilePath : "+xlFilePath);
     	System.out.println("sheetName : "+sheetName);
     	System.out.println("colNum : "+column);
     	System.out.println("rowNum : "+rowNum);
*/
    	
    	
        fis = new FileInputStream(xlFilePath);
        workbook = new HSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
        
       row = sheet.getRow(rowNum);
        cell = row.getCell(column);
      
        fis.close();
        if(cell.getCellTypeEnum() == CellType.STRING)
          	
            return cell.getStringCellValue(); 
        else 
       
        return cell.getStringCellValue();
       

    } 
    
    
    
    public void PutCellFormula(String xlFilePath,String sheetName,int rowNum,int column,String Text)throws Exception
    {
    	
      
        fis = new FileInputStream(xlFilePath);
        workbook = new HSSFWorkbook(fis);
    	sheet = workbook.getSheet(sheetName);
    	
		//sheet.getRow(rowNum).createCell(column).setCellValue(Text);
		
		//sheet.getRow(3).createCell(1).setCellValue("HERO");
		
		//String str="HYPERLINK("E:\test.png","Hai")";
		
		 row = sheet.createRow(12);  
         cell = row.createCell(2); 
		cell.setCellType(CellType.FORMULA);  
		sheet.getRow(12).createCell(2).setCellFormula("HYPERLINK(\"E:\\\\test.png\", \"click here1\")")  ;
		
    	fout= new FileOutputStream(xlFilePath);  
        workbook.write(fout);
        fout.flush();
        fout.close();
        
        fis.close();
        
        
    }
    
    
    
}

