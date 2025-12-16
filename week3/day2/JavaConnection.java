package week3.day2;

public class JavaConnection implements DatabaseConnection{ // Accessing interface in Concrete Class

	
	// All the unimplemented methods in the interface are converted to implement method
	@Override
	public void connect() {
		
		System.out.println("Connection has been established");
	}

	@Override
	public void disconnect() {
		
		System.out.println("Server disconnected");
		
	}

	@Override
	public void executeUpdate() {

		System.out.println("Update to the server is executed");
		
	}

}
