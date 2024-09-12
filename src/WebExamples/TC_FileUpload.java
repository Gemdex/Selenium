package WebExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class TC_FileUpload {
	
	public static void main(String args[]) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
	    System.out.println("Login completed");
	    Thread.sleep(4000);
	    //click on add button
	    
	    driver.switchTo().frame("rightMenu");
	    driver.findElement(By.xpath(null)
	}

}
