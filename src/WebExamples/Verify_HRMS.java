package WebExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Verify_HRMS {
	
	public static void main(String args[]) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			   System.out.println("Title matched");
			}
			else {
			   System.out.println("Title not matched");
			   System.out.println(driver.getTitle());
			}
			Thread.sleep(3000);

		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		
		if(driver.getTitle().equals("OrangeHRM")) {
			   System.out.println("title matched");
			}
			else {
			    System.out.println("Title not matched ");
			    System.out.println(driver.getTitle());
			}
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout Completed");
		driver.close();
		
		
		
	}

}
