import java.util.Scanner;

/**
 * Created by patrick on 5/30/2017.
 * here we're computing a loan payment with a formula that is derived from the internet
 */
public class ComputeLoan {
    public static void main(String[] args) {
        double annualInterestRate, monthlyInterestRate, loanAmount, monthlyPayment, totalPayment;
        int numberOfYears;
        //1. Prompt the user to enter the annual interest rate, number of years, and loan amount.
        System.out.println("Enter the annual interest rate: ");
        Scanner input = new Scanner(System.in);
        annualInterestRate = input.nextDouble();
        //2. Obtain the monthly interest rate from the annual interest rate.
        monthlyInterestRate = annualInterestRate / 1200;
        //Enter Number of years
        System.out.println("Enter Number of years as an integer, for example 12: ");
        numberOfYears = input.nextInt();
        //Enter Loan Amount
        System.out.println("enter loan amount as a double: ");
        loanAmount = input.nextDouble();
        //3. Compute the monthly payment using the preceding formula.
        monthlyPayment = loanAmount * monthlyInterestRate / Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        //4. Compute the total payment, which is the monthly payment multiplied by 12 and multi
        //plied by the number of years.
        totalPayment = monthlyPayment * numberOfYears * 12;
        // 5. Display the monthly payment and total payment.
        // Display results
        System.out.println("The monthly payment is " +
                (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is " +
                (int) (totalPayment * 100) / 100.0);
    }

}

