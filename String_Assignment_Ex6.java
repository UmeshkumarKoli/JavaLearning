package umeshK;

import java.util.Scanner;

public class String_Assignment_Ex6 {

	int findFactorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = i * fact;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number:");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		String_Assignment_Ex6 ex6 = new String_Assignment_Ex6();
		int factorial = ex6.findFactorial(input);
		System.out
				.println("Factorial of number " + input + " is: " + factorial);
		scan.close();
	}

}
