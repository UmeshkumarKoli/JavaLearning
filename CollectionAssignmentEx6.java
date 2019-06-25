package umeshK;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CollectionAssignmentEx6 {

	public static void main(String[] args) {
		/*Given a string of letters (R, G, B) print “True” if all socks are in pairs otherwise print “False”.
		Example:
		1) Input: RGRBGB
		Output: True
		2) Input: RGRBRG
		Output: False*/
		HashMap<Character, Integer>hm=new HashMap<Character,Integer>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter String of letter in RGB format");
		String input=scan.nextLine();
		char[] inputCharArray=input.toCharArray();
		for(int i=0;i<inputCharArray.length;i++){
			if(hm.containsKey(inputCharArray[i])){
				int value=hm.get(inputCharArray[i]);
				hm.put(inputCharArray[i], value+1);
			}
			else{
				hm.put(inputCharArray[i], 1);
			}
		}
		Set<Character> keys=hm.keySet();
		boolean flag=false;
		for(Character ch: keys){
			if(hm.get(ch)%2==0){
				flag=true;
			}
			else{
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("Socks are in pairs");
		}
		else
			System.out.println("Socks are not in pairs");
	}
}
