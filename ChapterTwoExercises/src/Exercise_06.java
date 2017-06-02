import java.util.Scanner;

/**
 * @author: patrick
 * @date: 6/2/2017
 * @time: 10:24 PM
 * TO DO: (Sum the digits in an integer) Write a program that reads an integer between 0 and 1000
 * and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
 * For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */
public class Exercise_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        int firstDigit = number % 10;
        int remainingNumber = number / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;

        int sum = thirdDigit + SecondDigit + firstDigit;

        System.out.println("The sum of all digits in " + number + " is " + sum);
    }
}
