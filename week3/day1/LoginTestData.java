package week3.day1;

public class LoginTestData extends TestData { // Inheriting the Superclass in this subclass
	
	// Having new set of methods for this sub class
	public void enterUsername() {  
		
		System.out.println("Username is entered");

	}
	
	private void enterPassword() {
		
		System.out.println("Password is entered");

	}

	public static void main(String[] args) { // Retrieving all the methods in this subclass
		
		LoginTestData subClass = new LoginTestData();
		subClass.navigateToHomePage();
		subClass.enterCredentials();
		subClass.enterUsername();
		subClass.enterPassword();
		

	}

}
