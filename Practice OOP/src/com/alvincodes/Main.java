package com.alvincodes;

import java.util.Scanner;

public class Main {

    protected static final int Grade = 11;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = 5;
        int b = 2 + (a++);
        String name = "Alvin";

        System.out.println("A: " + a + "\n" +
                "B: " + b +  "\n" +
                "Grade: " + Grade);


        System.out.println("The new escape sequence is \\n");
    }
}
