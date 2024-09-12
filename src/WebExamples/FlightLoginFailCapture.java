package WebExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlightLoginFailCapture {
	
	public static void main(String args[]) throws Exception {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver());
	
	driver.navigate().to("https://www.yatra.com/");
	
	WebElement w=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	w.click();
	
	w.sendKeys("Selenium");
	Actions a=new Actions(driver);
	a.sendKeys(Keys.ENTER).perform();
	
	driver.findElement(By.xpath("(//h3[text()='Selenium'])[1]")).click();
	Thread.sleep(3000);
	List<WebElement> num=driver.findElements(By.xpath("//h4[contains(text(),\"Selenium\")]"));
			int count=num.size();
	
	
	System.out.println("No of elements:"+count);
	driver.quit();
	}

}
