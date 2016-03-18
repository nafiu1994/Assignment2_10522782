/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solved_Exercises;

/**
 *
 * @author LUMINA BFS
 */
import java.util.Scanner;
import java.util.Random;
public class Number_Guessing {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        Random rn = new Random();
        int guess = 0, random;
        //random = 1 + rn.nextInt(10);
        
        do{
            random = 1 + rn.nextInt(10);
            System.out.println("I'm thinking of a number from 1 to 10 \n Your guess: ");
            guess = keyboard.nextInt();
            
            if ( random != guess)
            {
                System.out.println("Sorry, but I was really thinking of " + random +"\n");
            }
            else
            {
                System.out.println("That's right! My secret number was " + random + "!");
            }
            
        }while(random != guess);
            
    }
    
}
