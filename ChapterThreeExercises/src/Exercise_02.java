import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 4/06/2017
 * @time: 19:36
 * TO DO:
 * (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts the user to enter the sum of these two integers.
 * Revise the program to generate three single-digit integers and prompt the user to
 * enter the sum of these three integers.
 */
public class Exercise_02 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10) + 1, number2 = (int) (Math.random() * 10) + 1, number3 = (int) (Math.random() * 10) + 1;
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        System.out.print(
                "What is " + number1 + " + " + number2 + " + " + number3 + "? ");
        int number = input.nextInt();
        System.out.println(
                number1 + " + " + number2 + " + " + number3 + " = " + number + " is " +
                        (number1 + number2 + number3 == number));
    }
}
