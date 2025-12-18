package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3, 4, 10, 6, 8}; // Given String
		
		List<Integer> list1 = new ArrayList<Integer>(); // Creating a new list
		
		for (Integer integer : array1) { //Assigning the array values to the list
			
			list1.add(integer);			
		}
		
		Collections.sort(list1); // Sorting the list in ascending order
		
		for (int i = 0; i < list1.size()-1; i++) { // Iterating the list
			
			Integer integer = list1.get(i); // Assigning a local variable to the value which get method gets
			
			if (integer == i+1) { // Applying conditional statement to check whether integer we got is equal to i+1
				
				System.out.println(list1.get(i)); // If condition satisfies the value of the number is printed
			}
			else {
				 System.out.println(list1.get(i)+1); // If it didnt satisfy then the returned number is add by 1
			}

		}		
		
	}
}
