package umeshK;

import java.util.Scanner;

public class AllArrayAssignment_Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter array1 Numbers");
		String line1 = scan.nextLine();
		System.out.println("Enter array2 Numbers");
		String line2 = scan.nextLine();

		String[] data1 = line1.split(" ");
		String[] data2 = line2.split(" ");
		if (data1.length != data2.length) {
			System.out.println("Two arrays are not equal");
		} else {
			int[] numArray1 = new int[data1.length];
			int[] numArray2 = new int[data2.length];
			for (int start = 0; start < data1.length; start++) {
				numArray1[start] = Integer.parseInt(data1[start]);
				numArray2[start] = Integer.parseInt(data2[start]);
			}
			AllArrayAssignment_Ex6 ex1 = new AllArrayAssignment_Ex6();
			ex1.checkEqualityOfTwoArrays(numArray1, numArray2);
		}

	}

	void checkEqualityOfTwoArrays(int[] num1, int[] num2) {
		boolean equal = true;
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] != num2[i]) {
				equal = false;
				break;
			}
		}
		if (equal == true) {
			System.out.println("Two arrays are equal");
		} else
			System.out.println("Two arrays are not equal");

	}

}
