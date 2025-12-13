package week2.day4;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAdvXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); // Initiating the chrome driver
		driver.manage().window().maximize(); // Maximizing the window
		
//		driver.get("https://login.salesforce.com/?locale=in"); // Launching the URL
//		
//		// Parent to Child
//		driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("Username");
//		
//		// GrandParent to Child //div[@id='usernamegroup']//input
//		driver.findElement(By.xpath("//div[@id='usernamegroup']//input")).sendKeys("Username");
		
//		driver.get("https://www.facebook.com/");
//		
//
//		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
//		
//		driver.findElement(By.xpath("(//div[@class='_5dbb']//input)[1]")).sendKeys("Luffy");
//		driver.findElement(By.xpath("(//div[@class='_5dbb']//input)[2]")).sendKeys("Kaisoku");
//		driver.findElement(By.xpath("//span[@class='_5k_3']//label")).click();
//		driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input)[5]"));
		
		driver.get("http://leaftaps.com/opentaps/");
		
		//Getting text
		String text = driver.findElement(By.xpath("//label[text()='Username']")).getText();
		System.out.println(text);
		
		// Page Title
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.contains("Login")) {
			System.out.println("It contains 'Login'");
		} else {
			System.out.println("It does not contain");
		}
		
		//Current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//getDomAttribute - Later after 4.20
		@Nullable
		String domAttribute = driver.findElement(By.xpath("//input[@id='password']")).getDomAttribute("name");
		System.out.println(domAttribute);
		
		//isEnabled()
		boolean enabled = driver.findElement(By.xpath("//input[@id='password']")).isEnabled();
		System.out.println(enabled);
		
		
		driver.close();
		
	}

}
