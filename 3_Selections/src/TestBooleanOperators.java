import java.util.Scanner;

/**
 * Created by Patrick on 3/06/2017.
 * Morgan's Law:
 * !(condition1 && condition2) is the same as
 * !condition1 || !condition2
 * !(condition1 || condition2) is the same as
 * !condition1 && !condition2
 * <p>
 * <p>
 * pression is true. Java uses these properties to
 * improve the performance of these operators. When evaluating p1 && p2, Java first evaluates
 * p1 and then, if p1 is true, evaluates p2; if p1 is false, it does not evaluate p2. When
 * evaluating p1 || p2, Java first evaluates p1 and then, if p1 is false, evaluates p2; if p1 is
 * true, it does not evaluate p2.
 * <p>
 * && and || are known
 * as the short-circuit or lazy operators. Java
 */
public class TestBooleanOperators {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
// Receive an input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number % 2 == 0 && number % 3 == 0)
            System.out.println(number + " is divisible by 2 and 3.");
        if (number % 2 == 0 || number % 3 == 0)
            System.out.println(number + " is divisible by 2 or 3.");
        if (number % 2 == 0 ^ number % 3 == 0)
            System.out.println(number +
                    " is divisible by 2 or 3, but not both.");
    }
}
