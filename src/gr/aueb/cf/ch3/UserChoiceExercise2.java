package gr.aueb.cf.ch3;
/**
 * Εμφανίζει επαναληπτικά ένα μενού με τις παρακάτω
 * επιλογές, το οποίο επαναλαμβάνει μέχρι ο χρήστης να
 * δώσει τον αριθμό 5. Για κάθε επιλογή από 1 – 4 εμφανίζεται
 * feedback, για παράδειγμα αν ο χρήστης
 * δώσει 1, θα εμφανίζεται το μήνυμα “Επιλέξατε Εισαγωγή».
 * ελέγχετε επίσης αν ο χρήστης δώσει αριθμό
 * < 0 ή > 5 και δίνει το κατάλληλο μήνυμα
 */

import java.util.Scanner;

public class UserChoiceExercise2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("Παρακαλώ επιλέξτε ως κάτωθι: \n" +
                    "1. Εισαγωγή\n" +
                    "2. Διαγραφή\n" +
                    "3. Ενημέρωση\n" +
                    "4. Αναζήτηση\n" +
                    "5. Έξοδος");
            choice = in.nextInt();
            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (choice == 2){
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (choice == 5) {
                System.out.println("Επιλέξατε Έξοδο. Τέλος διαδικασίας");
            } else {
                System.out.println("Λάθος αριθμός. Προσπαθήστε ξανά");
            }
        } while ( choice!=5);


    }
}
