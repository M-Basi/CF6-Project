package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του ν.
 * Δηλαδή n! = 1*2*3*4*...*n
 */

public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num= 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert a number: ");
        num = in.nextInt();

        while (i<=num) {
            facto *= i;
            i++;
        }

        System.out.printf("%d! = %d", num, facto);

    }
}
