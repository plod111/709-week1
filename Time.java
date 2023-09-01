public class Time {
/* BCornish -  CSCI 70900 */
/* Hunter CUNY Aug 2023 */
/* EXERCISE 3, Chapter 2 - Think Java 2 */

    public static void main(String[] args){

        System.out.println("Chapter 2, Ex 3 - ThinkJava2");
        System.out.println();

        int hour = 21;
        int minute = 46;
        int second = 23;

        /**
        System.out.println("Hour of the day = " + hour);
        System.out.println("Minute of the hour = " + minute);
        System.out.println("Second of the minute = " + second);
        **/

        int secsSinceMidnight = hour * 3600 + minute * 60 + second;
        
        System.out.println();
        System.out.println("Seconds since midnight: " + secsSinceMidnight);

        int totalSecsInDay = 24*3600;
        int secsRemaining = totalSecsInDay - secsSinceMidnight;
        
        System.out.println();
        System.out.println("Seconds remaining in day: " + secsRemaining);

        double percentageOfDay = (secsSinceMidnight*100)/totalSecsInDay;
        
        System.out.println();
        System.out.println("Percentage of day passed: " + percentageOfDay + "%");

        hour = 21;
        minute = 57;
        second = 14;

        int secsSinceMidnightNow = hour * 3600 + minute * 60 + second;

        int timeOnExercise = secsSinceMidnightNow - secsSinceMidnight;

        System.out.println("Time spent on exercise ~" + timeOnExercise + " seconds");
        System.out.println("Time spent on exercise ~" + timeOnExercise/60 + " minutes");

    }
}
