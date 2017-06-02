import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by patrick on 6/2/2017.
 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
 * The program prompts the user to enter a number in pounds, converts it
    to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a
    sample run:
    ctr+J gives you all the snippets
 */
public class PoundToKilogram_E4 {
    public static void main(String[] args) {
        final double CONVERSION_RULE= 0.454;
        //make a scanner
        Scanner input = new Scanner(System.in);
        //ask the amount of pounds
        System.out.println("Enter a number in pounds (as a double): ");
        double weightInPounds = input.nextDouble();
        //convert to kilograms
        double weightInKilograms = CONVERSION_RULE * weightInPounds;
        //display
        System.out.printf("weight in kilograms: %.2f", weightInKilograms);
    }
}
