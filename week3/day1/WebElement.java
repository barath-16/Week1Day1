package week3.day1;

import org.openqa.selenium.WebDriver;

public class WebElement { // Creating a superclass Webelement 
	
	// Adding unimplemented method
	public static WebDriver driver;
	
	// adding few implemented method
	public void click() {

		System.out.println("Performs Click Function");

	}
	
	public void setText(String text) {
		
		System.out.println(text);

	}

	public static void main(String[] args) { //Calling both the methods in this class
		
		WebElement newElement = new WebElement();
		newElement.click();
		newElement.setText("Click Here!!!!!");
		
		
		

	}

}
