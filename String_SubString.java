package umeshK;

import java.util.Scanner;

public class String_SubString {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("print string");
        String S = in.next();
        
        String []arr=new String[S.length()-2];
        for(int i=0;i<S.length()-2;i++){
        	
        	arr[i]=S.substring(i,i+3);
        	//System.out.println(S.substring(i,i+3));
        }
        /*for (int i=0; i<arr.length;i++){
        	if(arr[i].compareTo(arr[1])){
        		System.out.println();
        	}
        }*/
       
       if ("wel".compareTo("ava")>0){
        	System.out.println("B");
        }
        else {
			System.out.println("C");
		}
    }

}
