import java.util.Scanner;

/**
 * Created by patrick on 6/2/2017.
 * (Compute the volume of a cylinder) Write a program that reads in the radius
 and length of a cylinder and computes the area and volume using the following
 formulas:
 area = radius * radius * p
 volume = area * length
 */
public class Exercise_02_ComputeCilinder {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Give in the radius as a double: ");
        double radius = input.nextDouble();
        System.out.println("give in the length of your cilinder as an integer: ");
        int length = input.nextInt();
        //calculate area:
        double area = radius * radius * Math.PI;
        //calculate volume:
        double volume = area * length;
        //display:
        System.out.printf("length: %d\tradius: %.2f" +
                           "\nArea: %.2f\tVolume: %.2f",length,radius,area,volume);
    }
}
