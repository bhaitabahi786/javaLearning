
import java.util.Scanner;

public class Calculator {

	public static int addNum(int a, int b) {
		return a+b;
	}
	
	public static int subNum(int a, int b) {
		return a-b;
	}
	
	public static int mulNum(int a,int b) {
		return a*b;
	}
	
	public static int divideNum(int a, int b) {
		return a/b;
	}
	
	public static int remainderNum(int a, int b) {
		return a%b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 2 numbers below to perform Maths operations.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int first = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int second = sc.nextInt();
		
		Calculator cal = new Calculator();
		int add = cal.addNum(first, second);
		System.out.println("Addition: "+add); 
		System.out.println("Subtraction: "+cal.subNum(first, second)); 
		System.out.println("Multiplication: "+cal.mulNum(first, second));
		System.out.println("Division: "+cal.divideNum(first, second));
		System.out.println("Remainder: "+cal.remainderNum(first, second));
		
	}

}
