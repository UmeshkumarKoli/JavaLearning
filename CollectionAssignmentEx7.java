package umeshK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class CollectionAssignmentEx7 {

	public static void main(String[] args) {
		/*Write java program which multiply number without using multiplication	*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two integer");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		scan.close();
		
		int sum=0;
		for(int i=1;i<=num1;i++){
			sum=sum+num2;
		}
		System.out.println(sum);
	}
}
