package week3.day3;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		// Types of Array - Static and Dynamic
		char[] values = {'a','e','i','o','u'}; //Values are in array
		
		Set<Character> unique = new TreeSet<Character>();
		//a-97 , e-101, i-105, o-111, u-117
		
		//ForEach Loop - For assigning values
		
		for (Character i : values) {
			unique.add(i);			
		}
		System.out.println(unique); // Answer in the set format
		
		
	}

}
