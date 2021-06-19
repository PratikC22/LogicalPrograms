/**
 * Program to print fibonacci series.
 * 
 * @author Pratik Chaudhari.
 * @since 13/06/2021.
 */ 
package LogicalPrograms;
import java.util.Scanner;

public class Fibonacci {
	int num, i, num1 = 0, num2 = 1, num3;
	void Series() {
		System.out.print(+num1+" "+num2+" ");
		for (i=2; i<num; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(+num3+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the program to generate Fibonacci series.\nPlease enter a number : ");
		Scanner sc = new Scanner(System.in);
		Fibonacci myObj = new Fibonacci();
		myObj.num = sc.nextInt();
		sc.close();
		myObj.Series();
	}
}
