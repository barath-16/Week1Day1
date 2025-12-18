package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		
		int[] array1 =  {3, 2, 11, 4, 6, 7}; //Given array
		
		List<Integer> largestNum = new ArrayList<Integer>(); //Creating a new list
		
		for (Integer integer : array1) { //Assigning the values to the list from array
			
			largestNum.add(integer);			
		}
		
		Collections.sort(largestNum); // Sorting the list
		int size = largestNum.size(); //Getting the size of the list to know the index number
		System.out.println(size);
		
		System.out.println(largestNum.get(size-2)); // Getting the second largest number by subtracting 2 since the index value starts from 0
	}

}
