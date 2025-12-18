package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllPrice {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone", Keys.ENTER);;

		//Finding the price all the products in the amazon site. Use FindElements
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	
		//Get the size of the list
		int size = elements.size();
		
		List<Integer> price = new ArrayList<Integer>();
		//Iterating through the elements
		
		for (int i = 0; i < elements.size(); i++) {
			
			String text = elements.get(i).getText();
			System.out.println(text);
			
			if (!text.isEmpty()) {
				String replaceAll = text.replaceAll(",", "");
			
				int int1 = Integer.parseInt(replaceAll);
				
//				System.out.println(int1);
				
				price.add(int1);
			} 	
		}
		Collections.sort(price);
		System.out.println(price);
	
	}

}
