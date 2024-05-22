package gr.aueb.cf.ch6.excercise6C;

import java.util.Scanner;


public class LowAndHighIndexApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int key = 0;

        int [] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        System.out.println("Please insert the seeking number: ");
        key = in.nextInt();
        int[] lowAndHighIndex = getLowAndHighIndexOf(arr, key);

        traverseArray(lowAndHighIndex);

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {

        int[] lowAndHighIndex = new int[2];
        int lowIndex = 0;
        int highIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lowIndex = i;
                break;
            }
        }
        lowAndHighIndex[0] = lowIndex;

        for (int i = lowIndex; i < arr.length; i++) {
            if (arr[i] == key) {
                highIndex = i;
            }
        }
        lowAndHighIndex[1] = highIndex;

        return lowAndHighIndex;
    }

    public static void traverseArray (int[] arr) {

        System.out.println("Your chosen numbers are: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
