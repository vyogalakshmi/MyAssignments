package Week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		String[] split = test.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			if(i%2 == 1)
			{
				char[] CR = split[i].toCharArray();
				for (int j = CR.length-1;j>=0; j--) {
					System.out.print(CR[j]);
				}
				
			}
			else
			{
				System.out.print(split[i]);
			}
			
			System.out.print(" ");
		}
		
	}
}
