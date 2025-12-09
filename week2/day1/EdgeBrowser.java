package week2.day1;

public class EdgeBrowser {
	
	public static void main(String[] args) {
		
		Browser launchEdge = new Browser();
		launchEdge.launchBrowser("Edge Browser");
		System.out.println(launchEdge.loadUrl());
	}

}
