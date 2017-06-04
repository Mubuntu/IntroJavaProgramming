import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 4/06/2017
 * @time: 20:22
 * TO DO:
 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
 * let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
 * inches, you will enter 5 for feet and 10 for inches. Here is a sample run:
 */
public class Exercise_06 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weightInPounds = input.nextDouble();
        System.out.println("Enter feet: ");
        double heightFeet = input.nextDouble();
        System.out.println("Enter inches: ");
        double heightInches = input.nextDouble();
        //1 feet equals 12 inches
        heightInches = heightFeet * 12 + heightInches;
        //Compute BMI

        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        double heightInMeters = heightInches * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        //Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }
}
