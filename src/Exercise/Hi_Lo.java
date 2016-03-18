package Exercise;

import java.util.Random;
import java.util.Scanner;

public class Hi_Lo {

    public static void main(String[] args) {
        int number = new Random().nextInt(100) + 1;
        Scanner keyboard = new Scanner(System.in);
        int tries = 0;
        System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
        System.out.printf("First guess: %d:  ", tries + 1);
        int guess = keyboard.nextInt();
        tries++;
        if (guess < number) {
            System.out.println("Sorry, you are too low.");
        } else if (guess > number) {
            System.out.println("Sorry, that guess is too high.");
        } else {
            System.out.println("You guessed it!  What are the odds?!?");
            return;
        }
        while (tries < 7) {
            System.out.printf("Guess  # %d:  ", (tries + 1));
            guess = keyboard.nextInt();
            tries++;
            if (guess < number) {
                System.out.println("Sorry, that guess is too low.");
            } else if (guess > number) {
                System.out.println("Sorry, that guess is too high.");
            } else {
                System.out.println("You guessed it!  What are the odds?!?");
                return;
            }
        }
        System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
    }

}
