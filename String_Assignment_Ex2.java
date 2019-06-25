package umeshK;

import java.util.Scanner;

public class String_Assignment_Ex2 {

	String reverString(String Str) {
		String temp = "";
		for (int i = Str.length() - 1; i >= 0; i--) {
			temp = temp + Str.charAt(i);
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Assignment_Ex2 ex2 = new String_Assignment_Ex2();
		String reverse = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter String to reverse");
		String inputString = scan.nextLine();
		String[] str = inputString.split(" ");
		for (int start = str.length - 1; start >= 0; start--) {
			reverse += ex2.reverString(str[start]) + " ";
		}

		System.out.println(reverse);
		scan.close();
	}

}
