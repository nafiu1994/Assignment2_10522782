package Exercise;

import java.util.Scanner;

public class EnterPIN {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();

        while (entry != pin) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
}

/*  
1. How is a while loop similar to an if statement? 
Ans: They all are used for decision making.
2.How is a while loop different from an if statement?
Ans: A while loop decision is used for iterations only while an if statement is used for general decision making.
3.Inside the while loop, why isn't there an int in front of the line entry = keyboard.nextInt()?
Ans: The variable entry is already defined in the main class, right before the the beginning of the while loop.
4.Delete the line entry = keyboard.nextInt(); from inside the while loop. What happens? Why?
Ans: If the first keyboard input is incorrect the while loop enters and infinite loop.
     This is because there is no change in the value of entry which is used in the
     test condition of the the while loop.
*/
