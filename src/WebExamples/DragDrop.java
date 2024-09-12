package WebExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import static org.testng.Assert.assertEquals;

public class DragDrop {
	public static void main(String args[]) throws Exception{
		   // Test Steps
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://jqueryui.com/droppable");
		Thread.sleep(4000);
		//verify page title : stop exe: in case of cond: failed
		assertEquals("Droppable | jQuery UI",driver.getTitle());
		System.out.println("Title matched");
		driver.switchTo().frame(0);
		//drag & drop
		Actions ac = new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")),
		driver.findElement(By.id("droppable"))).build().perform();
		System.out.println("Drag & Drop");
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.quit();
		}
}
