package Exercise;

/**
 *
 * @author Lawal Nafiu
 */
import java.util.Scanner;
import java.util.Random;
public class OneShotHiLo {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        Random rn = new Random();
        int rand = rn.nextInt(100) + 1, guess;
        
        System.out.println("I'm thinking of a number between 1-100 Try to guess. ");
        guess = keyboard.nextInt();
        
        if ( guess == rand)
            System.out.println("You guessed it! What are the odds?!?");
        else if ( guess > rand)
            System.out.println("Sorry! You are too high. I was thinking of " + rand +".");
        else
            System.out.println("Sorry you are too low. I was thinking of " + rand + ".");
        
    }
    
}
