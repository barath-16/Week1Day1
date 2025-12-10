package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDropDown {

	public static void main(String[] arg) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/"); // Launching the URL
		
		driver.findElement(By.xpath("(//li[@class='ui-menuitem-submenu'])[3]")).click();
		driver.findElement(By.id("menuform:m_dropdown")).click();
		
		driver.findElement(By.className("ui-selectonemenu")).click();
		
		
		
		
		
	}

}
