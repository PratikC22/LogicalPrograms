/**
 * This code transforms binary number to a decimal number.
 *
 * @author Pratik Chaudhari
 * @since 14/06/2021
 */

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String args[]) {
        int binnum, decnum = 0, i = 1, rem;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Binary Number : ");
        binnum = scan.nextInt();

        // converting the number into decimal format
        while (binnum != 0) {
            rem = binnum % 10;
            decnum = decnum + rem * i;
            i = i * 2;
            binnum = binnum / 10;
        }

        System.out.print("Equivalent Decimal Value of " + binnum + " is :\n");
        System.out.print(decnum);
    }
}