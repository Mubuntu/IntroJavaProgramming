import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 3/06/2017
 * @time: 17:24
 * TO DO: Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday,
 * Thursday, Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, accordingly.
 */
public class DayOTheWeek {
    public static void main(String[] args) {
        int day;
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day as an integer:");
        day = input.nextInt();
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("that is not a day within the week");
        }
    }
}
