package gr.aueb.cf.ch5;

/**
 * Demonstrates overloading (υπερφόρτωση)
 * Υπερφόρτωση = ίδιο όνομα μεθόδου,
 * διαφορετικές παράμετροι
 * Method Signature = όνομα της μεθόδου και οι τυπικές παράμετροι
 */

public class OverloadingApp2 {

    public static void main(String[] args) {
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        sum2 = add(1,2);
        sum3 = add(1,2,3);
        sum4 = add(1,2,3,4);

    }

    /**
     * Adds two integers.
     *
     * @param a The first int.
     * @param b The second int.
     * @return the sum of two integers
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds three integers.
     *
     * @param a The first int.
     * @param b The second int.
     * @param c The third int.
     * @return the sum of three integers
     */
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Adds four integers.
     *
     * @param a The first int.
     * @param b The second int.
     * @param c The third int.
     * @param c The fourth int.
     * @return the sum of the input integers
     */
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

