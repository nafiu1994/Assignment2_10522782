package Exercise;

import java.util.Random;

public class DiceDoubles {

    public static void main(String[] args) {
        Random rn = new Random();
        int x = 0;
        int y = -1;
        while (x != y) {
            x = rn.nextInt(6) + 1;
            y = rn.nextInt(6) + 1;
            System.out.println("HERE COMES THE DICE!");
            System.out.println("ROLL #1: " + x);
            System.out.println("ROLL #2: " + y);
            System.out.println("The total is " + (x + y) + "!");

        }
    }
}
