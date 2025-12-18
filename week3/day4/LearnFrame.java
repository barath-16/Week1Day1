package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		
		driver.findElement(By.xpath("//span[text()='Frame']")).click();
		
		
		//Switching the driver focus to iframe/Another DOM
		
		//Using name
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("Click")).click();
		
		String iframeTitle = driver.getTitle();
		System.out.println(iframeTitle);
		
		driver.switchTo().defaultContent();
		
		//Nested Frame
		driver.switchTo().frame(2); // Parent
		
		//Switching to child frame
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		
		//Switching from childframe to parent
		driver.switchTo().parentFrame();
		
		
		
		
	}

}
