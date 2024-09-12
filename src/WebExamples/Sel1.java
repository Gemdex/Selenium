package WebExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> size1=driver.findElements(By.xpath("//* [contains(text(),\"Best Sellers in Grocery\")]"));
		size1.size();
		
		System.out.println("No. of Items "+size1);
		
		driver.quit();
		//* [contains(text(),"Best Sellers in Grocery")]
	}

}
