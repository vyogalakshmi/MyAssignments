package Week3.day2;

public class Chrome extends Browser {

	public void openIncognito()
	{
		System.out.println("openIncognito-chrome class");
	}
	
	public void clearCache()
	{
		System.out.println("cache cleared-ClearCache class");
	}
	
	public static void main(String[] args) {
		
		Chrome C1=new Chrome();
		C1.openURL();
		C1.closeBrowser();
		C1.clearCache();
		System.out.println(C1.browserversion);
		
		
	}
}
