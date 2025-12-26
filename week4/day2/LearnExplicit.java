package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicit {

	public static void main(String[] args) {
		
		// Wait statment - Thread.sleep(), implicitlywait
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/waits.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		

		WebElement element = driver.findElement(By.xpath("//span[text()='I am here']"));		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
		String text = element.getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//button[@name='j_idt87:j_idt95']")).click();
				
		driver.findElement(By.name("j_idt87:j_idt96")).click();
		
		

	}

}
