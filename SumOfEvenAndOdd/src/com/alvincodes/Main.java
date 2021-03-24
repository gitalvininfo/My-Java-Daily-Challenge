package com.alvincodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter how many numbers: ");
        Scanner scan = new Scanner(System.in);

        int counter = scan.nextInt();

        System.out.println("Enter the numbers: ");

        int num;
        int odd = 0;
        int even = 0;
        int sum = 0;
        int zero = 0;

        for (int i = 0; i<counter; i++) {
            num = scan.nextInt();

            if(num % 2 == 0) {
                even++;

                if(num == 0) {
                    zero++;
                }
            }
            else {
                odd++;
            }
            sum += num;
        }

        System.out.println("Odd: " + odd + " Even: " + even + " Zero: " + zero + " Sum: " + sum);

    }
}
