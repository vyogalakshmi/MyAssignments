package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options =new ChromeOptions() ;
		options.addArguments("guest");
		
		ChromeDriver driver =new ChromeDriver(options);
	    driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("SeleniumAUG");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Yogalakshmi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("V");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Yoga");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("AutomationTesting");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vyogalakshmi@gmail.com");
		WebElement StateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel1 = new Select(StateDD);
		sel1.selectByValue("NY");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("SampleTesting");
		driver.findElement(By.className("smallSubmit")).click();
		 String title=driver.getTitle();
		 System.out.println(title);
		 driver.close();
		 
		
		
		
	}
	
}
