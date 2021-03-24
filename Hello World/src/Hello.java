import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        System.out.println("Welcome to Wonderland!");
        System.out.println("Shall we begin?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        Scanner scan = new Scanner(System.in);
        int beginAnswer = scan.nextInt();

        while (beginAnswer != 1) {
            System.out.println("Shall we begin?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");
            beginAnswer = scan.nextInt();

        }

        Random random = new Random();
        int x = random.nextInt(20) + 1;

        System.out.println("Please guess a fucking number! Idiot!");
        int userInput = scan.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        // while noty finish increment times tried idiot!
        while(!shouldFinish) {
            timesTried++;

            // keep trying idiot!
            if(timesTried < 5) {
                if(userInput == x) {
                    hasWon = true;
                    shouldFinish = true;
                }   else if (userInput > x) {
                    System.out.println("Guess lower idiot!");
                    userInput = scan.nextInt();
                }   else {
                    System.out.println("Guess higher idiot!");
                    userInput = scan.nextInt();
                }
            }

            // time to cry idiot! game over idiot!
            else {
                shouldFinish = true;
            }
        }


        if(hasWon) {
            System.out.println("Fuck you idiot and congratulations!, you have " + timesTried + " guesses idiot and the x is " + x + "what a fucking idiot");
        }   else {
            System.out.println("Game over idiot!" + x + " is the fucking number peasant! what a fucking idiot");
        }



    }
}
