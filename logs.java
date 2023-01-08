/*
* This program runs Rock Paper Scissors.
*
* @author  Huzaifa Khalid
* @version 1.0
* @since   2023-01-08
*/

import java.util.Scanner;

/**
* This is a Rock Paper Scissors game.
*/
final class RockPaperScissors {

    /**
    * Constant assigned to 1.
    */
    public static final int ROCK = 1;

    /**
    * Constant assigned to 2.
    */
    public static final int PAPER = 2;

    /**
    * Constant assigned to 3.
    */
    public static final int SCISSORS = 3;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // input
        System.out.println("Welcome to Rock Paper Scissors!");
        final Scanner gameObj = new Scanner(System.in);
        System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors: ");

        /*
        * Try-catch to ensure bad
        * input won't crash the program
        */
        try {
            final float userHand = gameObj.nextInt();

            // random module
            final int min = ROCK;
            final int max = SCISSORS;
            final int randomHand = (int) ((Math.random() * max) + min);

            // process
            if (userHand == randomHand) {
                System.out.println("\nYou tie!");
            } else if ((userHand == ROCK & randomHand == SCISSORS)
                    || (userHand == PAPER & randomHand == ROCK)
                    || (userHand == SCISSORS & randomHand == PAPER)) {
                System.out.println("\nYou win!");
            } else if ((userHand == ROCK & randomHand == PAPER)
                    || (userHand == PAPER & randomHand == SCISSORS)
                    || (userHand == SCISSORS & randomHand == ROCK)) {
                System.out.println("\nYou lose!");
            } else {
                System.out.println("\nInvalid Input, make sure it's from 1-3.");
            }

            // output
            if (randomHand == ROCK) {
                System.out.println("The opponent chose Rock.");
            } else if (randomHand == PAPER) {
                System.out.println("The opponent chose Paper.");
            } else if (randomHand == SCISSORS) {
                System.out.println("The opponent chose Scissors.");
            } else {
                System.out.println("The RNG messed up. Sorry.");
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nInvalid Input.");
        } finally {
            System.out.println("\nDone.");
        }
    }
}
