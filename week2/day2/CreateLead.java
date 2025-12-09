package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
		
		driver.findElement(By.linkText("Leads")).click(); // Click on the partial link
		driver.findElement(By.linkText("Create Lead")).click(); // Click on the partial link
		
		//Leads page with the necessary details entered
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Straw Hats");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kaisoku");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Luffy");
		driver.findElement(By.name("submitButton")).click(); // Clicking on the submit button
		
		String title = driver.getTitle(); // Gets the page title
		System.out.println(title);
		
		Thread.sleep(2000);
		driver.close(); // Closes the current window

	}

}
