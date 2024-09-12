package WebExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


public class TC_LeaveSummary {
	
	public static void main(String args[]) throws Exception{
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(4000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login Completed");
	
	Thread.sleep(4000);
	
	if(driver.getTitle().equals("OrangeHRM")){
		System.out.println("Title matched");
	}
	else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
	}
	Thread.sleep(4000);
	//mouseOver
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("Leave"))).perform();
	System.out.println("mouse over1 is completed");
	Thread.sleep(4000);
	ac.moveToElement(driver.findElement(By.linkText("Leave Summary"))).perform();
	System.out.println("mouse over2 is completed");
	Thread.sleep(4000);
	//driver.findElement(By.linkText("Employee Leave Summary")).click();
	//Thread.sleep(4000);

	driver.switchTo().frame("rightMenu");
	
	 Select st= new Select(driver.findElement(By.name("year")));
	 st.selectByVisibleText("2025");
	 
	 
	 cmbId
	 
	 
	 
	 driver.findElement(By.xpath("//*[text() = \"Employee Leave Summary\"]")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | id=rightMenu | ]]
	    driver.findElement(By.name("year")).click();
	    driver.findElement(By.name("cmbId")).click();
	    driver.findElement(By.name("leaveTypeId")).click();
	    new Select(driver.findElement(By.name("leaveTypeId"))).selectByVisibleText("Casual");
	    driver.findElement(By.xpath("//input[@value = \"View\"]")).click();
	    
	Thread.sleep(4000);    
	    
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout Completed");
	driver.close();
	
	
	}

}
