package Week1.day2;

public class Browser {
	
public String launchBrowser(String browsername)
{
	System.out.println(browsername);
	return browsername;
	
}

public void loadUrl()
{
	System.out.println("URL loaded successfully");
}

public static void main(String[] args) {
	
Browser obj=new Browser();
obj.launchBrowser("Chrome Browser");
obj.loadUrl();
	
}

}
