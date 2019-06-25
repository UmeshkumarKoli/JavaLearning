package umeshK;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*WAP to input student marks by condition : 
Marks is greater than 0 and less than 50--FAIILED 
Marks is greater than 50 and less than 75--1st Class 
Marks greater than 75 –and less than 100 Distinction*/ 
  

public class CoreJavaAssignment_Ex8 {
	public static void main(String[] args) {
		// find pair for numbers
		/*int[] array={10, 20, 20, 10, 10, 30, 50, 10, 20};
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for (int i=0;i<array.length;i++){
			
			if (hm.get(array[i])==null){
				hm.put(array[i], 1);
			}
			else{
				int count=hm.get(array[i]);
				hm.put(array[i],count+1);
			}
		}
		Set<Integer>keys=hm.keySet();
		int count=0;
		for(Integer a: keys){
			System.out.println("Keys: "+a+" Respective value = "+hm.get(a));
			count=count+(hm.get(a)/2);
		}
		System.out.println(count);*/
		
		//find shortest/min iteration required to reach end
		int[] array={0, 0, 0, 1, 0, 0};
		int count=0;
		for(int i=0;i<array.length;){
			try{
				if(array[i+2]==0){
					i=i+2;
					count++;
				}
				else if(array[i+1]==0){
					i++;
					count++;
				}
			}
			catch(ArrayIndexOutOfBoundsException ae){
				count++;
				break;
			}
		}
		System.out.println(count);
	}
}
