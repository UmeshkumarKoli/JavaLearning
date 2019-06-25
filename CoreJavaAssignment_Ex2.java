package umeshK;

import java.util.Scanner;

//2. Find greater of two numbers using ternary operator. 

public class CoreJavaAssignment_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number 1:");
		double number1=scan.nextDouble();
		System.out.println("Enter number 2:");
		double number2=scan.nextDouble();
		scan.close();
		double maxvalue=(number1>number2)?number1:number2;
		System.out.println("Large number is :"+maxvalue);
	}

}
