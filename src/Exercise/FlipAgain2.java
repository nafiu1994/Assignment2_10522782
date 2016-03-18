package Exercise;

/**
 *
 * @author Lawal Nafiu
 */
import java.util.Random;
import java.util.Scanner;
public class FlipAgain2 {
    public static void main( String[] args )
	{
            /*
                3. The code works the same. The program still works.
                   This is because the do while loop block is executed
                   at least once. As a result the program works if the String
                   again isn't initialised when it is declared.
            */
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String again;
                /*int x = rng.nextInt(2);
                
                if ( x == 0)
                {
                System.out.println("You flip a coin and it is ...... TAILS");
                }
                else
                {
                 System.out.println("You flip a coin and it is ...... HEADS");  
                }
                
                System.out.println("Would you like to flip again? (y/n)");
                again = keyboard.next();*/
                
		do
		{
			int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? \n" );
			again = keyboard.next();
		}while ( again.equals("y") );
	}
    
}
