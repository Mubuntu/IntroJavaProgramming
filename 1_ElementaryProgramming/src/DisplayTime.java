import java.util.Scanner;

/**
 * Created by patrick on 5/29/2017.
 */
public class DisplayTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //prompt the user to enter three numbers
        System.out.print("Enter an integer for seconds: ");
        int seconds = sc.nextInt();

        int minutes = seconds / 60; //find minutes in seconds
        int remainingSeconds = seconds % 60; // seconds remaining
        System.out.println(seconds + " seconds is " + minutes + "and " +
                remainingSeconds + " seconds.");
    }
}
