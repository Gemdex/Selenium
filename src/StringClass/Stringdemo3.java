package StringClass;

public class Stringdemo3 {
public static void main(String[] args) {
		
		String actual="Welcome";
		
		String expected="welcome";
		
		//boolean status=actual.equals(expected);
		
		boolean status1=actual.equalsIgnoreCase(expected);
		
		//System.out.println("Status: "+status);
		
		System.out.println("Status1: "+status1);
	}

}
