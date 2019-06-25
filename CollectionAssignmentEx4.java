package umeshK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class CollectionAssignmentEx4 {

	public static void main(String[] args) {
		/*Given an integer & string, shift all the letters in the string by 1 (except punctuation & spaces).
			Example :-
			Input :- 3 sky Is Blue!
			Output: tlz Jt Cmvf!
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number in a single line seperated by space");
		String str=scan.nextLine();
		scan.close();
		
		char[] input=str.toCharArray();
		String s="";
		for(int i=0;i<input.length;i++){
			if (Character.isDigit(input[i])){
				continue;
			}
			else if(Character.isAlphabetic(input[i])){
				int j=input[i]+1;
				char ch=(char) j;
				s=s+ch;
				
			}
			else if( Character.isSpaceChar(input[i])){
				s=s+input[i];
			}
			else {
				s=s+input[i];
			}
		}
		System.out.println(s);
	}
}
