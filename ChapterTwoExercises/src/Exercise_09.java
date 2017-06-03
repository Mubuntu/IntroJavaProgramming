import java.util.Scanner;

/**
 * @author:
 * @date: 3/06/2017
 * @time: 1:21
 * TO DO:
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as shown in the following formula:
 * a =
 * v1 - v0
 * t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * and displays the average acceleration. Here is a sample run:
 * Enter v0, v1, and t: 5.5 50.9 4.5
 * The average acceleration is 10.0889
 */

public class Exercise_09 {
    public static void main(String[] args) {
        double v0, v1, acceleration;
        int t;
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextInt();
        //calculate the acceleration
        acceleration = (v0 - v1) / t;
    }
}
