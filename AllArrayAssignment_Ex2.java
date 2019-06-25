package umeshK;

import java.util.Scanner;

public class AllArrayAssignment_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter Max limit");
		int maxNumber=Integer.parseInt(scan.nextLine());
		System.out.println("Enter Numbers");
		String line= scan.nextLine();
		String [] data= line.split(" ");
		int[] numArray=new int[data.length];
		for (int start=0;start<data.length;start++){
			numArray[start]=Integer.parseInt(data[start]);
		}
		AllArrayAssignment_Ex2 ex1=new AllArrayAssignment_Ex2();
		ex1.findDuplicateNumber(numArray,maxNumber);

	}
	
	void findDuplicateNumber(int[]num, int maxNum){
		
		for (int i=0;i<maxNum;i++){
			boolean found=false;
			for(int j=i+1; j<num.length;j++){
				if (num[i] == num[j]){
					found=true;
					break;
				}
			}
			if(found== true){
				System.out.println("Duplicate number is: "+ num[i]);
			}
		}
		
	}

}
