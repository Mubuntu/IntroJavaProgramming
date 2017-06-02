import java.util.Scanner;

/**
 * @author: patrick
 * @date: 6/2/2017
 * @time: 9:51 PM
 * TO DO:
 * Financial application: calculate tips) Write a program that reads the subtotal
 * and the gratuity rate, then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total. Here is a sample run:
 * Enter the subtotal and a gratuity rate: 10 15
 * The gratuity is $1.5 and total is $11.5
 */
public class ComputeGratuityRate_E5 {
    public static void main(String[] args) {
        //declare variables:
        int gratuityRate;
        double subtotal, temp_total;

        //initiate a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate:");
        subtotal = input.nextDouble();
        gratuityRate = input.nextInt();
        //deler door een double anders bekom je 0
        temp_total = subtotal * (gratuityRate / 100.0);
        subtotal = temp_total + subtotal;
        //display results:
        System.out.printf("The gratuity is 4%d and total is $%.2f.",  gratuityRate, subtotal);
    }
}
