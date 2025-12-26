package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDealHomeAssignment {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions option = new ChromeOptions(); // Entering as guest
		option.addArguments("--guest"); 
		
		ChromeDriver driver = new ChromeDriver(option); // Launching chrome Driver
		driver.manage().window().maximize(); // Maximizing the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Applying implicit wait
		
		driver.get("https://www.snapdeal.com/"); //Entering the URL
		
		WebElement element = driver.findElement(By.xpath("//div[@id='tab-category-0']/div")); //Identifying the element
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform(); //Hover action over the found element
		
		driver.findElement(By.xpath("//div[text()='Sports Shoes']")).click(); //Clicking on the Sports Shoes from the hover over element
		
		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText(); //Getting the Total items under the selected options
		System.out.println(text);
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click(); // Clicking the checkbox from the filter column
		
		driver.findElement(By.xpath("//div[@class='sorting-sec animBounce']/div")).click(); // Selecting the sorting filter
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click(); // Selecting the Low to High filter
		
		String text2 = driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).getText(); //Printing the Low to High filter selected
		System.out.println(text2);
		
		WebElement element4 = driver.findElement(By.xpath("//input[@name='fromVal']")); //Identifying the filter to adjust the price
		element4.clear(); // Clearing the field
		element4.sendKeys("500"); //Entering the required field
		
		WebElement element5 = driver.findElement(By.name("toVal")); //Identifying the filter to adjust the price
		element5.clear(); // Clearing the field
		element5.sendKeys("700"); //Entering the required field
		
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click(); // Clicking on GO after selecting the price range
		
		WebElement element2 = driver.findElement(By.xpath("//a[text()=' White & Blue']")); // Identifying the filter element
		
		action.scrollToElement(element2).perform(); // Since the element is down the page so we need to scroll to identify it
		driver.executeScript("arguments[0].click();", element2); // Performing the click action using the JSexecutor
		
		String text3 = driver.findElement(By.xpath("//div[@class='filters']/div")).getText(); // Getting the filter applied
		System.out.println(text3);
		
		String text5 = driver.findElement(By.xpath("//div[@class='navFiltersPill'][2]")).getText(); // Getting the filter applied
		System.out.println(text5);
		
		WebElement element3 = driver.findElement(By.xpath("//div[@id='products']/section/div")); //Hovering of the item displayed to perform the quick view option
		action.moveToElement(element3).perform();
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click(); // Clicking on the element after hover over
		
		String text4 = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']")).getText(); // Getting the price and offer text
		System.out.println(text4);
		
		//Taking the screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./data/SnapDeal.png");
		FileUtils.copyFile(source, target);
		
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click(); //Closing the pop up
		
		driver.quit(); // Closing the browser
		
	}

}
