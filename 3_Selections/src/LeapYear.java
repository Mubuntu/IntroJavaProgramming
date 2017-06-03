import java.util.Scanner;

/**
 * Created by Patrick on 3/06/2017.
 * <p>
 * // A leap year is divisible by 4
 * boolean isLeapYear = (year % 4 == 0);
 * // A leap year is divisible by 4 but not by 100
 * isLeapYear = isLeapYear && (year % 100 != 0);
 * // A leap year is divisible by 4 but not by 100 or divisible by 400
 * isLeapYear = isLeapYear || (year % 400 == 0);
 * Or you can combine all these expressions into one like this:
 * isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
 * Listing 3.7 gives the program that lets the user enter a year and checks whether it is a leap
 * year.
 */
public class LeapYear {
    public static void main(String[] args) {
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();

//        Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        //Display the result
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
