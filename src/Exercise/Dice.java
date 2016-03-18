package Exercise;

/**
 *
 * @author Lawal Nafiu
 */
import java.util.Random;
public class Dice {
    public static void main(String [] args){
        Random rn = new Random();
        int x = rn.nextInt(6) + 1, y = rn.nextInt(6) + 1; 
        
        System.out.println("HERE COMES THE DICE!");
        System.out.println("ROLL #1: " + x + "!");
        System.out.println("ROLL #2: " + y + "!");
        System.out.println("The total is " + (x+y) + "!");
    }
}
