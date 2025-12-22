package week4.day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandleHomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions(); // Entering as guest
		option.addArguments("--guest"); 
		
		ChromeDriver driver = new ChromeDriver(option); // Launching chrome Driver
		driver.manage().window().maximize(); // Maximizing the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Applying implicit wait
		
		driver.get("http://leaftaps.com/opentaps/control/login"); // Logging into the URL
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); // Enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // Enter password
		driver.findElement(By.className("decorativeSubmit")).click(); // Click on submit button
		
		driver.findElement(By.partialLinkText("CRM")).click(); // Click on the partial link
		driver.findElement(By.xpath("//a[text()='Contacts']")).click(); //Clicking on the contacts
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click(); // Selecting merge contacts from the left lane
		
		WebElement fromWidget = driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")); // Selecting the widget using following sibling
		fromWidget.click();
		
		String windowHandle = driver.getWindowHandle(); // Gets the address of the parent window
		System.out.println(windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles(); // Gets the address of the opened windows
		System.out.println(windowHandles);
		
		for (String string : windowHandles) { // Assigning values to the string variable
			
			if (!string.equals(windowHandle)) {  // Without using list, giving a conditional statement where string != windowHandle since both have same address
				driver.switchTo().window(string);	// switching to the child window
				break;
			}
			String title = driver.getTitle(); // Getting the title of child window for confirmation
			System.out.println(title);
		}
		
		driver.findElement(By.xpath("//a[@class='linktext']")).click(); // Clicking on the first result which appears
		
		driver.switchTo().window(windowHandle); // Switching to parent window using the getWindowHandle local variable
		
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click(); //clicking on the widget using the following sibling
		
		Set<String> windowHandles2 = driver.getWindowHandles(); // Getting the new address of the opened windows
		System.out.println(windowHandles2);
		
		for (String string : windowHandles2) { // Assigning values to the new string
			 
			if (!string.equals(windowHandles2)) {  // Checking the condition where the address is matching
				
				driver.switchTo().window(string); //Switching to the child window
			}			 
		}
		
		String title2 = driver.getTitle(); // Printing the child window title for confirmation
		System.out.println(title2);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]")).click(); // Clicking on the second result which is shown
		
		driver.switchTo().window(windowHandle); //Switching to parent handle by reusing the same local variable
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click(); // Clicking on the merge button
		
		Alert alert = driver.switchTo().alert(); // Accepting the model alert using alert class
		alert.accept();
		
		String title = driver.getTitle(); // Fetching the title of the page
		System.out.println(title);
		
		driver.quit(); // Closes all the browser windows
	}

}
