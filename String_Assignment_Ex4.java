package umeshK;

import java.util.Scanner;

public class String_Assignment_Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number to reverse");
		Scanner scan= new Scanner(System.in);
		int input= scan.nextInt();
		while(input>0){
			int reminder= input%10;
			input=input/10;
			System.out.print(reminder);
		}
	}

}
