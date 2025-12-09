package week2.day1;

import java.util.Iterator;

public class LearnString {

	public static void main(String[] args) {

		//String - Literal - constant pool
		//Syntax
		
		String name = "Parse";
		
		//String - Instantiation - Heap memory
		//Syntax
		
		String newName = new String("BarathR K");
//		System.out.println(name + " "+ newName);
		
		//----------------------------------------------------------------------------
		
		//length() - finds the length of the String

		System.out.println(name.length());
		
		//----------------------------------------------------------------------------
		
		// equals() to verify the condition
		
//		System.out.println(name.equals(newName)); gives true or false
		
		if (name.equals(newName)) {
			System.out.println("Both are equal");			
		}
		else {
			System.out.println("Both are not equal");
		}
		
		//----------------------------------------------------------------------------
		
		//equalIgnoreCase() - Compares 2 String values but ignores case sensistive
		
		String referName = "kaviya";
		String newRefName = new String("kaViYa");
		
		if (referName.equalsIgnoreCase(newRefName)) {
			System.out.println("Both are equal");			
			}
			else {
				System.out.println("Both are not equal");
			}
		
		//----------------------------------------------------------------------------
		
		//contains() - Checks whether the character is present - Case Sensitive
		// return type is boolean
		//convert it to a local variable
		
		boolean contains = referName.contains("k");
		System.out.println(contains);
		
		//----------------------------------------------------------------------------
		
		//toCharArray() - to convert the string to character array
		// Print the reverseString
		String data = "Barath";
		char[] charArray = data.toCharArray();
		
		for (int i = charArray.length-1; i >= 0 ; i--) {
			System.out.println(charArray[i]);			
		}
		
		//----------------------------------------------------------------------------
		
		//toChatAt() - prints the particular character using index
		// The index value starts from 0
		
		System.out.println("Index value of 3 is "+ data.charAt(3));
		
		//----------------------------------------------------------------------------
		
		//split() - Splits the given string using delimiter
		String nameNew = "Today is Monday";
		String[] split = nameNew.split(" ");
//		System.out.println(split); // cannot print the variable name it will give alpha numeric code0
		
		for (int i = 0; i < split.length; i++) {
			
			System.out.print(split[i] + " ");
			}
		
		//----------------------------------------------------------------------------
		
		// replace() - to replace a character in string with another character
		String replaceValue = "Good Afternoon";
		String replace = replaceValue.replace('o', '0');
		System.out.println(replace);
		
		//----------------------------------------------------------------------------
		
		//replaceAll() - replace each character of the string
		
		String repAll = "Welcome to TestLeaf @2025";
		String replaceAll = repAll.replaceAll("[^0-9]", "A");
		System.out.println(replaceAll);
		
		//----------------------------------------------------------------------------
		
		//toUpperCase() - To convert the string to uppercase
		//toLowerCase() - To convert the string to lowercase
		
		String upCase = "maspldnr";
		String lowCase = "OSDHAOSE";
		
		System.out.println(upCase.toUpperCase());
		System.out.println(lowCase.toLowerCase());
		
		//----------------------------------------------------------------------------
		
		//parseInt() - Converts the String to integer
		
		String price = "120000";
		int int1 = Integer.parseInt(price);	
		System.out.println(int1);
	}

}
