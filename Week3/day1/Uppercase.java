package Week3.day1;

public class Uppercase {
	
	public static void main(String[] args) {
		
		String test ="changeme";
		char[] chararray = test.toCharArray();
		
		for (int i = 0; i < chararray.length; i++) {
		
			if (i%2!=0) {
				
				char test1 = Character.toUpperCase(chararray[i]);
				System.out.print(test1);
				
			}
			else
			{
				System.out.print(chararray[i]);
				
			}
			
			}
			
		}
		
	}


