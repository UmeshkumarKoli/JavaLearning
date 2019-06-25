package umeshK;

import java.util.Scanner;

//1. Find the largest of three numbers using Logical And operator. 
public class CoreJavaAssignment_Ex1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number 1:");
		double number1=scan.nextDouble();
		System.out.println("Enter number 2:");
		double number2=scan.nextDouble();
		System.out.println("Enter number 3:");
		double number3=scan.nextDouble();
		scan.close();
		if (number1>number2 && number1>number3 ){
			System.out.println("Number "+number1+"is largest number");
		}
		else if (number2>number1 && number2>number3 ){
			System.out.println("Number "+number2+"is largest number");
		}
		else if(number3>number2 && number3>number1 ){
			System.out.println("Number "+number1+"is largest number");
		}
	}
}
