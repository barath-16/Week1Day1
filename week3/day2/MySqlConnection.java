package week3.day2;

public abstract class MySqlConnection implements DatabaseConnection { // Creating a abstract class which implements the DatabaseConnection interface

	// creating an implement method which is required from the interface as we dont need all the unimplement methods
	
	@Override
	public void executeUpdate() {
		
		System.out.println("Executed successfully");
		
	}

}
