import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 3/06/2017
 * @time: 1:59
 * TO DO:
 * 2.16 (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area. formulate: https://gyazo.com/7e56a44f17c13d50ea541e7f5ddedc1b
 *
 * Enter the side: 5.5
 * The area of the hexagon is 78.5895
 * where s is the length of a side. Here is a sample run:
 */

public class Exercise_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side:");
        double s = input.nextDouble();
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(s, 2);
        System.out.print("The area of the hexagon is " + area);
    }
}
