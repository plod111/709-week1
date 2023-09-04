import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class GuessStarter {

/* BCornish -  CSCI 70900 */
/* Hunter CUNY Aug 2023 */
/* EXERCISE 4, Chapter 3 - Think Java 2 */
/* Generates random number, asks user to guess.*/

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int userGuess;
                
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        // prompt the user and get the value
        System.out.println("I'm thinking of a number between 1 and 100\n" + //
                "(including both). Can you guess what it is? ");
        System.out.print("Type a number: ");

        userGuess = in.nextInt();
        //in.nextInt(); // Read newline blank
        System.out.println("Your guess is: " + userGuess);
        
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + Math.abs(number - userGuess));
        
    }
}