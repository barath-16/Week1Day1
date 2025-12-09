package week2.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String test = "changeme"; //length is 8
		char[] charArray = test.toCharArray(); // changing String to Array
	
		for (int i = charArray.length-1; i>=0; i--) { // Iterating through the array 
			
			if (i%2==1) { //finding odd index characters
				
//				System.out.println(charArray[i]);
				charArray[i] = Character.toUpperCase(charArray[i]); // converting the odd index characters to uppercase by Character wrapper class
				
			}

		}
		
		String result = new String(charArray); // convert array to string again
		System.out.println(result); // printing the end result
	}

}