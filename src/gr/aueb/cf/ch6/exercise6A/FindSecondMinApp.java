package gr.aueb.cf.ch6.exercise6A;

import java.util.Arrays;

public class FindSecondMinApp {
    public static void main(String[] args) {
        int[] arr = {13,2,7,4,9,3};

        int secMinPosition = 0;
        int secMinPosition2 = 0;
        secMinPosition = getSecMinPosition(arr);
        if (secMinPosition == -1) {
            System.out.printf("Error in searching...");
        }

        System.out.printf("Second Min value: %d. Second Min position: %d", arr[secMinPosition], secMinPosition + 1);
        System.out.println();
        secMinPosition2 = getSecMinPosition2(arr);
        System.out.printf("Second Min value: %d. Second Min position: %d", arr[secMinPosition], secMinPosition + 1);
    }


    public static int getSecMinPosition(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int minPosition = 0;
        int min = arr[minPosition];
        int secMinPosition = 0;
        int secMin = arr[secMinPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < secMin && arr[i] != min ) {
                secMin = arr[i];
                secMinPosition = i;
            }
        }

        return secMinPosition;
    }


    public static int getSecMinPosition2 (int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int secMinPosition = 0;
        int secMin = 0;
        int[] arr2 = new int[arr.length];
        for (int i=0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);
        secMin = arr2[1];

        for (int i=0; i < arr.length; i++) {
            if (arr[i] == secMin);
            secMinPosition = i;
        }
        return secMinPosition;
    }
}
