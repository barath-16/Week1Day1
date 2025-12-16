package week3.day1;

public class AutomobileParts {
	
	public void horn() {
		System.out.println("Horn");		
	}
	
	public void breaking() {
		System.out.println("Breaking");	
	}
	
	public void clutch() {
		System.out.println("Clutch");	
	}
	
	public void accelerator() {
		System.out.println("Accelerator");	
	}

	public static void main(String[] args) {
		
		//Similar attributes - Horn, breaking, clutch, accelerator
		AutomobileParts auto = new AutomobileParts();
		auto.accelerator();
		auto.breaking();
		auto.clutch();
		auto.horn();

	}

}
