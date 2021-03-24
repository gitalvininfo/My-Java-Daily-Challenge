package com.alvincodes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int i, j, sum, num;

        Scanner infile = new Scanner(new FileReader("Text.txt"));

        // this is the rows, just loop through rows, then initialize sum to 0;
        for (i = 1; i<=3; i++) {
            sum = 0;
            // this is the columns
            for (j = 1; j<=4; j++) {
                num = infile.nextInt();
                System.out.print(num + " ");
                sum += num;
            }
            System.out.println("sum = " + sum);
        }
    }
}
