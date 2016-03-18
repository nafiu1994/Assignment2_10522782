
package Exercise;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rn = new Random();
        int random = 1 + rn.nextInt(10);
        System.out.print("I have chosen a number between 1 and 10. Try to guess it.\nYour guess: ");
        int guess = keyboard.nextInt();

        while (random != guess) {
            System.out.print("That is incorrect. Guess again.\nYour guess: ");
            guess = keyboard.nextInt();
        }
        System.out.println("That's right! You're a good guesser");

    }

}
