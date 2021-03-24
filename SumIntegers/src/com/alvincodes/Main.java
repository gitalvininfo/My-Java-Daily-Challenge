package com.alvincodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(157 / 10);
        System.out.println("Enter the integer: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int real = Math.abs(num);

        int sum = 0;

        while (real > 0) {
            sum = sum + real % 10; // extract last digit then add it to sum
            real = real / 10; // remove the last digit
            System.out.println(" " + real);
        }

        System.out.println(sum);


    }
}
