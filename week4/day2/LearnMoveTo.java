package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMoveTo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement element = driver.findElement(By.xpath("//div[@id='tab-category-0']/div"));
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();

	}

}
