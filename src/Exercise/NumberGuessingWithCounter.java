package Exercise;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithCounter {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rn = new Random();
        int tries = 0;
        int random = 1 + rn.nextInt(10);
        System.out.print(random);
        System.out.print("I have chosen a number between 1 and 10. Try to guess it.\nYour guess: ");
        int guess = keyboard.nextInt();
        tries++;
        while (random != guess) {
            System.out.print("That is incorrect. Guess again.\nYour guess: ");
            guess = keyboard.nextInt();
            tries++;
        }
        System.out.println("That's right! You're a good guesser");
        System.out.printf("It only took you %d tries.\n", tries);

    }

}
