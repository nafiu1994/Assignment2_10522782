package Exercise;

/**
 *
 * @author Lawal Nafiu
 */
import java.util.Scanner;
public class RightTriangleChecker {
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int a, b, c;
        boolean status, isrtangle = false;
        System.out.println("Enter three integers: \n Side 1:");
        a = keyboard.nextInt();
        
        do{
            status = true;
            System.out.println(" Side 2: ");
            b = keyboard.nextInt();
            if ( b > a)
            {
                System.out.println( a + " is smaller than " + b + "\n Try again");
                status = false;
            }
            
        } while (status == false);
        do{
            status = true;
            System.out.println(" Side 3: ");
            c = keyboard.nextInt();
            if ( c > b)
            {
                System.out.println( b + " is smaller than " + c + "\nTry again.");
                status = false;
            }
        } while (status == false);
        if( a*a == (c*c + b*b))
        {
            isrtangle = true;
        }
        System.out.println("Your three sides are " + a + " " + b + " " + c +  " ");
        if(isrtangle)
        {
            System.out.println("These sides do make a right angle. Yippy-Skippy ");
        }
        else
        {
            System.out.println("NO! These sides do not make a right a right angle");
        }
    }
    
}
