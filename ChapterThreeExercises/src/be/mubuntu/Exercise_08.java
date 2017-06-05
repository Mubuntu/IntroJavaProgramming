package be.mubuntu;

import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 4/06/2017
 * @time: 20:46
 * TO DO:
 * (Sort three integers) Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order
 */
public class Exercise_08 {
    public static void main(String[] args) {
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        // 10       8           2
        int number1, number2, number3;
        System.out.println("Enter three Integers: ");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        int temp = 0;
        if (number1>number2) {
            temp = number1;
            //8
            number1 = number2;
            //10
            number2 = temp;
        }
        //10 > 2
        if(number2>number3){
            //2
            temp = number2;
            //2
            number2 = number3;
            //10
            number3 = temp;
        }
        //8 > 2
        if(number1 > number2){
            temp = number1;
            //2
            number1 = number2;
            number2 = temp;
        }
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }
}
