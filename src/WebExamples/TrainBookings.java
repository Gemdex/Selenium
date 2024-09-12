package WebExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



public class TrainBookings {

	public static void main(String[] args) throws Exception {

		
		//driver.navigate().refresh();
		ChromeOptions options=new ChromeOptions();
	    options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");

		//driver.findElement(By.xpath("//img[@decoding='async'][@id='disha-banner-close']")).click();
		
		Thread.sleep(3000);
		
		WebElement w=driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
		w.click();
		
		w.sendKeys("Hyd");
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ENTER).perform();
		
		
		
		WebElement r=driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
        r.click();
		r.sendKeys("Ban");
		Actions b=new Actions(driver);
		Thread.sleep(3000);
		b.sendKeys(Keys.ARROW_DOWN);
		b.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).sendKeys("30.08.24");
		System.out.println(a);
		
		driver.findElement(By.xpath("//button [@type='submit']")).submit();
		
	}

}
