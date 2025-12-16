package week3.day2;

public interface WebDriver {
	
	// Unimplemented Methods
	
	void findElement();
	public void findElements();
	public void get();
	
	//till java 1.7 - 100% Abstract method - Only implemented methods
	
	//Implemented Method - 2 types
	//1. Static Method & 2. Default Method
	
	static void quit() {
		System.out.println("Static - Quit");
	}
	
	default void click() {
		System.out.println("Default - click");
	}
	
	void key();
	
	
}
