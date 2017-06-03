import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 3/06/2017
 * @time: 1:50
 * TO DO:
 * Enter speed and acceleration: 60 3.5
 * The minimum runway length for this airplane is 514.286
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:
 * length =
 * v2
 * 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the
 * acceleration a in meters/second squared (m/s2), and displays the minimum run
 * way length. Here is a sample run:
 */
public class Exercise_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration:");
        double v = input.nextDouble();
        double a = input.nextDouble();
        double length = Math.pow(v, 2) / (2 * a);

        System.out.print("The minimum runway length for this airplane is " + length);
    }
}
