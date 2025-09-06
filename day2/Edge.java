package Week3.day2;

public class Edge extends Browser {
	
	public void takeSnap() 
	{
		System.out.println("takesnap--Edge");
	}

	public void clearCookies()
	{
		System.out.println("Cookies cleared--Edge");
	}
	
	public static void main(String[] args) {
		
		Edge E = new Edge();
		E.takeSnap();
		E.clearCookies();
		E.closeBrowser();
		E.closeBrowser();
		System.out.println(E.browsername);
				
	}
}
