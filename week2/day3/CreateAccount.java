package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
	
		driver.findElement(By.linkText("Accounts")).click(); // Clicking on the accounts tab

		// Entering the details in the account tab
		driver.findElement(By.linkText("Create Account")).click(); 
		driver.findElement(By.id("accountName")).sendKeys("BarathR");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Selecting dropdowns
		WebElement element = driver.findElement(By.name("industryEnumId")); // Industry dropdown
		Select options = new Select(element);
		options.selectByIndex(3);
		
		WebElement element1 = driver.findElement(By.name("ownershipEnumId")); // Ownership dropdown
		Select options1 = new Select(element1);
		options1.selectByVisibleText("S-Corporation");
		
		WebElement element2 = driver.findElement(By.id("dataSourceId")); // Source Dropdown
		Select options2 = new Select(element2);
		options2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement element3= driver.findElement(By.id("marketingCampaignId")); //Marketing campaign dropdown
		Select options3 = new Select(element3);
		options3.selectByIndex(6);
		
		WebElement element4= driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']")); // State dropdown
		Select options4 = new Select(element4);
		options4.selectByValue("TX");
		
		// Once the details are entered Create Account button is clicked
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close(); // Closes the browser
		
	}

}
