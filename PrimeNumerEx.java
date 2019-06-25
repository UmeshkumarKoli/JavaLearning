package Java_practice;

public class PrimeNumerEx {
	
	public static void main(String[] args) {
		PrimeNumerEx java1= new PrimeNumerEx();
		/*
		java1.sum(30, 50);
		java1.student("Umesh", 3034, 98);
		java1.square(30.5f);
		java1.cube(2);
		java1.perimeterRectantgle(30,20);
		java1.perimeterSquare(4);
		java1.simpleInterest(15000, 8.5f, 2);
		java1.convertTemperature(102.5f);
		java1.convertSecondToHourAndMin(3600);
		float inputNumber1= 10.05f;
		float inputNumber2= 31.98f;
		System.out.println("Before swapping Input number1 is: "+inputNumber1 +" and input number2 is: "+inputNumber2);
		java1.swapNumbersWithVar(inputNumber1, inputNumber2);
		java1.swapNumbersWithoutVar(inputNumber1, inputNumber2);*/
		java1.sumOfPrimeNumber(10);
	}
	
	void sum(int input1, int input2){
		int addition= input1+input2;
		System.out.println("Sum of inputs: " + addition);
	}
	
	void student(String studentName, int rollNo, float marks){
		System.out.println("Name of the student is: " + studentName + "\n"+ "Roll number: "+ rollNo + "\n"+ "Marks: "+ marks);
	}
	
	void square(float value){
		float sqr= value*value;
		System.out.println("Square of "+ value + " is: "+ sqr);
	}
	
	void cube(float value){
		float cubeValue= value*value*value;
		System.out.println("Cube of "+ value + " is: "+ cubeValue);
	}
	
	void perimeterRectantgle(float length, float height){
		float perimeter= (2*length)+(2*height);
		System.out.println("Perimeter of rectangle is: "+perimeter);
	}
	void perimeterSquare(float side){
		float perimeter= (4*side);
		System.out.println("Perimeter of Square is: "+perimeter);
	}
	
	void simpleInterest(float principle, float rate, float time){
		float interest= (principle*time*rate)/100;
		System.out.println("Simple interest is: " + interest);
	}
	
	void convertTemperature(float fahrenheitTemperature){
		float celcius= (fahrenheitTemperature-32)*5/9;
		System.out.println("Fahrenheit " + fahrenheitTemperature+ " to Celsius is :"+celcius);
	}
	
	void convertSecondToHourAndMin(float seconds){
		float min= seconds/60;
		float hour= seconds/3600;
		System.out.println("Conversion of second "+ seconds +" to minute is: "+min);
		System.out.println("Conversion of second "+ seconds +" to hour is: "+hour);
	}
	
	void swapNumbersWithVar(float number1, float number2){
		float temp= number1;
		number1= number2;
		number2= temp;
		System.out.println("After swapping inputNumber1 is: "+number1 +" and inputNumber2 is: "+number2);
	}
	
	void swapNumbersWithoutVar(float number1, float number2){
		number1= number1+number2;
		number2= number1-number2;
		number1= number1-number2;
		System.out.println("After swapping inputNumber1 is: "+number1 +" and inputNumber2 is: "+number2);
	}
	
	void sumOfPrimeNumber(int number){
		int sum=0;
		for(int j=0; j<=number; j++){
			int count=0;
			for (int i=2; i<= j/2; i++){
				if(j %i==0){
					count++;
					break;
				}
			}
			if (count==0 && j!=1){
				System.out.println("Prime number is: "+j);
				sum=sum+j;	
			}
		}
		System.out.println(sum);
		
	}
}
