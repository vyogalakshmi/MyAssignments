package Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListMyntra {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.className("desktop-searchBar")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		//driver.findElement(By.xpath("//input[@value='Laptop Bag']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Laptop Bag']")).click();
		Thread.sleep(3000);
		String count = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println(count);
		//brand
		List<WebElement> elements = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		
		List<String> brand = new ArrayList<String>();
		for(WebElement eachElement:elements)
		{
			String brandname = eachElement.getText();
			brand.add(brandname);
		}
		System.out.println(brand);
		
		//To print bag name
		
		 List<WebElement> elements1 = driver.findElements(By.xpath("//h4[@class='product-product']"));
		  
		 List<String> bagnames= new ArrayList<String>();
		 for(WebElement eachElement1:elements1)
		 {
			 String bagname = eachElement1.getText();
			 bagnames.add(bagname);
			 
			
		 }
		 System.out.println(bagnames);
		
	}

}
