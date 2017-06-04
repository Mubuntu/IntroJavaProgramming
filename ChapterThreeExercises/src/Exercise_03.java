import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 4/06/2017
 * @time: 19:42
 * TO DO:
 * (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
 * Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
 * the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
 * that “The equation has no solution.”
 */
public class Exercise_03 {
    public static void main(String[] args) {
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        boolean cramersRule = (a*d) - (b*c) == 0;
        if(cramersRule){
            System.out.println("the equation has no solution. ");
        }

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        System.out.print("x is " + x);
        System.out.println(" and y is " + y);
    }
}
