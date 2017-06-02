import javax.swing.*;

/**
 * Created by patrick on 5/31/2017.
 */
public class ComputeLoanUsingJOptionPane {
    public static void main(String[] args) {
        //enter yearly interestrate
        String annualInterestRateString = JOptionPane.showInputDialog("Enter yearly interest rate, for example 8.25");
        //convert to double
        double annualInterestRate = Double.parseDouble(annualInterestRateString);
        //obtain monthly interest rate from the annual interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        //enter number of years
        String numberOfYearsString = JOptionPane.showInputDialog("Enter number of years. \nfor example 8");
        //convert to int
        int numberOfYears = Integer.parseInt(numberOfYearsString);
        //Enter Loan amount
        String loanAmountString = JOptionPane.showInputDialog("enter loan amount as a double:  \nfor example 80000");
        //convert to double
        double loanAmount = Double.parseDouble(loanAmountString);
        //3. Compute the monthly payment using the preceding formula.
        double monthlyPayment = loanAmount * monthlyInterestRate / Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        //4. Compute the total payment, which is the monthly payment multiplied by 12 and multi
        //plied by the number of years.
        double totalPayment = monthlyPayment * numberOfYears * 12;
        // Format to keep two digits after the decimal point
        totalPayment = (int) (totalPayment * 100) / 100.0;
        monthlyPayment = (int) (monthlyPayment * 100) / 100.0;
        // Display results
        String output = "The monthly payment is " + monthlyPayment +
                "\nThe total payment is " + totalPayment;

        JOptionPane.showMessageDialog(null, output);
    }
}
