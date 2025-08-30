package Week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplexpath {
	
		
		public static void main(String[] args) {
			
			 ChromeDriver driver=new ChromeDriver(); 
			 driver.get("https://www.facebook.com/ ");
			 driver.manage().window().maximize();
			// driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
			 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
			 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Tuna@321");
			 //driver.findElement(By.name("pass")).sendKeys("Tuna@321");
			 driver.findElement(By.name("login")).click();
			 String title=driver.getTitle();
			 System.out.println(title);
			 
			}
	}


