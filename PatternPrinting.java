package Java_practice;

public class PatternPrinting {

	public static void main(String[] args) {
		PatternPrinting pattern = new PatternPrinting();
		pattern.pattern5();
	}

	public void pattern1() {
		/* print pattern
			 *
			 # # 
			 * * *
			 # # # #
		*/
		for (int row = 1; row <= 4; row++) {
			for (int colomn = 1; colomn <= row; colomn++) {
				if (row % 2 != 0) {
					System.out.print("* ");
				} else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
	
	public void pattern2(){
		/* print pattern
			 # * # *
			 * # * #
			 # * # *
			 * # * #
		 */
		for (int row = 1; row <= 4; row++){
			for(int colomn = 1; colomn <= 4; colomn++){
				if (colomn%2 !=0 && row%2 !=0){
					System.out.print("# ");
				}
				else if (colomn%2 ==0 && row%2 !=0){
					System.out.print("* ");
				}
				else if (colomn%2 !=0 && row%2 ==0){
					System.out.print("* ");
				}
				else if (colomn%2 ==0 && row%2 ==0){
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
	
	public void pattern3(){
		/* print pattern
			 4 3 2 1
			 4 3 2
			 4 3 
			 4
		 */
		for (int row = 1; row <= 4 ; row++){
			for(int colomn = 4; colomn >=row ; colomn--){
				System.out.print(colomn+ " ");
			}
			System.out.println();
		}
	}
	
	public void pattern4(){
		/* print pattern
			 1 * 3 *
			 * 2 * 4
			 1 * 3 *
			 * 2 * 4 
		 */
		for (int row = 1; row <= 4 ; row++){
			for(int colomn = 1; colomn <=4 ; colomn++){
				if (colomn%2 !=0 && row%2 !=0){
					System.out.print(colomn + " ");
				}
				else if (colomn%2 ==0 && row%2 !=0){
					System.out.print("* ");
				}
				else if (colomn%2 !=0 && row%2 ==0){
					System.out.print("* ");
				}
				else if (colomn%2 ==0 && row%2 ==0){
					System.out.print(colomn +" ");
				}
			}
			System.out.println();
		}
	}
	
	public void pattern5(){
		/* print pattern
			 1
			 1 2
			 1 2 3
			 1 2
			 1
		 */
		int number=3;
		for (int row = 1; row <= 5 ; row++){
			if (row <=3){
				for(int colomn = 1; colomn <=row ;colomn++){
					System.out.print(colomn +" ");
				}
				System.out.println();
			}
			else{
				for(int colomn = 1; colomn <= number ;colomn++){
					System.out.print(colomn +" ");
					number--;
				}
				System.out.println();
			}
		}
	}
	
	public void pattern6(){
		/* print pattern
			 3 6 9
			 12 15 18
			 21 24 27
		 */
		for (int row = 1; row <= 9 ; row++){
				System.out.print((3*row) +" " );
			if (row%3 == 0){
				System.out.println();
			}
			
		}
	}
}
