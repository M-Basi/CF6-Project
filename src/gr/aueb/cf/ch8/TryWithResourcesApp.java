package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) {
        int num = 0;
        Scanner in = new Scanner(System.in);   //πρέπει να ειναι  final dld final Scanner in = new Scanner(System.in)
                                                // ή να μην αλλαζει μέσα στο try

        try (in){
            System.out.println("Insert a num: ");
            num = in.nextInt();
        }catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
