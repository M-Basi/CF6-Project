package gr.aueb.cf.ch6.exercise6A;

import java.util.Scanner;

public class SearchElementPositionApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] array = {2,5,7,4,3,9};
        int choice = 0;
        int position;
        System.out.println("Enter your choice: " );
        choice = scanner.nextInt();
        position = findElement(array, choice);
        if (position == -1) {
            System.out.printf("Choice %d NOT FOUND", choice);
        }else {
            System.out.printf("Choice %d is at position: %d", choice, position + 1);
        }

    }

    public static int findElement (int[] array, int choice) {
        int posiiton = 0;
        for(int i = 0; i < array.length; i++) {
            if (choice != array[i]) {
                posiiton = -1;
            }else {
                posiiton = i;
                break;
            }
        }
        return posiiton;
    }
}
