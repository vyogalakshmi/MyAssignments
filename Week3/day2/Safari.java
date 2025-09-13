package Week3.day2;

public class Safari extends Browser
{

	public void readermode()
	{
		System.out.println("REader mode-Safari class");
		
	}
	
	public void fullScreenMode() 
	{
		System.out.println("fullscreenmode-safari class");
	}
	
public static void main(String[] args)
{
		
		Safari S1 = new Safari();
		S1.readermode();
		S1.fullScreenMode();
		S1.openURL();
		S1.navigateBack();
		S1.closeBrowser();
		
	}
}
