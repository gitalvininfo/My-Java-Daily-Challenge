package com.alvincodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int num, max;
        System.out.println("Enter 10 numbers: ");
        num = scan.nextInt();

        // first number is max
        max = num;

        for (int i = 1; i<10; i++) {
            num = scan.nextInt();
            max = largestNumber(max, num);
        }

        System.out.println("The largest number is " + max);
    }


    public static int largestNumber(int max, int num) {
        int largest;

        // 1st
        // 1 >= 1
        // 1 >= 2
        if(max >= num) {
            largest = max;
        }   else {
            largest = num;
        }

        return largest;
    }
}
