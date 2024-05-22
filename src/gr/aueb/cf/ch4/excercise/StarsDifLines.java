package gr.aueb.cf.ch4.excercise;

import java.util.Scanner;

public class StarsDifLines {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert how many stars do you want in different lines: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }
    }
}