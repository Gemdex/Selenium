package WebExamples;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_MultWind {

	public static void main (String args[]) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/hemam/OneDrive/Desktop/Testing/WindowTable/multiplewindows.html");
		Thread.sleep(3000);
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		ArrayList<String> mwind= new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(mwind.get(0));
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
	}
}
