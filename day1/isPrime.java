package Week1.day2;

public class isPrime {

	public static void main(String[] args) {
		
		int n =86;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
				prime = false;
				break;	
				
			}
			
		}
		if (prime==true) {
		System.out.println("Prime Number");
						
		}
		else {
		System.out.println("Not a Prime Number");
		}
	}
}
