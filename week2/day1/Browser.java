package week2.day1;

public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println(browserName + " is loaded successfully");
		return browserName;
	}
	
	public String loadUrl() {
		//System.out.println("URL loaded successfully");
		String url = "URL loaded successfully";
		return url;
	}

	public static void main(String[] args) {
		
		Browser browserObj = new Browser();
		browserObj.launchBrowser("Chrome Browser");
		System.out.println(browserObj.loadUrl());
	}
}
