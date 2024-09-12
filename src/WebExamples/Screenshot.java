package WebExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {

	public static void main(String args[]) throws Exception{
		WebDriver driver=new FirefoxDriver();
		
		try {
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("login completed");
		//----mouseover
		Actions ac  = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("Mouseover completed");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Add Employee123")).click();
		System.out.println("cliked on addemp submenu");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout completed");
		}
		catch(Exception e){
		    File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(f1, new File("C:\\Users\\hemam\\OneDrive\\Desktop\\Testing\\Excel_Work\\test.png"));
		  }
			
		driver.close();
		}
		
	}

