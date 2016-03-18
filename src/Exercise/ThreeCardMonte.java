package Exercise;

import java.util.Scanner;

public class ThreeCardMonte {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");
        int input = keyboard.nextInt();
        int sum = input;

        while (input != 0) {
            System.out.println("The total so far is " + sum);
            System.out.print("Number: ");

            input = keyboard.nextInt();
            sum += input;
        }
        System.out.println("\nThe total is " + sum);
    }
}
