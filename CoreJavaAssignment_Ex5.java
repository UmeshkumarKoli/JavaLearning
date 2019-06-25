package umeshK;

import java.util.Scanner;

//5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. (use switch case)  

public class CoreJavaAssignment_Ex5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number from 1 to 7 to find weekdays");
		int weekday=scan.nextInt();
		scan.close();
		switch(weekday){
			case 1 : 
				System.out.println("Sunday");
				break;
			case 2 : 
				System.out.println("Monday");
				break;
			case 3 : 
				System.out.println("Tuesday");
				break;
			case 4 : 
				System.out.println("Wednesday");
				break;
			case 5 : 
				System.out.println("Thrusday");
				break;
			case 6 : 
				System.out.println("Friday");
				break;
			case 7 : 
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Please enter valid input");
			
		}
	}

}
