package StringClass;

public class Stringdemo2 {
	
	public static void main(String[] args) {
		
		String actual="Welcome to Selenium WebDiver";
		
		String expected="Selenium";
		
		//boolean status=actual.equals(expected);
		
		boolean status1=actual.contains(expected);
		
		//System.out.println("Status: "+status);
		
		System.out.println("Status1: "+status1);
	}

}
