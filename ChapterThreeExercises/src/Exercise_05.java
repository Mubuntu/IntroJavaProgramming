import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 4/06/2017
 * @time: 20:04
 * TO DO:
 * (Find future dates) Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and dis
 * play the future day of the week. Here is a sample run:
 */
public class Exercise_05 {
    public static void main(String[] args) {
        int today, elapsedDays;
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today;s day: ");
        today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        elapsedDays = input.nextInt();


        String dayString = "";
        switch (today % 7) {
            case 0:
                dayString = "Sunday";
                break;
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            default:
                System.out.println("that is not a day within the week");
                System.exit(1);
        }
        System.out.print("Today is " + dayString + " and the future day is ");
        int day = (today + elapsedDays);
        switch (day % 7) {
            case 0:
                dayString = "Sunday";
                break;
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            default:
                System.out.println("that is not a day within the week");
                System.exit(1);
        }
        System.out.print(dayString);
    }
}
