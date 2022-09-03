package week1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // Create a program that asks the user for a number and tells if the number is positive (i.e. greater than zero).
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        double number = Double.parseDouble(reader.nextLine());

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number == 0) {
            System.out.println("The number is neutral");
        }
        else {
            System.out.println("The number is not positive");
        }
    }
}
