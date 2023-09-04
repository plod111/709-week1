import java.util.Scanner;

public class TimeInSecs {

/* BCornish -  CSCI 70900 */
/* Hunter CUNY Aug 2023 */
/* EXERCISE 3, Chapter 3 - Think Java 2 */
/* Converts time entered in seconds alone into hours, minutes, seconds.*/

    public static void main(String[] args) {

        int timeInSecs;
        int hours;
        int minutes;
        int seconds;

        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Enter a time in (whole) seconds: ");
        timeInSecs = in.nextInt();
        //in.nextInt(); // Read newline blank

        // convert and output the result
        hours = timeInSecs/3600;
        minutes = (timeInSecs - hours*3600)/60;
        seconds = (timeInSecs - hours*3600 - minutes*60);

        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds\n",
                            timeInSecs, hours, minutes, seconds);
    }
}
