package LogicalPrograms;
import java.util.Scanner;

public class PrimeNumber {
	int num, i, temp = 0;
	void CheckPrime() {
		for (i = 2; i<num; i++) {
			if (num % i == 0) {
				temp = temp + 1;
			}
		}
			if (temp > 0) {
				System.out.println("Number is not a prime number.");
			}
			else {
				System.out.println("Number is a prime number.");
			}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the program to check if number is prime or not.\nPlease enter a number.");
		PrimeNumber myObj = new PrimeNumber();
		Scanner sc = new Scanner(System.in);
		myObj.num = sc.nextInt();
		sc.close();
		myObj.CheckPrime();
		
	}
}
