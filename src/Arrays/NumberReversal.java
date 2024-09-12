package Arrays;

import java.util.Arrays;

public class NumberReversal {
	
	public static void main(String[] args) {
		
		int number=678534;
		int reverse=0;
	  
		System.out.println("The number is " +number);
		while(number!=0) {
			
			int remainder=number%10;
			reverse= reverse*10 +remainder;
			number=number/10;
			
		}
		
		System.out.println("Reverse of given number is "+reverse);
	}

}
