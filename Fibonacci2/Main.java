package com.alvincodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);
        int current = 0;
        int counter = 0;

        System.out.println("Enter the first numbers for fibonacci: ");
        int previous1 = scan.nextInt();

        while (previous1 < 0) {
            System.out.println("Num 1 must be positive: ");
            previous1 = scan.nextInt();
        }


        System.out.println("Enter the second number for fibonacci: ");
        int previous2 = scan.nextInt();

        while (previous2 < 0) {
            System.out.println("Num 2 must be positive: ");
            previous2 = scan.nextInt();
        }

        while((previous2 < previous1 || previous2 == previous1)) {
            System.out.println("Num 2 must be greater than Num 1: ");
            previous2 = scan.nextInt();
        }

        System.out.println("Enter the nth position you desired: ");
        int desiredPosition = scan.nextInt();

        // if user enter 1 as desired position to find, then return first number
        if(desiredPosition == 1) {
            current = previous1;
        }

        // if user enter 2 as desired position to find, then return first number
        else if(desiredPosition == 2) {
            current = previous2;
        }
        else {
            counter = 3;

            while(counter <= desiredPosition) {
                current = previous2 + previous1;
                previous1 = previous2;
                previous2 = current;

                counter++;
            }
        }

        System.out.println("The number was " + current);

    }
}
