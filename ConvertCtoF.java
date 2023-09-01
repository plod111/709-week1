import java.util.Scanner;

public class ConvertCtoF{

/* BCornish -  CSCI 70900 */
/* Hunter CUNY Aug 2023 */
/* EXERCISE 2, Chapter 3 - Think Java 2 */
/* Converts temperature in degrees celsius to degrees fahrenheit.*/

    public static void main(String[] args) {

        double degC;
        double degF;

        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Enter a temperature in Celsius: ");
        degC = in.nextDouble();

        // convert and output the result
        degF = degC * (9.0/5.0) + 32.0;

        System.out.println(degC + " \u00B0C = " + degF + " \u00B0F");
    }
}