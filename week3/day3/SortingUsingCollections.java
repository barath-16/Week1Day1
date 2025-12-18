package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array1 = {"HCL", "Wipro", "Aspire Systems", "CTS"}; // Given String
		
		List<String> list1 = new ArrayList<String>(); // Creating a new list
		
		for (String string : array1) { //Assigning the string array values to the list
			
			list1.add(string);
		}
		
		Collections.sort(list1); // Sorting them in ascending order
		
		for (int i = list1.size()-1; i>=0 ; i--) { // Iterating in reverse order
			
			System.out.println(list1.get(i)); // Printing the values in reverse order
			
		}
	}

}
