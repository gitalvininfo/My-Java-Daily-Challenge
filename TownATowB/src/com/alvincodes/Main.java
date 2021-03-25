package com.alvincodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int townAPopulation, townBPopulation;
        int years = 0;
        int townAGrowth, townBGrowth;


        System.out.println("Enter the current population of town A: ");
        townAPopulation = scan.nextInt();

        System.out.println("Enter the current population of town B: ");
        townBPopulation = scan.nextInt();

        System.out.println("Enter the growth rate for town A: ");
        townAGrowth = scan.nextInt();

        System.out.println("Enter the growth rate for town B: ");
        townBGrowth = scan.nextInt();

        boolean isDone = false;

        do {

            townAPopulation += (int) (townAPopulation * ((double) townAGrowth / (double) 100));
            townBPopulation += (int) (townBPopulation * ((double) townBGrowth / (double) 100));
            years++;

            if(townAPopulation >= townBPopulation) {
                isDone = true;
            }

        } while (!isDone);

        System.out.println("After " + years + " years the population of town A will be greater than or equal to the population of town B.");
        System.out.println("After " + years + " years the population of town A is " + townAPopulation);
        System.out.println("After " + years + " years the population of town B is " + townBPopulation);




    }
}
