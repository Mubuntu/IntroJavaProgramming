import java.util.Scanner;

/**
 * Created by patrick on 6/2/2017.
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
 to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 */
public class Exercise_03_FeetToMeters {
    public static void main(String[] args) {
        //create a Scanner
        Scanner input = new Scanner(System.in);
        int choice = 0;

        double givenLength, degreesCelsius, degreesFahrenHeit;
        System.out.print("make choice: \n\t1)Convert to Meters: " +
                "\n\t2)Convert to Feet: ");
        choice = input.nextInt();
        if (choice == 1) {
            System.out.println("enter length in meters for conversion: ");
            givenLength = input.nextDouble();
            convertToFeet(givenLength);
        } else if (choice == 2) {
            System.out.println("enter length in feet for conversion: ");
            givenLength = input.nextDouble();
            convertToMeter(givenLength);
        }

    }

    private static void convertToMeter(double givenLength) {
        //1 meter is 3.28084 feet
        double lengthInMeters = givenLength *3.28084 ;
        System.out.println(givenLength + " meters converted to  " +
                lengthInMeters + " feet");
    }

    private static void convertToFeet(double givenLength) {
        //1 feet is 0.305 meters
        double lengthInFeet =0.305* givenLength ;
        System.out.println(givenLength + " feet converted to  " +
                lengthInFeet + " meters");

    }
    }

