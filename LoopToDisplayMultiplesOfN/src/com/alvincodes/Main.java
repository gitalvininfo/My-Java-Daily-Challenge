package com.alvincodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int res = 0;
        System.out.println("Enter the number: ");
        int num = scan.nextInt();


        for (int i = 1; i<=10; i++) {
            res = num * i;
            System.out.println(num + " x " + i + " = " + res);
        }



    }
}
