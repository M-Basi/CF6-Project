package gr.aueb.cf.ch2;

public class DiceApp {

    public static void main(String[] args) {

        // random between 1-6 --> (Math.random () * (max-min+1)) + min
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("(%d, %d)", die1, die2);
    }
}
