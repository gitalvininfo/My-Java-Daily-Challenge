package com.alvincodes;

public class Main {

    public static void main(String[] args) {

        String input = "Alvin";

        char[] a = input.toCharArray();

        System.out.println(a.length - 1);

        // position is minus 1 because 0 starts (Alvin ->>> nivlA) start at 'n' in Alvin
        for (int i = a.length - 1; i>=0; i--) {
            System.out.print(a[i]);
        }
    }
}
