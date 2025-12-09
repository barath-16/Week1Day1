package week2.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1";
		
		//Expected output: “We learn Java basics as part of sessions in week1”
		
		String[] split = text.split(" "); //split the text as array 
		
		for (int i = 0; i < split.length-1; i++) { //this is the first loop where the first word and next remains constant
			for (int j = i+1; j < split.length-1; j++) { // this is the second loop which starts from the word after the first loop to reduce the duplication for each and every word
				
//				System.out.println(split[i]+split[j]);
				if(split[i].equals(split[j])) { //condition where if split word i and j are equal
					
					String replace = text.replace(split[i], ""); // if the condition satisfies the word is replaced with a space
					System.out.println(replace); // printing the final output
					
				}
				
			}
			
		}

	}

}
