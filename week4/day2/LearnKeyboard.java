package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnKeyboard {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.snapdeal.com/");
		
		driver.findElement(By.xpath("//input[@id='search-box-input']")).sendKeys("Bike",Keys.ENTER);
		
		//To Take screenshot
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);		
		File target = new File("./data/Sample1.png");
		FileUtils.copyFile(screenshotAs, target);
	}

}
