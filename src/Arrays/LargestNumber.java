package Arrays;

import java.util.Arrays;

public class LargestNumber {
	
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,80};
		int max=a[0];
		
		System.out.println("The list is"+Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
		
			}
			
		}
		System.out.println("Largest number " +max);
	}

}
