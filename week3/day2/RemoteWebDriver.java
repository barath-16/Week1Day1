package week3.day2;

public class RemoteWebDriver implements WebDriver {
	
	// interface - class = implements (Concrete class / Implementation class)
	// class - class = extends

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findElements() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void key() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		RemoteWebDriver driver = new RemoteWebDriver();
		driver.click(); // default method
		
		// we cannot call static method from interface
		
	}
	
}
