package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions(); // Entering as guest
		  option.addArguments("--guest"); 
		  
		ChromeDriver driver = new ChromeDriver(option); // Initiating the chrome driver
		driver.manage().window().maximize(); // Maximizing the window
		
		driver.get("http://leaftaps.com/opentaps/"); // Launching the URL
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); // Enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // Enter password
		driver.findElement(By.className("decorativeSubmit")).click(); // Click on submit button
		
		driver.findElement(By.partialLinkText("CRM")).click(); // Click on the partial link
		
		driver.findElement(By.linkText("Leads")).click(); // Click on the partial link
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.cssSelector("input#ext-gen270")).sendKeys("123");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement element = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]"));
		element.click();
		

	}

}
