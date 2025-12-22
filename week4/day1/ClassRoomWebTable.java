package week4.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://erail.in/");
		
		WebElement fromLoc = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromLoc.clear();
		fromLoc.sendKeys("MAS",Keys.ENTER);
		
		WebElement toLoc = driver.findElement(By.id("txtStationTo"));
		toLoc.clear();
		toLoc.sendKeys("MDU",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/td[2]"));
		Set<WebElement> duplicateTrain = new HashSet<WebElement>(elements);
		
		for (WebElement ele : duplicateTrain) {
			String trainName = ele.getText();
			System.out.println(trainName);	
			
		}
	}

}
