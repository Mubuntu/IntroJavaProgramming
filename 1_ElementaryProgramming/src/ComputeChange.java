import java.util.Scanner;

/**
 * Created by patrick on 6/2/2017.
 * 1. Prompt the user to enter the amount as a decimal number, such as 11.56.
 * 2. Convert the amount (e.g., 11.56) into cents (1156).
 * 3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using
 * the cents remainder 100.
 * 4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining
 * cents using the remaining cents remainder 25.
 * 5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining
 * cents using the remaining cents remainder 10.
 * 6. Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining
 * cents using the remaining cents remainder 5.
 * 7. The remaining cents are the pennies.
 * 8. Display the result.
 */
public class ComputeChange {
    public static void main(String[] args) {
//        create a scanner
        Scanner input = new Scanner(System.in);
        //receive the amount
        System.out.println("Enter an amount in double, for example 2.3");
        double amount = input.nextDouble();
        //convert to cents
        int remainingAmount = (int) (amount * 100);
        //extract the dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100; //hergebruik remainingAmount
        //extract the cents moet niet pas op het einde
        //int cents = remainingAmount;
        //extract quarters;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        //extract numberOfDimes /10
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        //find the number of nickels
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;
        int numberOfPennies = remainingAmount;
        System.out.println();
        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}

