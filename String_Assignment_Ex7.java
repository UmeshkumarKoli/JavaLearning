package umeshK;

import java.util.Scanner;

public class String_Assignment_Ex7 {

	int findSumOfDigit(int number) {
		int sum = 0;
		while(number>0){
			int reminder=number%10;
			number=number/10;
			sum=sum+reminder;
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number:");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		String_Assignment_Ex7 ex7 = new String_Assignment_Ex7();
		int sum = ex7.findSumOfDigit(input);
		System.out
				.println("Sum of digit is: " + sum);
		scan.close();
	}

}
