package Arrays;

import java.util.Arrays;

public class LowestNumber {

	public static void main(String[] args) {
		
		int a[]= {3,2,0,1,67};
		
		System.out.println("The list is:" +Arrays.toString(a));
		
		int low=a[0];
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]<low)
				low=a[i];
		}

		System.out.println("Lowest number is:" +low);
	}

}
