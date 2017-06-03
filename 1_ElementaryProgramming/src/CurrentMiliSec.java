/**
 * Created by patrick on 5/30/2017.
 */
public class CurrentMiliSec {
    /**
     * The System.currentTimeMillis() returns the number of milliseconds
     * since the Unix epoch. (1-1-1970)
     */
    public static void main(String[] args) {
        long totalMillis = System.currentTimeMillis();
        // Obtain the total seconds since midnight, Jan 1, 1970 and apply the offset
        long totalSeconds = totalMillis / 1000;
        //Compute the current second from totalSeconds % 60
        long currentSecond = (int) (totalSeconds % 60);
        // Obtain the total minutes totalMinutes by dividing totalSeconds by 60
        long totalMinutes = totalSeconds / 60;
        //Compute the current minute from totalMinutes % 60
        long currentMinute = totalMinutes % 60;
        //Obtain the total hours totalHours by dividing totalMinutes by 60
        long totalHours = totalMinutes / 60;
        //7. Compute the current hour from totalHours % 24
        long currentHour = totalHours % 24;
        System.out.println("current time is: " + currentHour + ":" + currentMinute + "::" + currentSecond + " GMT");
    }
}
