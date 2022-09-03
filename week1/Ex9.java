package week1;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        // Create a program that asks the user for two integers and prints their quotient. Make sure that 3 / 2 = 1.5.
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int integer1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        int integer2 = Integer.parseInt(reader.nextLine());

        System.out.println("Division: " + integer1 + " / " + integer2 + " = " + ((double)integer1/integer2));
    }
}
