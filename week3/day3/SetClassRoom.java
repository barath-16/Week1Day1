package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetClassRoom {

	public static void main(String[] args) {

		String companyName = "google";
		
		char[] charArray = companyName.toCharArray();
		
		Set<Character> duplicateRemover = new LinkedHashSet<Character>();
		
		for (Character i : charArray) {
			
			duplicateRemover.add(i);
			
		}
		System.out.println(duplicateRemover);
	}

}
