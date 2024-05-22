package gr.aueb.cf.ch4.excercise;

import java.util.Scanner;

public class StarsFrom1ToN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert how many stars do you want from 1 to N in lines: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j =1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
