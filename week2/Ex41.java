package week2;

import java.util.Random;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100 - 0 + 1) + 0;
        int count = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Guess a number: ");
        while (true) {
            int numberGuessed = Integer.parseInt(reader.nextLine());
            count++;
            if (numberGuessed > randomNumber) {
                System.out.println("The number is lesser, guesses made: " + count);
            } else if (numberGuessed < randomNumber) {
                System.out.println("The number is greater, guesses made: " + count);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }
}
