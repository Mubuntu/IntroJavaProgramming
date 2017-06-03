import java.util.Scanner;

/**
 * @author:
 * @date: 2/06/2017
 * @time: 23:44
 * TO DO:
 * Enter the time zone offset to GMT: −5
 * The current time is 4:50:34
 * (Current time) ShowCurrentTime.java, gives a program that displays
 * the current time in GMT. Revise the program so that it prompts the user to enter
 * the time zone offset to GMT and displays the time in the specified time zone. Here
 * is a sample run:
 * Enter the time zone offset to GMT: −5
 * The current time is 4:50:34
 */
public class Exercise_08 {
    public static void main(String[] args) {
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT");
        int offset = input.nextInt();
        //calculate offset in seconds omzetten van uur naar seconden
        offset = offset * 60 * 60;

        // Obtain the total milliseconds since midnight, jan 1, 1970
        long totalMiliSecs = System.currentTimeMillis();
        // Obtain the total seconds since midnight, Jan 1, 1970 and apply the offset
        long totalSeconds = (totalMiliSecs / 1000) + offset;
        long currentSecond = (int) (totalSeconds % 60);
        // Obtain the total minutes totalMinutes by dividing totalSeconds by 60
        long totalMinutes = totalSeconds /60;
        //Compute the current minute from totalMinutes % 60
        long currentMinute = totalMinutes %60;
        //Obtain the total hours totalHours by dividing totalMinutes by 60
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours %24;
        System.out.println("current time is: " + currentHour + ":" + currentMinute + "::" + currentSecond);

    }
}
