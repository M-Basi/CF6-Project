package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει 2 ακεραίους μέχρι
 * ο αριθμητής να είναι μηδεν.
 * Το πρόγραμμα ελέγχει ατο παρανομαστή αν είναι
 * 0, και αν είναι 0 δίνει την δυνατότητα στο χρήστη
 * να συνεχίσει δίνοντας στον παρανομαστή διάφορο του μηδενός
 */
public class WhileDivApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert two integers for division (numerator 0 for exit): ");
            numerator = scanner.nextInt();
            denominator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is zero");
                break;
            }

            if (denominator == 0) {
                System.out.println("Denominator should not be zero");
                continue;
            }

            result = numerator / denominator;

            System.out.printf("%d / %d = %d",numerator, denominator, result);

        }

        System.out.println("Thanks for using our app.");

    }
}
