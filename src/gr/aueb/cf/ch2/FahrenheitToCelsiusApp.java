package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη έναν ακεραιο που
 * συμβολίζει την θερμοκρασία σε Fahrenheit
 * και την μετατρέπει σε βαθμούς Celsius
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temp = 0;

        System.out.println("Παρακαλώ δώσε την παρούσα θερμοκρασία σε βαθμούς Fahrenheit: ");
        temp = scanner.nextInt();
        int result = (5 * (temp-32)) / 9;

        System.out.printf("Οι %02d βαθμοί Fahrenheit ισούνται περίπου με %02d βαθμούς Celsius\n", temp, result);

    }
}
