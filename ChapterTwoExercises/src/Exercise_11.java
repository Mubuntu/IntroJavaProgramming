import java.util.Scanner;

/**
 * @author: ${USER}
 * @date: 3/06/2017
 * @time: 1:47
 * TO DO:
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and displays the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program. The population
 * should be cast into an integer. Here is a sample run of the program:
 * Enter the number of years: 5
 * The population in 5 years is 325932970
 */
public class Exercise_11 {
    public static void main(String[] args) {
        //declare variables
        long newPop = 0, current = 312032486;
        int time;
        int birth, death, immigrant;

        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years:");
        int v = input.nextInt();

        for (int i = 1; i <= v; i++) {
            // Convert time to second
            time = i * 365 * 24 * 60 * 60;
            // Calculating population increase/decrease in each case
            birth = time / 7;
            death = time / 13;
            immigrant = time / 45;
            // calculate new population
            newPop = current + birth - death + immigrant;

        }

        System.out.println("The population in " + v + "years is " + newPop);
    }
}
