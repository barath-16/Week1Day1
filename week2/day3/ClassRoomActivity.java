package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClassRoomActivity {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions(); // Entering as guest
		  option.addArguments("--guest"); 
		  
		ChromeDriver driver = new ChromeDriver(option); // Initiating the chrome driver
		driver.manage().window().maximize(); // Maximizing the window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/"); // Launching the URL
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); // Enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // Enter password
		driver.findElement(By.className("decorativeSubmit")).click(); // Click on submit button
		
		driver.findElement(By.partialLinkText("CRM")).click(); // Click on the partial link
		
		driver.findElement(By.linkText("Leads")).click(); // Click on the partial link
		driver.findElement(By.linkText("Create Lead")).click(); // Click on the partial link
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Straw Hats");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kaisoku");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Luffy");
		
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(element);		
		select.selectByIndex(4);
		
		WebElement element1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select1 = new Select(element1);
		select1.selectByVisibleText("Automobile");
		
		WebElement element2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select2 = new Select(element2);
		select2.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click(); // Clicking on the submit button
		
	}

}
