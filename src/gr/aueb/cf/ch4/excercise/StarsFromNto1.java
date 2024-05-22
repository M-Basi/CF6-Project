package gr.aueb.cf.ch4.excercise;

import java.util.Scanner;

public class StarsFromNto1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert how many stars do you want from N to 1 in different lines: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
