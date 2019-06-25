package umeshK;

import java.util.Scanner;

/*WAP to input student marks by condition : 
Marks is greater than 0 and less than 50--FAIILED 
Marks is greater than 50 and less than 75--1st Class 
Marks greater than 75 –and less than 100 Distinction*/ 
  

public class CoreJavaAssignment_Ex6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks of student and get grades");
		int marks=scan.nextInt();
		scan.close();
		if (marks>=0 && marks<=50){
			System.out.println("Failed");
		}
		else if(marks>50 && marks<=75){
			System.out.println("First Class");
		}
		else if(marks>75 && marks<=100){
			System.out.println("Distinction");
		}
	}
}
