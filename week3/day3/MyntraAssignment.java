package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAssignment {

	public static void main(String[] args) throws InterruptedException {

		//Initiating the chrome driver, maximizing, entering the URL
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//div[@class='desktop-query']/input")).sendKeys("bags", Keys.ENTER); // Entering bags in the seachbox and giving enter keys
		
		driver.findElement(By.xpath("//label[text()='Men']")).click(); // Selecting Men checkbox
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Laptop Bag']")).click(); // Selecting the Laptop Bag checkbox
		
		String text = driver.findElement(By.xpath("//span[@class='title-count']")).getText(); // Getting the total number of items displayed
		System.out.println(text);
		
		Thread.sleep(2000);
		
		// Creating Lists which will store the values later
		List<String> productName = new ArrayList<String>(); 
		List<String> bagName = new ArrayList<String>();
		
		//Fetching the product names using findelements and also for loop to iterate through the elements
		List<WebElement> elements = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		for (int i = 0; i < elements.size()-1; i++) {
			String text2 = elements.get(i).getText(); // Getting the element found using get() method and using local variable to store the value
//			System.out.println(text2);	
			productName.add(text2); // using the local variable to add to the empty list to store the data above
		}
		Collections.sort(productName); 
		System.out.println(productName); // Prints the values in sorted order
		
		//Fetching the product names using findelements and also for loop to iterate through the elements
		List<WebElement> bag = driver.findElements(By.xpath("//h4[@class='product-product']")); 
		for (int i = 0; i < bag.size()-1; i++) {
			
			String text2 = bag.get(i).getText(); // Getting the element found using get() method and using local variable to store the value
			bagName.add(text2);			// using the local variable to add to the empty list to store the data above
		}
		Collections.sort(bagName);
		System.out.println(bagName);  // Prints the values in sorted order
		
		driver.quit(); // Closing the browser
		
		
		
		
		
		

		
	}

}
