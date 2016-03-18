package Exercise;

/**
 *
 * @author Lawal Nafiu
 */
import java.util.Scanner;

public class SafeSquareRoot {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int num;

        System.out.println("SQUARE ROOT! \n Enter a number: ");
        num = keyboard.nextInt();
        while (num < 0) {
            System.out.println("You can't take the square root of a negative number, "
                    + "silly. \n Try again: ");
            num = keyboard.nextInt();
        }

        System.out.println("The square root of " + num + " is " + (Math.sqrt(num)));
    }

}
