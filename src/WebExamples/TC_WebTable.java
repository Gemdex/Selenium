package WebExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WebTable {

	 public static void main(String args[]) throws Exception{
		 WebDriver driver=new FirefoxDriver();
		 driver.navigate().to("file:///C:/Users/hemam/OneDrive/Desktop/Testing/WindowTable/WebTable.html");
		 
		 int row=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[7]/td[4]")).size();
		 System.out.println("row count " +row);
		 
		 
	 }
}
