package be.mubuntu;

import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 5/06/2017
 * @time: 3:03
 * TO DO:
 * (Game: heads or tails) Write a program that lets the user guess whether the flip of
 * a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 * which represents head or tail. The program prompts the user to enter a guess and
 * reports whether the guess is correct or incorrect.
 */
public class Exercise_14 {
    public static void main(String[] args) {
        int coinflip = (int) (Math.random() * 2);

//        System.out.println("coinflip = " + coinflip); //checkup
        System.out.println("Enter guess for coinflip (0 being heads, 1 being tails): ");
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        String coinFlipString = "";
        switch (coinflip) {
            case 0:
                coinFlipString = "Heads";
                break;
            case 1:
                coinFlipString = "Tails";
                break;
            default:
                System.out.println("that is not within range");
                System.exit(1);
        }
        if (guess == coinflip) {
            System.out.println("you guess correctly! It was " + coinFlipString);
        } else {
            System.out.println("You did not guess correctly ! It was supposed to be " + coinFlipString);

        }

    }
}
