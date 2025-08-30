package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yogalakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		WebElement DD=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select =new Select(DD);
		select.selectByIndex(4);
		WebElement MarketDD1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select1 =new Select(MarketDD1);
		select1.selectByVisibleText("Automobile");
		WebElement Owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select2 = new Select(Owner);
		select2.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.close();
		
		
	}

}
