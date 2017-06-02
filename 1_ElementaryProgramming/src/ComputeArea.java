import java.util.Scanner;

/**
 * Created by patrick on 5/29/2017.
 */
public class ComputeArea {
    public static void main(String[] args) {
        final double pi = Math.PI;
        double area, radius;
        //introduce a scanner
        Scanner sc = new Scanner(System.in);
        //read the radius
        System.out.println("input the radius: ");
        radius = sc.nextDouble();
        area = (radius * 2) * pi;
        //display the radius
        System.out.format("the area of the circle with radius %f is %f", radius, area);
    }
}
