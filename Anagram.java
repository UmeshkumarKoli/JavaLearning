package umesh;

import java.util.Scanner;

public class Anagram {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		boolean flag = true;
		if(a.length()!=b.length()) return false;
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		for (int start = 0; start < a.length(); start++) {
			int countA = 1;
			int countB = 1;
			for (int startOnString = start+1; startOnString < a.length(); startOnString++) {
				if (a.charAt(start) == a.charAt(startOnString)) {
					countA++;
				}
			}
			System.out.println("frequency of "+a.charAt(start)+ " :" + countA);
		}
		return flag;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
