package week7;

import java.util.Scanner;

public class Reader {
    Scanner reader = new Scanner(System.in);
    public String readString() {
        String word = reader.nextLine();
        return word;
    }
    public int readInteger() {
        int number = Integer.parseInt(reader.nextLine());
        return number;
    }
}
