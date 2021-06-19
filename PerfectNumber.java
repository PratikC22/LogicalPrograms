/**
 * Program to check if entered number is a perfect number or not.
 * 
 * @author Pratik Chaudhari.
 * @since 13/06/2021.
 */ 
package LogicalPrograms;
import java.util.Scanner;

public class PerfectNumber {
	int  num,i, sum = 0;
	void PerfectNum() {
		for (i=1; i<num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (num == sum) {
			System.out.println(+num+" is a perfect number.");
		}
		else System.out.println(+num+" is not a perfect number.");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the program to check if entered number is a perfect number."
				+ "\nPlease enter a number :");
		Scanner sc = new Scanner(System.in);
		PerfectNumber myObj = new PerfectNumber();
		myObj.num = sc.nextInt();
		sc.close();
		myObj.PerfectNum();
	}
}
