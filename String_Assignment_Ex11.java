package umeshK;

import java.util.Scanner;

public class String_Assignment_Ex11 {

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
		String input = scan.next();
		
		String_Assignment_Ex11 ex11 = new String_Assignment_Ex11();
		String outputStr=ex11.reverseString(input);
		if (outputStr.equals(input)){
			System.out.println("Output String: "+ outputStr +" is pallidrome");
		}
		else System.out.println("Output String: "+ outputStr +" is not pallidrome");
		scan.close();
	}
}
