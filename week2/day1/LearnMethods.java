package week2.day1;

public class LearnMethods {
	
	//syntax 
	// Access modifier, ReturnType, Method name(Camel Case)
	
	public void method1() {
		System.out.println("I am public method");
	}
	
	protected String method2(String name, int age) {
		System.out.println(name+" "+age);
		return name+age;
	}
	
	void method3() { // default method
		System.out.println("I am default class");
	}
	
	private void method4() {
		System.out.println("I am private class");
	}

	// We need to have main method to initiate the class file
	
	public static void main(String[] args) {
		
		// Syntax for creating object
		// className object = new className();
		
		LearnMethods createObj = new LearnMethods();
		createObj.method1();
		createObj.method2("Barath", 5);
		createObj.method3();
		createObj.method4();
		
		//reusing the methods if required
		
		LearnMethods anotherObj = new LearnMethods();
		anotherObj.method1();
		anotherObj.method2("Anbu", 10);

		//-----------------------------------------------------------
		// Calling this class in another class
		// Refer Operators class
		//------------------------------------------------------
		
		
		
	}
}
