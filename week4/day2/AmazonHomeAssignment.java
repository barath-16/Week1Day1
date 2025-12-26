package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomeAssignment {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions option = new ChromeOptions(); // Entering as guest
		option.addArguments("--guest"); 
		
		ChromeDriver driver = new ChromeDriver(option); // Launching chrome Driver
		driver.manage().window().maximize(); // Maximizing the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Applying implicit wait

		driver.get("https://www.amazon.in/"); // Entering the URL
		driver.navigate().refresh(); // Using refresh to skip continue shopping page
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus 9 pro", Keys.ENTER); // Using keyboard actions to enter the required name
		
		String firstPrice = driver.findElement(By.xpath("(//div[@class='puisg-col-inner']//span)[14]")).getText(); //Since the page is dynamic I had to give the xpath this way. 
		String replaceAll = firstPrice.replaceAll("[₹,]", ""); // Replacing the ₹ , with nothing to compare the value in the end
		System.out.println(replaceAll); //Converting it to a proper integer
		
		String ratingNumber = driver.findElement(By.xpath("//div[@class='a-row a-size-small']/a")).getText(); //Getting the rating number
		System.out.println(ratingNumber);
		
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])")).click(); // clicking the image of the product 
		
		String homeHandle = driver.getWindowHandle(); // Since the new tab is opened need to switch between the windows
//		System.out.println(homeHandle);
		
		Set<String> childHandle = driver.getWindowHandles();
//		System.out.println(childHandle);
		for (String string : childHandle) { //Using foreach loop instead of set to switch to the child window
			
			if (!string.equals(homeHandle)) {
				driver.switchTo().window(string);
			}			
		}
		WebElement element2 = driver.findElement(By.xpath("//span[@id='productTitle']")); //Locating the product title to incorporate the wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Explicit wait is applied
		wait.until(ExpectedConditions.visibilityOf(element2));
		
		File type = driver.getScreenshotAs(OutputType.FILE); // Since the screenshot is take just after the new window is opened it captures white screen so introduced explicit wait for the visiblity of element
		File source = new File("./data/AmazonHome2.png");
		FileUtils.copyFile(type, source);
			
		WebElement element = driver.findElement(By.xpath("(//span[@class='a-button-inner']/input[@id='add-to-cart-button'])")); // Clicking on add to cart button
		element.click();
		
		String subTotal = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText(); // Getting the price in the cart
		
		String replaceAll1 = subTotal.replaceAll("[₹,]", ""); // Replacing the symbols and commas with the integer value
		System.out.println(replaceAll1);
		
		if (replaceAll.equals(replaceAll1)) { // Verification of the price is same
			System.out.println("Verified the product price is same in the cart");
		}
		
		driver.quit(); // Quits the browser
		
	}

}
