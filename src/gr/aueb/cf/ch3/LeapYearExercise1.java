package gr.aueb.cf.ch3;
/**
 * αποφαίνεται αν
 * ένα έτος είναι δίσεκτο ή όχι
 * • Δηλαδή να προτρέπει τον χρήστη να
 * δώσει ένα έτος από το πληκτρολόγιο,
 * να διαβάζει με Scanner το έτος
 * (ακέραιος), να κάνει την επεξεργασία
 * και να εμφανίζει στην οθόνη αν το έτος
 * αυτό είναι δίσεκτο ή όχι.
 */

import java.util.Scanner;

public class LeapYearExercise1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean isLeapYear = false;
        int year = 0;


        System.out.println("Please insert a year (4 digits): ");

        year = in.nextInt();
        isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);


        System.out.printf("The year %d is LeapYear : %s\n", year, isLeapYear);

//        if (isLeapYear) {
//            System.out.printf("The year %d is LeapYear\n", year);
//        }
//        else {
//            System.out.printf("The year %d is not LeapYear\n", year);
//        }
    }
}
