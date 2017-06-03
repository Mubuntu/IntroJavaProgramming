import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 3/06/2017
 * @time: 2:04
 * TO DO:
 * (Cost of driving) Write a program that prompts the user to enter the distance to
 * drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
 * and displays the cost of the trip. Here is a sample run:
 *
 * Enter the driving distance: 900.5
 * Enter miles per gallon: 25.5
 * Enter price per gallon: 3.55
 * The cost of driving is $125.36
 * (Cost of driving)
 */
public class Exercise_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance:");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon:");
        double fuelEff = input.nextDouble();
        System.out.print("Enter price per gallon:");
        double pricePerGallon = input.nextDouble();
        double cost = distance / 25.5 * pricePerGallon;
        System.out.print("The cost of driving is $" + cost);
    }
}
