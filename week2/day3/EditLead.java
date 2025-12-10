package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.linkText("Create Lead")).click(); // Click on the partial link
		
		//Leads page with the necessary details entered
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Straw Hats"); // company name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kaisoku"); // first name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Luffy"); // last name
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("RubberMan"); //first local name
		driver.findElement(By.cssSelector("input#createLeadForm_departmentName")).sendKeys("Rubber"); // department name
		
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("I am luffy, gear 2"); //Description
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("luffy@gmail.com"); //email
		
		 // State Dropdown
		WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select option1 = new Select(element);
		option1.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click(); // Clicking on the submit button
		
		driver.findElement(By.linkText("Edit")).click(); // Clicking on Edit button
		
		driver.findElement(By.id("updateLeadForm_description")).clear(); //clearing description field
		
		driver.findElement(By.cssSelector("textarea#updateLeadForm_importantNote")).sendKeys("Description deleted"); // entering the text in importent note field
		driver.findElement(By.xpath("//input[@value='Update']")).click(); // Clicking on update button
		
		//Gets the page title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Closes the browser
		driver.close();
		
		

	}

}
