package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Χρησιμοποιεί την BigInteger ώστε να μην
 * έχουμε υπερχείλιση (overflow)
 */
public class BigIntegerApp {

    public static void main(String[] args) {
        BigInteger myBigNum1 = new BigInteger("123456789123456789888888888856576446546");
        BigInteger myBigNum2 = new BigInteger("12345678987654");

        BigInteger result = myBigNum1.add(myBigNum2);

        System.out.println("The result is: " + result);
        System.out.printf("The result is: %,d", result);
    }
}
