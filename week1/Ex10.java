package week1;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        /* The circumference of a circle is calculated using the formula 2 * pi * radius.
         Create a program that asks the user for the radius and then calculates the circumference using the given radius. */
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius: ");
        double radius = Double.parseDouble(reader.nextLine());

        System.out.println("Circumference of the circle: " + (2 * Math.PI * radius));
    }
}
