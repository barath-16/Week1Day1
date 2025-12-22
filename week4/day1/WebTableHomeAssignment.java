package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHomeAssignment {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://finance.yahoo.com/");
		
		driver.findElement(By.xpath("//div[text()='Markets']")).click();
		driver.findElement(By.xpath("(//span[@class='ellipsis yf-1boupp5'])[9]")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//table[@class='yf-1uayyp1 bd']/tbody/tr[2]/td[2]"));
//		String text = driver.findElement(By.xpath("//table[@class='yf-1uayyp1 bd']/tbody/tr[3]/td[2]")).getText();
//		System.out.println(text);
		

		for (WebElement webElement : elements) {
			
			String text = webElement.getText();
			System.out.println(text);
			
		}
	}

}
