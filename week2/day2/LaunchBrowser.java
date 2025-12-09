package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("TestLeaf");
		
		//waits the execution
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("pass@word");
		driver.findElement(By.name("login")).click();
		
		//get Title of the page
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
