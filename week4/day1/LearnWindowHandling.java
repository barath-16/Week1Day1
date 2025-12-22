package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/select.xhtml");

	driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
	driver.findElement(By.id("menuform:m_window")).click();
	
	driver.findElement(By.xpath("//span[text()='Open']")).click();
	
	
	//Switching the driver focus
	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
	
	//To print the current window title
	String parentTitle = driver.getTitle();
	System.out.println(parentTitle);	
	
	//Getting the window address of all the windows open
	Set<String> childWindow = driver.getWindowHandles();
	System.out.println(childWindow);
	
	//Switch to childWindow
	//Declare a empty List
	List<String> getWindow = new ArrayList<String>(childWindow);
	
	//Directly get the child window by using get method in the print statement
	WebDriver window = driver.switchTo().window(getWindow.get(1));
	System.out.println(window);
	
	//Get the title of the child window
	String childWindowTitle = driver.getTitle();
	System.out.println(childWindowTitle);
	
	driver.findElement(By.id("email")).sendKeys("abcd@efgd.com");
	driver.close();
	
	// To access the other child window
	driver.switchTo().window(getWindow.get(0));
	
	driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	
	Set<String> thirdWindow = driver.getWindowHandles();
	List<String> thirdList = new ArrayList<String>(thirdWindow);
	
	driver.switchTo().window(thirdList.get(2));
	String thirdTitle = driver.getTitle();
	System.out.println(thirdTitle);
	
	
	
	
	
	}

}
