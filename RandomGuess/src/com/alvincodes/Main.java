package com.alvincodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int guessed;

        int randomNum = (int) (Math.random() * 20);

        int numberOfTries = 0;

        boolean isDone = false;

        // scanner is inside while loop because i want to get the input of user every mistake;
        // if i put it outside, the program will get the user input only once


        while(!isDone && numberOfTries < 5) {
            System.out.println("Guess the number between 0 and 100 with 5 tries only: ");
            Scanner scan = new Scanner(System.in);
            guessed = scan.nextInt();

            numberOfTries++;
            if(guessed == randomNum) {
                System.out.println("You guessed the number \n" +
                        "The number was: " + randomNum + "\n"
                + "You have " + numberOfTries + "attempt to guess");
                isDone = true;
            }
            else if (guessed < randomNum) {
                System.out.println("Guess higher");
            }
            else if(guessed > randomNum) {
                System.out.println("Guess lower");
            }

        }

        if(!isDone) {
            System.out.println("You idiot you did not guess the random number. The random number was " + randomNum);
        }
    }
}
