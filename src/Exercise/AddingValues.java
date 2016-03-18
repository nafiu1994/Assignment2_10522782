package Exercise;


import java.util.Scanner;
public class AddingValues {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int n, c=0;
        System.out.println("Number: ");
        n = keyboard.nextInt();
        
        for (int i = 1; i<=n; i++){
            System.out.print(i + "  ");
            c += i;        
        }
        System.out.println("\nThe sum is " + c +"." );
    }
}
