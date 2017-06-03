import java.util.Scanner;

/**
 * @author: Patrick Frison
 * @date: 3/06/2017
 * @time: 17:04
 * TO DO:
 * let us write a program to find out the Chinese Zodiac sign for a given year. The
 * Chinese Zodiac is based on a twelve-year cycle, with each year represented by an animal—
 * monkey, rooster, dog, pig, rat, ox, tiger, rabbit, dragon, snake, horse, or sheep—in this cycle,
 * as shown in Figure 3.6.
 * Note that year % 12 determines the Zodiac sign. 1900 is the year of the rat because 1900
 * % 12 is 4. Listing 3.9 gives a program that prompts the user to enter a year and displays the
 * animal for the year.
 */
public class ChineseZodiac {
    public static void main(String[] args) {
        //CREATE A SCANNER
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        switch (year % 12) {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
        }
    }
}
