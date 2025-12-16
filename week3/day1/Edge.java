package week3.day1;

public class Edge extends Chrome{
	
	public void takeSnap() {
		System.out.println("Takes Screenshot");
		
	}
	
	public void clearCookies() {
		System.out.println("Cookies cleared");

	}
	
	public static void main(String[] args) {
		
		Edge function = new Edge();
		
		function.clearCache();
		function.clearCookies();
		function.takeSnap();
		function.openURL();
		function.openIncognito();
		function.closeBrowser();
		function.navigateBack();
	}

}
