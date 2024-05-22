package gr.aueb.cf.ch8.excercise;

import java.util.Scanner;

public class PrintChoiseWithException {

    public static void main(String[] args) {


        int choice;

        do {
            System.out.println("Please enter your choice");
            System.out.println("Choose 1 for add.");
            System.out.println("Choose 2 for sub.");
            System.out.println("Choose 3 for mul.");
            System.out.println("Choose 4 for div.");
            System.out.println("Choose 5 for exit.");
            choice = get_choice();
            try {
                printChoice(choice);
            }catch (IllegalArgumentException e) {
                System.out.println("The choice can not be < 0 or >5");
            }
        }while(choice != 5);
    }



    public static void printChoice (int choice) throws IllegalArgumentException {
        if (choice < 0 || choice>5) {
            throw new IllegalArgumentException();
        }
        System.out.println("Your choice is: " + choice);

    }

    public static int get_choice() {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) {
            System.err.println("Your choice is invalid");
            System.exit(1);
        }
        return in.nextInt();
    }



}
