package week3.day2;

public class Browser {
	
	// Method Overloading
	// inside the same class, method with different arguements
	
	public void browserDetails(String browserName , int browserVersion) {
		System.out.println(browserName + " " + browserVersion);
	}

	public void browserDetails(String browserName) {
		System.out.println("I am chrome");
		
	}
	
	public static void main(String[] args) {
		
		Browser initi = new Browser();
		initi.browserDetails("Chrome", 0);
	}
}
