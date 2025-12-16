package week3.day2;

public interface DatabaseConnection { //Creating a interface
	
	// Abstract methods are given
	
	void connect(); 
	
	public void disconnect();
	
	public void executeUpdate();
	

}
