package com.alvincodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scan.nextInt();

        String converted = Integer.toString(num);


        System.out.println(converted);


    }
}
