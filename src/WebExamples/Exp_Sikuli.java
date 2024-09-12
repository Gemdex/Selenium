package WebExamples;

import org.sikuli.script.Screen;

public class Exp_Sikuli {
	
	public static void main(String args[]) throws Exception{
		
		Screen obj= new Screen();
		Thread.sleep(3000);
		obj.click("C:\\HJW\\WebDriverExamples\\win1");
		Thread.sleep(3000);
		obj.doubleClick("C:\\HJW\\WebDriverExamples\\fold.png");
		Thread.sleep(3000);
		obj.click("C:\\HJW\\WebDriverExamples\\folc.png");
		Thread.sleep(3000);
		obj.doubleClick("C:\\HJW\\WebDriverExamples\\fire.png");
		Thread.sleep(3000);
		obj.click("C:\\HJW\\WebDriverExamples\\firec.png.00202.022");
		Thread.sleep(3000);
	}

}
