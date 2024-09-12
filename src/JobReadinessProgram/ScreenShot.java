package JobReadinessProgram;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Locatable;

public class ScreenShot {
    
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		try {
		
		WebElement element = driver.findElement(By.xpath("(//img[@loading1='lazy'])[2]"));
		Thread.sleep(3000);
		((Locatable) element).getCoordinates().inViewPort();
		element.click();
		 System.out.println("Successfully opened");
		}
		
		catch (Exception e) {
			
			String path="C:\\HJW\\SeleniumWork\\Target";
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(f, new File(path + "1.jpg"));
		    
		    System.out.println("Captured Screenshot");
		}
		driver.quit();
		
		
	}
}
