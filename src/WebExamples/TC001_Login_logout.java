package WebExamples;

	//---Pre-def:
	//--to access webdriver classes & methods
	import org.openqa.selenium.WebDriver;
	//--to access browser
	import org.openqa.selenium.firefox.FirefoxDriver;
	//--to access object/element methods
	import org.openqa.selenium.By;

	public class TC001_Login_logout {
	   public static void main(String args[]) throws Exception{
	       // Test Steps
	    WebDriver driver=new FirefoxDriver();
	    driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	    		Thread.sleep(3000);//wait stmt
	    		
	    		driver.close();
	  
	   }
}
