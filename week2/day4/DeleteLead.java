package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions(); // Entering as guest
		  option.addArguments("--guest"); 
		  
		ChromeDriver driver = new ChromeDriver(option); // Initiating the chrome driver
		driver.manage().window().maximize(); // Maximizing the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://leaftaps.com/opentaps/"); // Launching the URL
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); // Enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // Enter password
		driver.findElement(By.className("decorativeSubmit")).click(); // Click on submit button
		
		driver.findElement(By.partialLinkText("CRM")).click(); // Click on the partial link
		
		driver.findElement(By.linkText("Leads")).click(); // Click on the partial link
		
		WebElement element1 = driver.findElement(By.linkText("Find Leads"));
		element1.click(); // Assigned a local variable for reusing it later but it didn't work
		
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click(); // Clicking phone
		
		driver.findElement(By.cssSelector("input#ext-gen270")).sendKeys("5555"); // Entering phone number
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); // Clicking on Find Leads
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]"));
		String text = element.getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); // New xpath after the refresh
		
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen246']/input")).sendKeys(text);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		String displayed = driver.findElement(By.xpath("//div[@id='ext-gen437']")).getText();
		
		if (displayed.contains("No records")) {
			System.out.println("The deletion was successfull");	
		} else {
			System.out.println("The deletion was unsuccessful");
		}
		
		driver.quit();
		
		
		
	}

}
