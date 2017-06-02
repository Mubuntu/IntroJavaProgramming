import java.util.Scanner;

/**
 * Created by patrick on 5/29/2017.
 */
public class ComputeAverage {
    public static void main(String[] args) {
        //create a Scanner object
        Scanner sc = new Scanner(System.in);
        double number1, number2, number3;
        //prompt the user to enter three numbers
        System.out.println("enter three numbers: ");
        number1 = sc.nextDouble();
        number2 = sc.nextDouble();
        number3 = sc.nextDouble();
        //compute average
        double average = (number1 + number3 + number2) / 3;
        //display average
        System.out.println("the average of the three numbers is: " + average);
    }
}
