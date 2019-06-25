package umeshK;

import java.util.Scanner;

//3. Write a Java program that takes a year from user and print whether that year is a leap year or not 

public class CoreJavaAssignment_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Year to check whether it is leap year or not:");
		int year= scan.nextInt();
		scan.close();
		if(year%4==0)
			System.out.println(year+" is leap year");
		else
			System.out.println(year+" is not leap year");
	}

}
