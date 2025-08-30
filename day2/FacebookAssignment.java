package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("(//input[@name='firstname'])[1]")).sendKeys("TestSample");
		driver.findElement(By.xpath("(//input[@name='lastname'])[1]")).sendKeys("V");
		driver.findElement(By.xpath("(//input[@name='reg_email__'])[1]")).sendKeys("vyogalakshmi@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("1234567");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select sel1=new Select(day);
		sel1.selectByVisibleText("28");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select sel2=new Select(month);
		sel2.selectByVisibleText("Jul");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select sel3 =new Select(year);
		sel3.selectByVisibleText("2020");
		driver.findElement(By.xpath("//input[@class='_8esa']")).click();
		
	}

}
