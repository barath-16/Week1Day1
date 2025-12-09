package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions option = new ChromeOptions(); // Entering as guest
		  option.addArguments("--guest"); 
		  
		ChromeDriver driver = new ChromeDriver(option); // Initiating the chrome driver
		driver.manage().window().maximize(); // Maximizing the window
		
		driver.get("http://leaftaps.com/opentaps/"); // Launching the URL
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); // Enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // Enter password
		driver.findElement(By.className("decorativeSubmit")).click(); // Click on submit button
		
		driver.findElement(By.partialLinkText("CRM")).click(); // Click on the partial link
	
		driver.findElement(By.linkText("Accounts")).click(); // Clicking on the accounts tab

		// Entering the details in the account tab
		driver.findElement(By.linkText("Create Account")).click(); 
		driver.findElement(By.id("accountName")).sendKeys("BarathR");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("officeSiteName")).sendKeys("Chennai");
		driver.findElement(By.id("numberEmployees")).sendKeys("20");
		
		// Once the details are entered Create Account button is clicked
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle(); // Gets the page title
		System.out.println(title);
		
		Thread.sleep(2000);
		driver.close(); // Closes the current window
		
	}

}
