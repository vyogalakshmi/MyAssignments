package Week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int n=8;
		int T1=0;
		int T2=1;
		
	  for (int i = 1; i <=n; i++) {
		System.out.print(T1+",");
		int T3=T1 +T2;
		T1 = T2;
		T2=T3;
		
	}
		
	}

}
