package week1.day2;

public class FibonnaciSeries {

	public static void main(String[] args) {
				
		// 0 1 1 2 3 5 8 13
		
		int input = 8; //we need to get 8 series of fibonnaci series
		int fib = 0;
		int first = 1;
		
		System.out.print(fib + " " + first + " ");
		for (int i = 0; i <input -2; i++) {   //Iterating through remaining 6 inputs 
			
			fib = first + i; // f = f(n-1) + f(n-2)
			first = fib;
			System.out.print(fib+ " ");
			
		}

	}

}
