package Week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntersection {
	
	public static void main(String[] args) {
		
		Integer[] array = {3, 2, 11, 4, 6, 7};
		Integer[] array1= {1, 2, 8, 4, 9, 7};
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
		List<Integer> arrayList1=new ArrayList<>(Arrays.asList(array1));
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			int list=arrayList.get(i);
			if(arrayList1.contains(list))
			{
				System.out.println(arrayList1.get(i));
			}
			
		}
 		
		
		
	}

}
