package umeshK;

import java.util.Scanner;

public class String_Assignment_Ex8 {

	String seperateCharAndInt(String input) {
		String outputStr = "";
		String outputInt = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '0' || input.charAt(i) == '1'
					|| input.charAt(i) == '2' || input.charAt(i) == '3'
					|| input.charAt(i) == '4' || input.charAt(i) == '5'
					|| input.charAt(i) == '6' || input.charAt(i) == '7'
					|| input.charAt(i) == '8' || input.charAt(i) == '9') {
				outputInt = outputInt + input.charAt(i);
			} else
				outputStr = outputStr + input.charAt(i);
		}

		return outputStr + outputInt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string with char and int:");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		String_Assignment_Ex8 ex8 = new String_Assignment_Ex8();
		String outputString = ex8.seperateCharAndInt(input);
		System.out.println("Output String after sorting char and integer: "
				+ outputString);
		scan.close();
	}

}
