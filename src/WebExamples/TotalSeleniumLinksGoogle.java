package WebExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TotalSeleniumLinksGoogle {
	
	public static void main(String args[]) throws Exception {
		
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.google.com/");
	
	WebElement w=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	w.click();
	
	w.sendKeys("Selenium");
	Actions a=new Actions(driver);
	a.sendKeys(Keys.ENTER).perform();
	
	List<WebElement> sellist=driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
	
	Thread.sleep(4000);
	for(WebElement element:sellist) {
		
		String str=element.getText();
		
		
		
		System.out.println("Links are:"+str);
				
		
	}
	
	driver.quit();		
	}

}
