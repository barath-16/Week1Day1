package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassRoomActivityActions {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		
		WebElement element = driver.findElement(By.xpath("(//li[@class='nav_first']/a)[5]"));
		Actions action = new Actions(driver);
		action.scrollToElement(element).perform();
		
		String text = element.getText();
		System.out.println(text);
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./data/amazon.png");
		FileUtils.copyFile(screenshotAs, target);
		
		driver.quit();
		

	}

}
