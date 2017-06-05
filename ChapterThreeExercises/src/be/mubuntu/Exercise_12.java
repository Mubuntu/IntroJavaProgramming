package be.mubuntu;

import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 5/06/2017
 * @time: 2:57
 * TO DO:
 * (Palindrome number) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome number. A number is palindrome if it reads the same from right to left and from left to right. Here is a sample
 * run of this program:
 */
public class Exercise_12 {
    public static void main(String[] args) {
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        int palindrome= input.nextInt();
        // extract first number
        int first = palindrome /100;
        //extract last number (divide by ten extracts middle number)
        int last = palindrome % 10;
        if (first == last){
            System.out.println(palindrome + " is a palindrome.");
        }else {
            System.out.println(palindrome + " is not a palindrome.");
        }

    }
}
