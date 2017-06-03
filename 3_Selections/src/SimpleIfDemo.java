import java.util.Scanner;

/**
 * Created by Patrick on 3/06/2017.
 */
public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();
        boolean even = number % 2 == 0, multipleOfFive = number%5==0;


        if (multipleOfFive)
            System.out.println("HiFive");
        if (even)
            System.out.println("HiEven");



    }
}
