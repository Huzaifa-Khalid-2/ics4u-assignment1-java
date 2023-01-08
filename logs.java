/*
*  This program is based on the Rock-Paper-Scissors game
 *     with a computer opponent.
*
* @author  Huzaifa Khalid
* @version 1.0
* @since   2023-01-08
*/

import java.util.Scanner;

/**
 * This function determines the winner between the user and computer.
*/
final class RockPaperScissors {

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
    public static void main(String[] args) {

        final int max = 3;
        final int min = 1;
        final int randomNumber = (int) (Math.random() * max + min);
        final String rock = "rock";
        final String paper = "paper";
        final String scissors = "scissors";
        final String computerDecision = "\nThe computer chose ";
        final String computer;

        // input
        final Scanner userInput = new Scanner(System.in);
        System.out.println("Enter rock, paper, or scissors: ");
        final String player = userInput.nextLine();
        // process & output
        if (randomNumber == 1) {
            computer = rock;
        } else if (randomNumber == 2) {
            computer = paper;
        } else {
            computer = scissors;
        }

        if (player.equals(computer)) {
            System.out.println(computerDecision + computer);
            System.out.println("\nTie.");
        } else if (player.equals(rock) && computer.equals(paper)
            || player.equals(paper) && computer.equals(scissors)
            || player.equals(scissors)
            && computer.equals(rock)) {
            System.out.println(computerDecision + computer);
            System.out.println("\nYou lost.");
        } else if (player.equals(paper) && computer.equals(rock)
            || player.equals(scissors) && computer.equals(rock)
            || player.equals(rock)
            && computer.equals(scissors)) {
            System.out.println(computerDecision + computer);
            System.out.println("\nYou win!");
        } else {
            System.out.println("\nSomething is not right.");
        }
        System.out.println("\nDone.");

    }
}

