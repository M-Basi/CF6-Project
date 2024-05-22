package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει 3 ακέραίους από τον χρήστη και τους
 * μετατρέπει σε ημερομηνία με την μορφή
 * DD/MM/YY
 */
public class IntToDateApp {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int days = 0;
        int month = 0;
        int year = 0;

        //1oς τρόπος
        System.out.println("Please insert 3 numbers that represent a date. The " +
                "first number must be betwwen 0-31, the second one between 0-12 and the third one" +
                "between 0-99: ");

        days = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("The given date is %02d/%02d/%02d", days, month,year);

        /*2ος τρόπος
        System.out.println("You are going to give 3 numbers to represent a date.");
        System.out.println("Please insert the first number between 0-31 for days: ");
        days = in.nextInt();
        System.out.println("Please insert the second number between 1-12 for months: ");
        month = in.nextInt();
        System.out.println("Please insert the third number between 0-99 for year: ");
        year = in.nextInt();

        System.out.printf("The given date is %02d/%02d/%02d", days, month,year);*/







    }
}