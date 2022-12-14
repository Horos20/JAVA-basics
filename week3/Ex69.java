package week3;

import java.util.Scanner;

public class Ex69 {
    public static boolean palindrome(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
