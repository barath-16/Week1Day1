package week3.day1;

public class RadioButton extends Button {  // creating a subclass RadioButton for the superclass Button
	
	// Assigning a new method for this subclass
	private void selectRadioButton() {
		
		System.out.println("Radio Button is selected");

	}

	public static void main(String[] args) { // Trying to access the methods from the Webelemet and button class
		
		RadioButton radio = new RadioButton();
		radio.click();
		radio.setText("Clicked");
		
		radio.submit();
		
		radio.selectRadioButton();
		
		

	}

}
