package WebExamples;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumGoogleGetText {
	
	public static void main(String args[]) throws Exception {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
	WebDriver driver=new EdgeDriver();
	
	driver.navigate().to("https://www.google.com/");
	
	WebElement w=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	w.click();
	
	w.sendKeys("Selenium");
	Actions a=new Actions(driver);
	a.sendKeys(Keys.ENTER).perform();
	
	driver.findElement(By.xpath("(//h3[text()='Selenium'])[1]")).click();
	
	String s=driver.findElement(By.xpath("//p[@class='lead mt-3 mb-0']/parent::*/parent::*/ancestor::*")).getText();
	
	System.out.println("Text on page is:" +s);
	
	driver.quit();
	}

}
