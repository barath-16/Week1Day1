package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomActivity {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.navigate().refresh();
				
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones", Keys.ENTER);
		List<WebElement> element = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		int size = element.size();
		
		List<Integer> price = new ArrayList<Integer>();
		
		for (int i = 0; i < element.size(); i++) {
			
			String text = element.get(i).getText();
//			System.out.println(text);
			
			if (!text.isEmpty()) {
				String replaceAll = text.replaceAll(",", "");
				int int1 = Integer.parseInt(replaceAll);
				
				price.add(int1);
			}
		}
		Collections.sort(price);
		System.out.println(price.get(0));
		
		
	}

}
