package com.alvincodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // every 6 months pay the 10% of the remaining loan;
        // 10000 loan = 10000 * 10% (this is the remaining loan);
        // store it then loop for 6 times (whatever the value of first multiply it again to 10% and so on)

        System.out.println("Enter the loan: ");
        Scanner scan = new Scanner(System.in);

        int loan = scan.nextInt();
        int remainingLoan = loan;

        for (int i=0; i<6;i++) {
            remainingLoan -= (remainingLoan * .10);
            // remainingLoan = remainingLoan - (int) (remainingLoan * .10);
        }

        System.out.println("The remaining loan after 6 months is " + remainingLoan);








//        int count = 0;
//
//        while (count++ < 2) {
//            System.out.println(count);
//        }
    }
}
