package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int[] array1 = {3, 2, 11, 4, 6, 7}; //{2,3,4,6,7,11} Required output
		int[] array2 = {1, 2, 8, 4, 9, 7}; //{1,2,4,7,8,9}
		
		List<Integer> list1 = new ArrayList<Integer>(); // Creating a new list 
		List<Integer> list2 = new ArrayList<Integer>();// Creating a new list 
		
		for (Integer integer1 : array1) { // Assigning the values from the array1 to list1 using for each loop
			list1.add(integer1);
		}
		
		for (Integer integer2 : array2) { // Assigning the values from the array2 to list2 using for each loop
			
			list2.add(integer2);
		}
		
//		System.out.println(list1);
//		System.out.println(list2);
		
		Collections.sort(list1); // I did sorting for my reference or for easy readability
		Collections.sort(list2);
		
		int size = list1.size(); //Getting the size of each list
//		System.out.println(size);
		list2.size();
		
		for (int i = 0; i < list1.size()-1; i++) { // Looping through the first list list1
			for (int j = 0; j < list2.size()-1; j++) { //Looping through the second list list2
				 
				if (list1.get(i)==list2.get(j)) { // Conditional loop where if the value from list1 is equal to list2 print the numbers in the index
					
					System.out.println(list1.get(i));
					
				}
				
			}
			
		}
		
	}

}
