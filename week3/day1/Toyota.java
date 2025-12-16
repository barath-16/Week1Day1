package week3.day1;

public class Toyota extends Car {

	
	public void nameOfCar() {
		System.out.println("SUPRA");

	}
	
	public void logoOfCar() {
		System.out.println("T");

	}
	
	public static void main(String[] args) {
		Toyota product = new Toyota();
		product.designOfCar();
		product.accelerator();
		product.breaking();
		product.clutch();
		product.horn();
		product.nameOfCar();
		product.logoOfCar();

	}

}
