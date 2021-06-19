package LogicalPrograms;
import java.util.Scanner;

public class ReverseNum {
	int num; int rem = 0; int rev = 0;
	void ReverseNumber() {
		while (num !=0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to the program to reverse the number.\nPlease enter the number.");
		Scanner sc = new Scanner(System.in);
		ReverseNum myObj = new ReverseNum();
		myObj.num = sc.nextInt();
		sc.close();
		myObj.ReverseNumber();
		
	}
}
