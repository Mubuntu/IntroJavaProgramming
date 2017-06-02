import java.util.Scanner;

/**
 * Created by patrick on 6/2/2017.
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
 * a double value from the console, then converts it to Fahrenheit and displays the
 * result. The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8
 */
public class ComputeDegreesFahrenheit_Celsius_E1 {
    public static void main(String[] args) {
        //create a Scanner
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean Fahrenheit = false;

        double givenDegrees, degreesCelsius, degreesFahrenHeit;
        System.out.print("make choice: \n\t1)Convert to Celsius(From Fahrenheit)." +
                "\n\t2)Convert to Fahrenheit (from Celsius):");
        choice = input.nextInt();
        if (choice == 1) {
            Fahrenheit = false;
            System.out.println("enter degrees Fahrenheit for conversion: ");
            givenDegrees = input.nextDouble();
            convertToCelsius(givenDegrees);
        } else if (choice == 2) {
            System.out.println("enter degrees Celsius for conversion: ");
            givenDegrees = input.nextDouble();
            convertToFahrenheit(givenDegrees);
        }

    }

    private static void convertToFahrenheit(double givenDegrees) {
        double degreesFahrenheit = (givenDegrees * (9.0 / 5)) + 32;
        System.out.println(givenDegrees + " degrees Celsius is: " +
                degreesFahrenheit + " degrees Fahrenheit");
    }

    private static void convertToCelsius(double givenDegrees) {
        double degreesCelsius = ((givenDegrees - 32) * 5.0) / 9;
        System.out.println(givenDegrees + " degrees Fahrenheit is: " +
                degreesCelsius + " degrees Celsius");

    }
}
