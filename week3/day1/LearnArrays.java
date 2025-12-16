package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		//Using Literal Declaration
		int[] number = {98,89,89,96,74};
		
		//To find the length of array
		int lengthOfArray = number.length;
		System.out.println(lengthOfArray);
		
		//To find the last index value
		//When a value is given in the [] brackets it will take up index value
		System.out.println("Last index value of number "+number[lengthOfArray-1]);;
		
		//To find the first index value
		System.out.println("First value "+ number[0]);
		
		// To sort the array value
		Arrays.sort(number); // This will default sort it in ascending order
		System.out.println("Array after sorting "+ number[0]);
	
		// To iterate the Arrays value - for Loop
		for (int i = 0; i < number.length; i++) {
//			System.out.println(i); // Prints the index value of the characters in the array
			System.out.println("Values inside the array " + number[i]);;
			
		}
		
	
	}

}
