package umeshK;

import java.util.Scanner;

public class AllArrayAssignment_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter number to check");
		int findNumber=Integer.parseInt(scan.nextLine());
		System.out.println("Enter array Numbers");
		String line= scan.nextLine();
		String [] data= line.split(" ");
		int[] numArray=new int[data.length];
		for (int start=0;start<data.length;start++){
			numArray[start]=Integer.parseInt(data[start]);
		}
		AllArrayAssignment_Ex3 ex1=new AllArrayAssignment_Ex3();
		ex1.findNumberInArray(numArray,findNumber);

	}
	
	void findNumberInArray(int[]num, int findNumber){
		
		boolean found=false;
		for(int j=0; j<num.length;j++){
			if (findNumber == num[j]){
				found=true;
				break;
			}
		}
		if(found== true){
			System.out.println("Number " + findNumber+ " found in array");
		}
		else System.out.println("Number " + findNumber+ " is not found in array");
		
	}

}
