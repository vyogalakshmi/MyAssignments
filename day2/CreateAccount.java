package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {



	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(" http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		//driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("SeleniumAUG");
		//String accname = driver.findElement(By.xpath("//input[@id='accountName']")).gettext();
		//System.out.println(accname); 
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement IndustryDD = driver.findElement(By.name("industryEnumId"));
		Select sel = new Select(IndustryDD);
		sel.selectByIndex(3);
		WebElement OwnershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select sel1=new Select(OwnershipDD);
		sel1.selectByContainsVisibleText("S-Corporation");
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select sel2 = new Select(sourceDD);
		sel2.selectByValue("LEAD_EMPLOYEE");
		WebElement MarketDD = driver.findElement(By.id("marketingCampaignId"));
		Select sel3=new Select(MarketDD);
		sel3.selectByIndex(6);
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel4=new Select(stateDD);
		sel4.selectByValue("TX");
		  
	    driver.findElement(By.className("smallSubmit")).click();
	    
						
	}
	
}
