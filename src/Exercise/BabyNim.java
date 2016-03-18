package Exercise;

import java.util.Scanner;
public class BabyNim {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int a = 3, b =3 , c = 3, amt;
        String pile;
        do{
            System.out.println(" A:" + a + " B: " + b + " C: " + c);
            System.out.println("Choose a pile: ");
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
                     
        }while(a+b+c > 0);
        
        System.out.println(" A:" + a + " B: " + b + " C: " + c);
    }
}
