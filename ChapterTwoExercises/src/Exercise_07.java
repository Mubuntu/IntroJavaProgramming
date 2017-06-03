import java.util.Scanner;

/**
 * @author: patrick
 * @date: 6/2/2017
 * @time: 10:28 PM
 * TO DO:
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and days for the min
 * utes. For simplicity, assume a year has 365 days. Here is a sample run:
 */
public class Exercise_07 {
    public static void main(String[] args) {
        //declare a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("give in a number in minutes: ");
        int number = input.nextInt();
        int days  = number / (24*60);
        int years = days / 365;
        System.out.printf("%d minutes is %d years and %d days.", number, years,days);
    }
}