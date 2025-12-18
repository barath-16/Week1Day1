package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomActivity {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
//		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert1 = driver.switchTo().alert();
		String alert1Text = alert1.getText();
		System.out.println(alert1Text);
		
		alert1.accept();
		String text1 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text1);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		alert1.dismiss();
		String text2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text2);
		
		
	}

}
