package Week4.day2;


import java.util.Set;
import java.util.TreeSet;

public class SetUnique {
	
	public static void main(String[] args) {
		
		String companyName = "google";
		char[] charArray = companyName.toCharArray();
		Set<Character> unique = new TreeSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			unique.add(charArray[i]);
				
			
		}
		System.out.println(unique);
		
		
	}

}
