package gr.aueb.cf.ch5.excercise;

import java.util.Scanner;

public class MenuStars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menuChoice = 0;
        int starsChoice = 0;

        do {
            printMenu();

            menuChoice = scanner.nextInt();

            if (menuChoice==6) {
               System.out.println("Exit");
               break;
            }

            System.out.println("Δώστε αριθμό για αστεράκια: ");
            starsChoice = scanner.nextInt();

            switch (menuChoice){
                case 1:
                    lineStars(starsChoice);
                    break;
                case 2:
                    starsByOne(starsChoice);
                    break;
                case 3:
                    starsNLine(starsChoice);
                    break;
                case 4:
                    stars1toN(starsChoice);
                    break;
                case 5:
                    starsNto1(starsChoice);
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }


        }while (menuChoice != 6);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω (6 για έξοδο): ");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }
    public static void lineStars (int a) {
        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void starsByOne (int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("*");
        }
    }

    public static void starsNLine (int a) {
        for (int i = 1; i <= a; i++) {
            lineStars(a);
        }
    }

    public static void stars1toN (int a) {
        for (int i = 1; i <= a; i++) {
            lineStars(i);
        }
        System.out.println();
    }

    public static void starsNto1 (int a) {
        for (int i = a; i >= 1; i--) {
            lineStars(i);
        }
        System.out.println();
    }
}
