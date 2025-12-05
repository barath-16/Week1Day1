package week1.day2;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "Thursday";
		
		switch (day) {
		case "Monday":
			System.out.println("The current day is Monday");;
			break;
		case "Tuesday":
			System.out.println("The current day is Tuesday");;
			break;
		case "Wednesday":
			System.out.println("The current day is Wednesday");;
			break;
		case "Thursday":
			System.out.println("The current day is Thursday");;
			break;
		case "Friday":
			System.out.println("The current day is Friday");;
			break;
			
		default:
			System.out.println("This is holiday");
			break;
		}
	}

}
