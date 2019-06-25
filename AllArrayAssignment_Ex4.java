package umeshK;

import java.util.Scanner;

public class AllArrayAssignment_Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter array Numbers");
		String line= scan.nextLine();
		String [] data= line.split(" ");
		int[] numArray=new int[data.length];
		for (int start=0;start<data.length;start++){
			numArray[start]=Integer.parseInt(data[start]);
		}
		AllArrayAssignment_Ex4 ex1=new AllArrayAssignment_Ex4();
		ex1.findLargestNumberInArray(numArray);

	}
	
	void findLargestNumberInArray(int[]num){
		int smallNumber=num[0];
		int largeNumber=num[0];
		for (int i=0;i<num.length;i++){
			if (smallNumber > num[i]){
				smallNumber=num[i];
			}
			if (largeNumber < num[i]){
				largeNumber=num[i];
			}
		}
		System.out.println("Largest number is: " +largeNumber);
		System.out.println("Smallest number is: " +smallNumber);
		
	}

}
