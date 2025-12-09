package week2.day1;

import java.util.Iterator;

public class ReverseOddPosition {

	public static void main(String[] args) {
		
		String text = "I am a software tester"; // Given String
		
		//Expected output - “I ma a erawtfos tester”
		
		String[] split = text.split(" "); //Split the given string into " " delimiter
		
		for (int i = 0; i < split.length-1; i++) { // Iterating through the split words
			if(i%2==1) { // Condition to check the odd index values 
				
				char[] charArray = split[i].toCharArray(); // If the logic satisfied convert it to a array
				
//				System.out.println(split[i]);
				for (int j = charArray.length-1; j >=0; j--) { // Inside the array, the loop will print the letters in the reverse order
					System.out.print(charArray[j]);				
				}
				System.out.print(" "); // This will leave space for the reverse printed words
			}
			else {
				System.out.print(split[i]+" "); // If the condition is even the word is printed here, if odd it goes through the loop and prints it together
			}
		}

	}

}
