package Exercise;

import java.util.Scanner;
import java.util.Random;
public class BabyBlackJack {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        Random rn = new Random();
        int x1, x2;
        int y1 = 1 + rn.nextInt(10), y2 = rn.nextInt(10);
        
        System.out.println("Baby Blackjack!\nPlease enter your 2 draws, one draw after another!");
        x1 = keyboard.nextInt();
        x2 = keyboard.nextInt();
        
        System.out.println("You drew " + x1 + " and " + x2 + ".\nYour total is " + (x1 + x2));
        System.out.println("\nThe dealer has " + y1 + " and " + y2 + ".\nDealer's total is " + (y1 + y2));
        
        if( (x1 + x2) > (y1 + y2))
        {
            System.out.println("YOU WIN");
        }
        else
        {
            System.out.println("SORRY TODAY ISN'T A LUCKY DAY FOR YOU.");
        }
    }
    
}
