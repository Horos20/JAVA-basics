package week2;

import java.util.Random;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100 - 0 + 1) + 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Guess a number: ");
        int numberGuessed = Integer.parseInt(reader.nextLine());
        if (numberGuessed > randomNumber) {
            System.out.println("The number is lesser");
        } else if (numberGuessed < randomNumber) {
            System.out.println("The number is greater");
        } else {
            System.out.println("Congratulations, your guess is correct!");
        }
    }
}
