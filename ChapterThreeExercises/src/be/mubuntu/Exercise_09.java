package be.mubuntu;

import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 4/06/2017
 * @time: 21:31
 * TO DO:
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
 * which is calculated from the other nine digits using the following formula:
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
 * d6
 * 6 + d
 * 7 * 7 + d8 * 8 + d9 * 9) % 11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 * convention. Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros). Your program should read
 * the input as an integer. Here are sample runs:
 */
public class Exercise_09 {
    public static void main(String[] args) {
        int checksum;
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 0 digits of an ISBN as integer: ");
        int isbn = input.nextInt();
        int d1 = isbn / 100000000;
        int d2 = (isbn % 100000000) / 10000000;
        int d3 = (isbn % 10000000) / 1000000;
        int d4 = (isbn % 1000000) / 100000;
        int d5 = (isbn % 100000) / 10000;
        int d6 = (isbn % 10000) / 1000;
        int d7 = (isbn % 1000) / 100;
        int d8 = (isbn % 100) / 10;
        int d9 = isbn % 10;

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7
                + d8 * 8 + d9 * 9) % 11;
        System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6
                + d7 + d8 + d9);
        if(d10 == 10){
            System.out.print('X');
        }else {
            System.out.print(d10);
        }
    }
}
