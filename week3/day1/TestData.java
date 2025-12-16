package week3.day1;

public class TestData { //Created a Superclass TestData
	
	public void enterCredentials() { 
		
		System.out.println("Enter the Credentials : ");

	}
	
	public void navigateToHomePage() {
		
		System.out.println("Navigates to Home page");

	}

	public static void main(String[] args) { //Called both the methods in this class
		
		TestData superClass = new TestData();
		superClass.enterCredentials();
		superClass.navigateToHomePage();

	}

}
