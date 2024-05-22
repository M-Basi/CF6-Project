package gr.aueb.cf.ch2;

public class OverflowApp {

    /**
     * Ελέγχει την υπερχείληση στην περίπτωση
     * που συμβεί
     */
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταλητών
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        // Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.printf("Το αποτέλεσμα είναι: %d", result);

    }
}
