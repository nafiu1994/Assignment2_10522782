package Exercise;

import java.util.Scanner;

/**
 *
 * @author Lawal Nafiu
 */
public class CountingMachine {
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Count to: ");
        int kount = keyboard.nextInt();
        for(int i = 0; i <= kount; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
