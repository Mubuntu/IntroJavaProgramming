package be.mubuntu;

import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 4/06/2017
 * @time: 21:41
 * TO DO: SubtractionQuiz.java, randomly generates a
 * subtraction question. Revise the program to randomly
 * generate an addition question with two integers less than 100.
 */
public class Exercise_10 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 100), number2 = (int) (Math.random() * 100);
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        System.out.println(number1 + " + " + number2 + " = ?: ");
        int sum = input.nextInt();
        System.out.print(number1 + " + "+ number2+ " = " + (number1 + number2));
        if (sum == number1 + number2){
            System.out.print(" your answer was correct!");
        }else {
            System.out.print(" your answer was wrong!");
        }

    }
}
