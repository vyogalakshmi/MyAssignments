package Week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringList {
	
	public static void main(String[] args) {
		
		String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> complist = new ArrayList<>(Arrays.asList(companies));
		Collections.sort(complist);
		for (int i = complist.size()-1; i>=0; i--) {
			System.out.println(complist.get(i));
		}
		
	}

}
