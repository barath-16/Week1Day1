package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTables {

	public static void main(String[] args) {	
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/table.xhtml");
	
	String firsttext = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
	System.out.println(firsttext);
	
	//Printing 3rd row 2nd column
	String secondtext = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]/td[2]")).getText();
	System.out.println(secondtext);
	
	//print 3rd row value
	String thirdrow = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]")).getText();
	System.out.println(thirdrow);
	
	
	//printing 3rd column value
	
	List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]"));
	System.out.println(elements);
	
	}

}
