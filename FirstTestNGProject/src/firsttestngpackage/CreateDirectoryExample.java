package firsttestngpackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class  CreateDirectoryExample {
	
 	public static String BatchFolder;
 	
    public static void main(String[] args) {
    	
   
    	
    	SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");//dd/MM/yyyy
		  Date now1 = new Date();
		  String strDate1 = sdfDate1.format(now1);
			
		      BatchFolder="E:\\"+"Batch_Billing Regression"+"_"+strDate1;
    

        Path path = Paths.get(BatchFolder);
        ///if directory exists?
        if (!Files.exists(path)) {
            try {
            	
            	
                Files.createDirectories(path);
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }

    }
    
}