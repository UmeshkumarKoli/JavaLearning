package umeshK;

import java.util.Scanner;

public class String_Assignment_Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string:");
		String input = scan.nextLine();
		String[] data = input.split(" ");

		for (int i = 0; i < data.length; i++) {
			/*try
			{
				if (Integer.parseInt(data[i]) >= 0 || Integer.parseInt(data[i]) < 0) {
					System.out.println("Numberic: " + Integer.parseInt(data[i]));
				}
				else System.out.println("String: " + Integer.parseInt(data[i])); 
			}
			catch(Exception e)
			{
				System.out.println(e.getStackTrace());
				System.out.println(e.getMessage());
			}*/
			if (data[i].matches("[a-zA-Z]+")){
				System.out.println("String: "+ data[i]);
			}
			if(data[i].matches("[0-9]+")){
				System.out.println("Number: "+ data[i]);
			}
		}
		scan.close();
	}
}