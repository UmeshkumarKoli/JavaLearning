package umesh;

import java.math.BigInteger;
import java.util.ArrayList;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="He llo";
		String temp="";
		String[] strArray;
		ArrayList<String> sList = new ArrayList<String>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				temp+=str.charAt(i);
			}
			else{
				sList.add(temp);
				temp="";
			}
		}
		sList.add(temp);
		System.out.println(sList.size());
		System.out.println(sList.get(1));
	}
}
