package com.alvincodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        String str;

        System.out.println("Enter the string: ");
        str = scan.nextLine();

        boolean isPalindrome = isPalindrome(str);

        if(isPalindrome) {
            System.out.println("The word " + str + " is a palindrome");
        }   else{
            System.out.println("The word " + str + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {

        int len = str.length();
        int i, j;

        j = len - 1; // set the j to last position of string


        // set i to the first position of the string
        // <= (len - 1) / 2 because you slice the string half for i half for j
        for (i = 0; i <= (len - 1) / 2; i++) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            // j-- because every loop the last position if string must step backward
            // i++ string must step forward
            // i compare to j
            j--;
        }
        // if all string characters pass all condition
        return true;
    }
}
