package umeshK;

import java.util.Scanner;

//. Write a Java Program and create Calculator using switch statement 

public class CoreJavaAssignment_Ex4 {

	double add(double x, double y){
		return x+y;
	}
	
	double sub(double x, double y){
		return x-y;
	}
	
	double multi(double x, double y){
		return x*y;
	}
	
	double divide(double x, double y){
		return x/y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Print number 1");
		double number1=scan.nextDouble();
		System.out.println("Print number 2");
		double number2=scan.nextDouble();
		CoreJavaAssignment_Ex4 ex4=new CoreJavaAssignment_Ex4();
		System.out.println("Please enter operation to perform e.g add(+), sub(-), mult(*), div(/)");
		String operation=scan.next();
		scan.close();
		switch(operation){
			case "+" : 
				System.out.println(ex4.add(number1, number2));
				break;
			case "-": 
				 System.out.println(ex4.sub(number1, number2));
				 break;
			case "/": 
				 System.out.println(ex4.divide(number1, number2));
				 break;
			case "*": 
				 System.out.println(ex4.multi(number1, number2));
				 break;
			default:
				System.out.println("Please choose option again");
			
		}
	}

}
