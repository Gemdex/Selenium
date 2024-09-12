package StringClass;

public class StrindDemo {

	public static void main(String[] args) {
		
		String name="Selenium WebDriver";
		boolean status=name.startsWith("Selenium");
		
		System.out.println("Status is:" +status);
		
		boolean name1=name.endsWith("WebDriver");
		
		System.out.println("new status:"+name1);
		
	}

}
