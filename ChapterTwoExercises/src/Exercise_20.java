import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 3/06/2017
 * @time: 2:04
 * TO DO:
 * *2.20 (Financial application: calculate interest) If you know the balance and the annual
 * percentage interest rate, you can compute the interest on the next monthly pay
 * ment using the following formula:
 * interest = balance * (annualInterestRate/1200)
 * Write a program that reads the balance and the annual percentage interest rate and
 * displays the interest for the next month. Here is a sample run:
 * Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
 * The interest is 2.91667
 */
public class Exercise_20 {
    public static void main(String[] args) {
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%):");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        double interest = balance * (annualInterestRate/1200);
        System.out.print("The interest is " + interest);
    }
}

