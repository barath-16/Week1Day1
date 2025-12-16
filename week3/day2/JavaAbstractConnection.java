package week3.day2;

public class JavaAbstractConnection extends MySqlConnection { // Creating a new class as JavaAbstractConnection and implementing the Abstract Class

	// Since the executeUpdate() method is already converted to implemented method from interface the remaining unimplemented method is called defaultly
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		JavaAbstractConnection obj = new JavaAbstractConnection();
		obj.executeUpdate(); // Able to call the executeupdate() method in this class
	}

}