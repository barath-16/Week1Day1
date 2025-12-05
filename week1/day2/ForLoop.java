package week1.day2;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 10;
		
//		for (int i = 0; i < number; i++) {
//			System.out.println(i);
//		}
//		for (int i = number; i >0 ; i--) {
//			System.out.println(i);
//		}

		for (int i = 0; i < number; i++) {
		if (i==3) {
			System.out.println("The given value is equal to 3");
			continue;
		}else if (i==4) {
			System.out.println("The given value is equal to 4");
			break;
		} else {
			System.out.println("Neither 3 or 4");

		}
		}
	}

}
