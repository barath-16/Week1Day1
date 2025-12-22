package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassRoomActivity {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.findElement(By.id("flight")).click();
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> childHandle = new ArrayList<String>(windowHandles);
		driver.switchTo().window(childHandle.get(1));
		
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		
		driver.switchTo().window(childHandle.get(0));
		driver.close();
		
		

	}

}
