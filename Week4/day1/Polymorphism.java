package Week4.day1;

public class Polymorphism {
	
	public void  reportStep(String msg,String status)
	{
		System.out.println(msg);
		System.out.println(status);
	}
	public void  reportStep(String msg,String status,boolean snap)
	{
		System.out.println(msg);
		System.out.println(status);
		System.out.println(snap);
	}
	
	public static void main(String[] args) {
		
		Polymorphism P =new Polymorphism();
		P.reportStep("Hello", "Pass");
		P.reportStep("hello","Pass",true);
		
	}

}
