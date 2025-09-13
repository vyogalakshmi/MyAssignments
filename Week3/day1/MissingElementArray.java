package Week3.day1;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		
		int num1[] = {1,4,3,2,8,6,7};
				
		Arrays.sort(num1);
		
		for (int i = 0; i < num1.length-1; i++) {
			
			if(num1[i+1] != num1[i]+1)
			{
				System.out.println(num1[i]+1);
				break;
			}
			
		}	
		
		
				
			}
			
			
				
		
		
		
	
	
}
