package umeshK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionAssignmentEx5 {

	public static void main(String[] args) {
		/*Given an integer n followed by n space separated integers, sort the number at even index in ascending order & numbers at odd index in descending order. Print the output on two separate lines.
			Example :-
			Input:
			12 100 5 10 34 17 84
			Output:
			Ascending :- 5 12 34 84
			Descending :- 100 17 10
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number in a single line seperated by space");
		String str=scan.nextLine();
		scan.close();
		String[] input=str.split(" ");
		ArrayList<Integer>al_even=new ArrayList<Integer>();
		ArrayList<Integer>al_odd=new ArrayList<Integer>();
		for(int i=0;i<input.length;i++){
			if(i%2==0){
				al_even.add(Integer.parseInt(input[i]));
			}
			else
				al_odd.add(Integer.parseInt(input[i]));
		}
		
		Collections.sort(al_even);
		Collections.reverseOrder();
		Collections.sort(al_odd, Collections.reverseOrder());
		
		System.out.println(al_even);
		System.out.println(al_odd);
	}
}
