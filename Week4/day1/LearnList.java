package Week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text() = 'Continue shopping']")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
        driver.findElement(By.id("nav-search-submit-button")).click();
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class = 'a-price-whole']"));
        
		for(WebElement each:prices)
		{
			String text = each.getText();
			//prices.add(text);
			System.out.println(text);
		}
        
	}

}
