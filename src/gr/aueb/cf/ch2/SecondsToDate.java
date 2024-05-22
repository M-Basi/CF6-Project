package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει εναν ακέραιο που συμβολίζει δευτερόλεπτα
 * και μετατρέπει σε ημέρες, ώρες, λεπτά, δευτερόλεπτα
 */
public class SecondsToDate {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SEC_PER_MINUTE = 60;
        final int SECS_PER_HOUR = 60 * 60;
        final int SECS_PER_DAY = 24 * 60 * 60;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int totalSeconds = 0;
        int remainingSeconds = 0;

        System.out.println("Please insert total seconds: ");
        totalSeconds = in.nextInt();

        days = totalSeconds / SECS_PER_DAY;
        remainingSeconds = totalSeconds % SECS_PER_DAY;

        hours = remainingSeconds / SECS_PER_HOUR;
        remainingSeconds = remainingSeconds % SECS_PER_HOUR;

        minutes = remainingSeconds / SEC_PER_MINUTE;
        remainingSeconds %= SEC_PER_MINUTE;


        System.out.printf("Total seconds: %,02d, Days: %02d, Hours: %02d, Minutes: %02d, Second: %02d",
                totalSeconds, days, hours, minutes, remainingSeconds);
    }
}
