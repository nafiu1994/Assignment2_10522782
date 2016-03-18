package Exercise;

/**
 *
 * @author Lawal Nafiu
 */
import java.util.Scanner;
public class Nim {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int a = 3, b =4 , c = 5, amt;
        int pc1 = 0, pc2 = 0;
        String pile, p1, p2;
        System.out.println("Player 1, Enter your name: ");
        p1 = keyboard.next();
        System.out.println("Player 2, Enter your name: ");
        p2 = keyboard.next();
        
        do{
            System.out.println(" A:" + a + " B: " + b + " C: " + c);
            //Player 1
            System.out.println(p1 + " Choose a pile: ");
            pile = keyboard.next();
            
            System.out.println("How many to remove from pile " + pile);
            amt = keyboard.nextInt();
            if (pile.equalsIgnoreCase("A"))
            {
                a = a - amt;
              
            }
            if (pile.equalsIgnoreCase("B"))
            {
                b = b - amt;
            }
            if (pile.equalsIgnoreCase("C"))
            {
                c = c - amt;
            }
            pc1 += amt;
            
            //Player 2
            System.out.println(p2 + " Choose a pile: ");
            pile = keyboard.next();
            System.out.println("How many to remove from pile " + pile);
            amt = keyboard.nextInt();
            
            if (pile.equalsIgnoreCase("A"))
            {
                a = a - amt;
            }
            if (pile.equalsIgnoreCase("B"))
            {
                b = b - amt;
            }
            if (pile.equalsIgnoreCase("C"))
            {
                c = c - amt;
            }
            pc2 += amt;
                     
        }while(a+b+c > 0);
        
        System.out.println(" A:" + a + " B: " + b + " C: " + c);
        
        if ( pc1 > pc2)
        {
            System.out.println(p1 + ", there are no counters left so you win.");
        }
        else 
        {
            System.out.println(p2 + ", there are no counters left so you win.");
        }
    }   
}
