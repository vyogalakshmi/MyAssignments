package Week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementArray {
	
	public static void main(String[] args) {
		
		Integer[] array = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> arraylist =new ArrayList<>(Arrays.asList(array));
		Collections.sort(arraylist);
		for (int i = 0; i < arraylist.size()-1; i++) {
			int cur = arraylist.get(i);
			int next = arraylist.get(i+1);
			
			if(cur+1 != next)
			{
				System.out.println(cur+1);
			}
					
			
		}
	}

}
