import java.util.Scanner;

/**
 * Created by patrick on 5/30/2017.
 */
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.21;
        System.out.println("Sale Tax is: "+ (int)(tax*100)/100.0);
    }
}




