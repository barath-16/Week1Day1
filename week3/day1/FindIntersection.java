package week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class FindIntersection {

	public static void main(String[] args) {
		
		int a[] = {3,2,11,4,6,7}; //2,3,4,6,7,11
		int b[] = {1,2,8,4,9,7}; //1,2,4,7,8,9
		Arrays.sort(a);
		Arrays.sort(b);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);					
				}
				
			}
			
		}
		

	}

}
