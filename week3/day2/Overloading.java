package week3.day2;

public class Overloading {
	
	public void reportStep(String msg, String status ) {

		System.out.println(msg + " " + status);
	
	}

	public void reportStep(String msg, String status, boolean snap) {
		
		System.out.println(msg+ " "+status +" " +snap);

	}
	
	public static void main(String[] args) {
		
		Overloading obj = new Overloading();
		obj.reportStep("Whether site has been loaded?", "Navigated Successfully");
		obj.reportStep("Whether site has been loaded?", "Ahh.. Error while loading", false);
	}
}
