package com.alvincodes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new FileReader("hello.txt"));

        int i = 0;
        while (file.hasNext()) {
            i++;
            System.out.println(i + " " + file.nextLine());
        }



    }
}
