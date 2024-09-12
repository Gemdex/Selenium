package StringClass;

public class StringSplit {
	
public static void main(String[] args) {
		
		String name="apple-mango-banana";
		
		String name1="hp qtp grid";
		
		String[] fruit=name1.split(" ");
		
		for(int i=0;i<fruit.length;i++) {
			
		System.out.println("Value for "+i+" is " +fruit[i]);
		
		if(fruit[i].equalsIgnoreCase("qtp")) {
			
			System.out.println("Test Passed");
			break;
		}
         
		}
    }
}
