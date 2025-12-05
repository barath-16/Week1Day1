package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int n = 13; // given number
		
		for(int i =2; i<n; i++) { // Iterating through all the numbers till the input number
			if(n%i == 0) {   // If the iterated number divides the input number it is not prime
				System.out.println("The number is not prime");
				break;
			}			
			else {   // Else printing the number is prime
				System.out.println("The number is prime");
			}

		}
		}

	}


