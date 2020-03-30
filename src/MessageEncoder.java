import java.util.Scanner;

public class MessageEncoder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input;
		String message = "";
		int    checksum = 0;
		int    i;
		
		System.out.print("What is your message? ");
		input = scanner.nextLine(); //gets input from console, stores it into "input" variable
		
		input = input.toUpperCase(); //converts input to all caps
		
		scanner.close();
		
		for (i = 0; i < input.length();
			 ++i) { //loop through each character in input string
			
			int tmpInt = input.charAt(i); //gets unicode value of character
			
			checksum += tmpInt; //add unicode value to checksum
			message  += (tmpInt - 64); //concatenates value to coded message
			
			if (i != (input.length() - 1)) { //omits dash at the end bc it bugs me
				message = message.concat("-"); //concatenates dashes to message
			}
		}
		
		//Outputs message and checksum
		System.out.println("\nYour encoded message is " + message);
		System.out.println("Message checksum is " + checksum);
		
	}

}
