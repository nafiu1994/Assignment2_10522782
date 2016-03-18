package Exercise;

import java.util.Scanner;
/**
 *
 * @author Lawal Nafiu
 */
public class CountingMachineRevisited {
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Count from: ");
        int from = keyboard.nextInt();
        System.out.print("Count to  : ");
        int to = keyboard.nextInt();
        System.out.print("Count by  : ");
        int by = keyboard.nextInt();
        for(int i = from; i <= to; i += by)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
