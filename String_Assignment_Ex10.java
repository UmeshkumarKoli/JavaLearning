package umeshK;

import java.util.Scanner;

public class String_Assignment_Ex10 {

	int countOfChar(String str,char ch) {
		int count=0;
		for (int start=0; start <str.length(); start++) {
			if(str.charAt(start)==ch){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string:");
		String input = scan.nextLine();
		
		System.out.println("Enter charachter to check in string:");
		char ch=scan.next().charAt(0);
		
		
		String_Assignment_Ex10 ex10 = new String_Assignment_Ex10();
		int count=ex10.countOfChar(input, ch);
		System.out.println("Count of char: "+ch+ " in string = "+count);
		scan.close();
	}
}