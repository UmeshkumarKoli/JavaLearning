package umeshK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class CollectionAssignmentEx3 {

	public static void main(String[] args) {
		/*Given two strings, print the first string without the characters that are present in second string.
			Example :-
			Input: skyIsblue eyes
			Output: kIblu
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two string. print the first string without the characters that are present in second string.");
		String str=scan.nextLine();
		//String str="skyIsblue eyes";
		scan.close();
		String[] data=str.split(" ");
		
		char[] inputStr1=data[0].toCharArray();
		String s="";
		for(int i=0;i<inputStr1.length;i++){
			if (data[1].indexOf(inputStr1[i])==-1){
				s=s+inputStr1[i];
			}
			
		}
		System.out.println(s);
	}
}
