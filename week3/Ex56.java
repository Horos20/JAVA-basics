package week3;

import java.util.Scanner;

public class Ex56 {
    public static String reverse(String text) {
        int i, len = text.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            dest.append(text.charAt(i));
        }

        return dest.toString();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

}
