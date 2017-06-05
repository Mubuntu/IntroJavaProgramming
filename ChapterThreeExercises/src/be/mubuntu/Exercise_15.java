package be.mubuntu;

import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 5/06/2017
 * @time: 3:11
 * TO DO:
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three
 * digit number. The program prompts the user to enter a three-digit number and
 * determines whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is
 * $10,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award is
 * $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is
 * $1,000.
 */
public class Exercise_15 {
    public static void main(String[] args) {
        // Generate a lottery number
        int lottery = (int) (Math.random() * 1000);
        System.out.println("lottery = " + lottery);
// Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();
// Get digits from lottery
        int lotteryDigit1 = lottery / 100;
        System.out.println("lotteryDigit1 = " + lotteryDigit1);
        int lotteryDigit2 = (lottery %100)/10;
        System.out.println("lotteryDigit2 = " + lotteryDigit2);
        int lotteryDigit3 = lottery % 10;
        System.out.println("lotteryDigit3 = " + lotteryDigit3);
// Get digits from guess
/**guess % 10 obtains the last digit from guess and guess / 10 obtains
 *  the first digit from guess, since guess is a two-digit number        **/
        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess % 100)/10;
        int guessDigit3 = guess % 10;

        System.out.println("The lottery number is " + lottery);
// Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if ((guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit3) ||
                //guesdigit1 is two of the three lotterydigits
                (guessDigit1 == lotteryDigit2 && guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
                //gd1 == lt3 gd2 == ld1 gd3 == ld2
                || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
                //gd1 == ld3 gd2 ==ld2 gd3 == ld1
                || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
                //gd1 == ld1 gd2 == ld3 gd3 == ld2
                || (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2))
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
                || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2
                || guessDigit3 == lotteryDigit3)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
