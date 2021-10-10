package arrays;

import java.util.*;

public class Arrays2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		// String input
		String userString = scan.next();

		// mysteryString array
		String mysteryString = "Display the number of times a user entered mysteryString is found in the given mysteryString array";
		String[] mysteryStringArr = mysteryString.split(" ");
		int counter = 0;
		//
		for (int i = 0; i < mysteryStringArr.length; i++) {
			if (mysteryStringArr[i].equalsIgnoreCase(userString)) {
				counter++;
			}
		}
		System.out.println(counter);
		if (counter == 0) {
			System.out.println('"' + userString + '"' + " was NOT found in '" + mysteryString + "'. ");
		} else {
			System.out.println('"' + userString + '"' + " was found in '" + mysteryString + "' " + counter + " times.");
		}
		scan.close();
	}

}
