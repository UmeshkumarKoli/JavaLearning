package umeshK;

import java.util.Scanner;

public class String_Assignment_Ex5 {

	void checkArmStrongNumber(int temp, int input) {
		int sum = 0;
		while (temp > 0) {
			int reminder = temp % 10;
			temp = temp / 10;
			sum += reminder * reminder * reminder;
		}
		if (sum == input) {
			System.out.println("Input number is Armstrong number");
		} else {
			System.out.println("Input number is not Armstrong number");
		}
	}

	void findArmStrongNumber(int temp, int input) {
		int sum = 0;
		while (temp > 0) {
			int reminder = temp % 10;
			temp = temp / 10;
			sum += reminder * reminder * reminder;
		}
		if (sum == input) {
			System.out.print(input + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number to check is number Armstrong");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int temp = input;

		String_Assignment_Ex5 ex5 = new String_Assignment_Ex5();
		ex5.checkArmStrongNumber(temp, input);

		System.out.println("Enter number to find all Armstrong number in that range");
		int range = scan.nextInt();
		for (int i = 0; i <= range; i++) {
			temp = i;
			ex5.findArmStrongNumber(temp, i);
		}
		scan.close();
	}

}
