package gr.aueb.cf.ch6;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 */

public class SelectionSort {

    public static void main(String[] args) {

        int [] arr = {9, 34, 5, 20, 12, 7, 2, 9 ,25};
        //selectionSort(arr)
//        selectionSort(arr);
        Arrays.sort(arr);    //έτοιμη μέθοδος της Java
        int a = arr[0];
        traverseArray(arr);
        System.out.println(" ");
        System.out.println(a);

    }

    /**
     * Sorting based on Selection Sort.
     * Time-complexity 0(n^2)
     * @param arr   the input array
     */
    public static void selectionSort(int [] arr) {
        if (arr == null) return;

        int min;
        int minPosition;

        for (int i = 0; i < arr.length -1; i++) {
            minPosition = i;
            min = arr[i];

            for (int j =i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }
            swap (arr, i, minPosition);
        }
    }

    public static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void traverseArray (int[] arr) {
        for (int element: arr) {
            System.out.print(element + " ");
        }
    }
}
