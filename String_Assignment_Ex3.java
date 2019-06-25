package umeshK;

import java.util.Scanner;

public class String_Assignment_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 0;
		int num2=1;
		System.out.println("Enter Number to print fibonacci series");
		Scanner scan= new Scanner(System.in);
		int input= scan.nextInt();
		int sum= 0;
		System.out.print(num1+" "+ num2+" ");
		for(int start=0;start<=input-2;start++){
			num1=num2;
			num2=sum;
			sum= num1+num2;
			System.out.print(sum+ " ");
		}
	}

}
