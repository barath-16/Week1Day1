package week3.day2;

public class SubclassOverride extends Overriding {

	@Override
	public void completed() {
		System.out.println("Override is completed");
	}
	
	public static void main(String[] args) {
		
		SubclassOverride obj = new SubclassOverride();
		obj.completed();
	}
}
