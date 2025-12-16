package week3.day1;

import java.net.Socket;

public class Chrome extends Browser {
	
	public void openIncognito() {
		
		System.out.println("The browser is opened in incognito");

	}

	public void clearCache() {
		
		System.out.println("Browser cache is cleared");

	}
	
	public static void main(String[] args) {
		
		Chrome name = new Chrome();
		name.openURL();
		name.closeBrowser();
		name.navigateBack();
		name.clearCache();
		name.openIncognito();
		
		
	}
}
