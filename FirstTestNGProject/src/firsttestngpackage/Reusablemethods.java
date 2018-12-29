package firsttestngpackage;
import org.openqa.selenium.WebDriver;
interface Reusablemethods {
	
	 //public WebDriver driver ; 
	
	public String TCNAME="";
	 public String LoginMethod(String UserName,String Password,String TestCaseName,String TestClassName);
	public void  setBaseURL();
	public void logoutmethod(String TestCaseName,String TestClassName);
	 public void closebrowser();
	 public  void takeSnapShot(WebDriver webdriver,String TestCaseName,String TestClassName,int rownum,int column,String sampletext);
	
}
