package umeshK;

import java.util.Scanner;

public class AllArrayAssignment_Ex1 {

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
		AllArrayAssignment_Ex1 ex1=new AllArrayAssignment_Ex1();
		ex1.findMissingNumber(numArray,maxNumber);

	}
	
	void findMissingNumber(int[]num, int maxNum){
		
		for (int i=1;i<=maxNum;i++){
			boolean found=false;
			for(int j=0; j<num.length;j++){
				if (i == num[j]){
					found=true;
					break;
				}
			}
			if(found== false){
				System.out.println("missing number: "+ i);
			}
		}
		
	}

}
