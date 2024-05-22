package gr.aueb.cf.ch3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Ta φώτα ενός αυτοκινήτου ανάβουν όταν
 * βρέχει και ταυτόχρονα είτε είναι σκοτάδι
 * ή τρέχει με ταχύτητα υψηλή. Ο χρήστης εισάγει τα
 * 3 παραπάνω στοιχεία και το πρόγραμμα εκτυπώνει
 * αν τα φώτα ανάβουν ή όχι
 */

public class LightsOnApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int MAX_SPEED = 100;
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean areLightsOn = false;

        System.out.println("Please enter if is raining: ");
        isRaining = in.nextBoolean();

        System.out.println("Please enter if it is dark: ");
        isDark = in.nextBoolean();

        System.out.println("Please insert the speed: ");
        speed = in.nextInt();

        isRunning = speed >= MAX_SPEED;
        areLightsOn = isRaining && (isDark || isRunning);

        System.out.println(" Are lights on; " + areLightsOn);


    }
}
