package umeshK;

import java.util.Scanner;

public class AllArrayAssignment_Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter sum number:");
		String line1=scan.nextLine();
		int sum = Integer.parseInt(line1);
		System.out.println("Enter array Numbers");
		String line = scan.nextLine();

		String[] data = line.split(" ");
		
		int[] numArray = new int[data.length];
		
		for (int start = 0; start < data.length; start++) {
			numArray[start] = Integer.parseInt(data[start]);
		}
		AllArrayAssignment_Ex7 ex1 = new AllArrayAssignment_Ex7();
		ex1.checkSum(numArray, sum);
	}

	void checkSum(int[] numA, int sum) {
		boolean equal = true;
		for (int i = 0; i < numA.length; i++) {
			for (int j = i+1; j < numA.length; j++){	
				if ((numA[i]+numA[j])==sum) {
					System.out.println("Integer numbers, whose sum is equal to " + sum+ " are (" +numA[i]+ " , "+ numA[j]+")");
				}
			}
		}
			

	}

}
