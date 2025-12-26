package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasketHomeAssignment {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions(); // Entering as guest
		option.addArguments("--guest"); 
		
		ChromeDriver driver = new ChromeDriver(option); // Launching chrome Driver
		driver.manage().window().maximize(); // Maximizing the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Applying implicit wait
		
		Actions action = new Actions(driver); // Applying the actions class to imply it
		
		driver.get("https://www.bigbasket.com/"); // Opening the URL
		driver.findElement(By.id("headlessui-menu-button-:Ramkj6:")).click(); // Clicking on the select product option
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		wait.until(ExpectedConditions.visibilityOf(element)); // Since this particular element is taking time to load used visibility of element explicit wait
		action.moveToElement(element).perform(); // Performed Hover action to open the sub hover elements
		
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']")); 
		action.moveToElement(element2).perform(); // Hover over this element for sub sub hover elements XD 
		
		WebElement element3 = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		action.moveToElement(element3).perform(); // Hovering over the last option which needs to be selected
		element3.click(); // Clicking on the element
		
		driver.findElement(By.xpath("//input[@id='i-bbRoyal']")).click(); // Selecting the bb Royal from the filter. 
		
		// Page is not loading so I had to stop here......
		
		
	}

}
