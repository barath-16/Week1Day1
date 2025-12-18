package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {
		
		// List syntax and methods
//		List<String> value = new ArrayList<String>();
		List<Integer> value = new ArrayList<Integer>();
				
		//add()
		value.add(100);
		value.add(90);
		value.add(80);		
		System.out.println(value);
		
		List<Integer> value1 = new ArrayList<Integer>();
		
		//add()
		value1.add(70);
		value1.add(60);
		value1.add(50);		
		System.out.println(value1);

		//addAll() - Merging all the values in List Name
		value.addAll(value1); // Syntax - ListName1.addAll(ListName2);
		System.out.println(value); // Values from ListName2 is shifted to ListName1 
		
		//get() - Index value starts with 0
		System.out.println("Get the value present in index 2: " + value.get(2));
		
		//remove() - Values based on the index
		value.remove(1);
		System.out.println("Remove the index 1 " + value);
		
		//sort() - We use super class Collections 
		Collections.sort(value);
		System.out.println(value);
		
		//clear()
		value.clear();
		System.out.println(value);
		
		
		
		
	}

}
