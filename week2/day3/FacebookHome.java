package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookHome {

	public static void main(String[] args) {
		
//		ChromeOptions option = new ChromeOptions(); // Entering as guest
//		  option.addArguments("--guest"); 
		  
		ChromeDriver driver = new ChromeDriver(); // Initiating the chrome driver
		driver.manage().window().maximize(); // Maximizing the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://en-gb.facebook.com/"); // Launching the URL
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click(); // Clicking create an account
		
		//entering all the account details, First name, Lastname, mobile number, email
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kaisoku");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mugiwara");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9093400937");
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("FDa928348#212");
		
		//Selecting Date of Birth
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		Select options = new Select(element);
		options.selectByValue("14");
		
		WebElement element2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select options1 = new Select(element2);
		options1.selectByVisibleText("May");
		
		WebElement element3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select options2 = new Select(element3);
		options2.selectByVisibleText("1998");
		
		//Selecting gender		
		driver.findElement(By.xpath("//input[@value='2']")).click();
	}

}
