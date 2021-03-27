package com.alvincodes;

import java.util.Scanner;

public class Main {

    private static double interest, loan, interestRate, ratePerMonth;
    private static int monthlyPayment, numberOfMonths = 0;
    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        boolean isDone = false;

        initAgain();

        while(!isDone) {
            interest = loan * (ratePerMonth / 100);

            if(monthlyPayment < interest) {
                System.out.println("Monthly payment is too low. You cannot pay this shit.");
                initAgain();
            }

            loan = loan - (monthlyPayment - interest);
            numberOfMonths++;

            if(loan <= 0) {
                isDone = true;
            }
        }

        System.out.println("The number of months to fully paid is: " + numberOfMonths);

    }

    public static void initAgain() {
        System.out.println("Enter your loan amount: ");
        loan = scan.nextDouble();

        System.out.println("Enter your interest rate: ");
        interestRate = scan.nextDouble();

        System.out.println("Enter your monthly payment: ");
        monthlyPayment = scan.nextInt();

        ratePerMonth = interestRate / 12;
    }
}
