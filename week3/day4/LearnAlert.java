package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//Switch the driver focus to alert box
		
		Alert alert1 = driver.switchTo().alert();
	
		//-------------------------------------------------------------
		
		//Simple Alert
		
		//To get the text
		String alert1text = alert1.getText();
		System.out.println(alert1text);
		
		//To accept the alert
		alert1.accept();
		
		//---------------------------------------------------------------
		
		//Confirmation Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		String alert2text = alert2.getText();
		System.out.println(alert2text);
		
		// To accept or reject the alert
		
		alert2.accept();
		System.out.println("Alert accepted");
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert2.dismiss();
		System.out.println("Alert dismissed");
		
		//---------------------------------------------------------------
		
		// Non Model Alert - Sweet Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		System.out.println("Sweet Alert - Dismissed");
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		
		
		
	}

}
