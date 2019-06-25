package umeshK;

import java.util.Scanner;

public class String_Assignment_Ex9 {

	String reverseString(String str) {
		String outputStr = "";
		for (int start = str.length() - 1; start >= 0; start--) {
			outputStr += str.charAt(start);
		}
		return outputStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string:");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] str = input.split(" ");
		String_Assignment_Ex9 ex9 = new String_Assignment_Ex9();
		String outputString = "";
		for (int i = 0; i < str.length; i++) {
			outputString += ex9.reverseString(str[i])+" ";
		}
		System.out.println("Reversed String : " + outputString);
		scan.close();
	}
}
