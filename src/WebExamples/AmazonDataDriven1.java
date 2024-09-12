package WebExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonDataDriven1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		
		e.sendKeys("shoes");
		
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
				
		WebElement sh=driver.findElement(By.xpath("((//a[@title='Lace Up For Men'])[1]"));
		
		Thread.sleep(2000);
		
		sh.click();
		
		System.out.println("shoe name is:"+sh.getText());
		
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
					
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
