package Week3.day2;

public class SingleinheritLoginTestData extends SingleInhertanceTestData {
	
	public void enterUsername()
	{
		System.out.println("Username entered--subclass");
	}
	
	public void enterPassword()
	{
		System.out.println("Password Entered--subclass");
	}

	public static void main(String[] args) {
		
		SingleinheritLoginTestData tstdata = new SingleinheritLoginTestData();
		tstdata.enterCredentials();
		tstdata.navigateToHomePage();
		tstdata.enterUsername();
		tstdata.enterPassword();
		
	}
}
