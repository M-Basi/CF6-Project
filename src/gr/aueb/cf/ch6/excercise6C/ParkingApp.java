package gr.aueb.cf.ch6.excercise6C;

import java.util.Arrays;
import java.util.Comparator;

public class ParkingApp {

    public static void main(String[] args) {

        int [][] arr= {{1012, 1136}, {1317, 1417},{1015, 1020}};
        int [][] parking = parking(arr);

//        traverseDoubleArray(parking);
//        System.out.println();

        int[][] arr1 = sorted(parking);
//        traverseDoubleArray(arr1);

        int maxCars = howManyCars(arr1);

        System.out.printf("The maximum number of cars in the parking was: %d", maxCars);
    }

    public static int[][] parking(int[][] arr) {
        int[][] newArr = new int[arr.length * 2][2];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[temp][0] = arr[i][j];
                if (j % 2 == 0) {
                    newArr[temp][1] = 1;
                }else {
                    newArr[temp][1] = 0;
                }
                temp++;
            }
        }
        return newArr;
    }

    public static void traverseDoubleArray (int[][] arr) {
        for (int[] row : arr) {
            for (int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sorted (int[][] arr) {
        int [] arr1 = new int[arr.length];
        int [][] sortedArr = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i][0];
        }
        Arrays.sort(arr1);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr1[i] == arr[j][0]) {
                    sortedArr[i][0] = arr1[i];
                    sortedArr[i][1] = arr[j][1];
                }
            }
        }
        return sortedArr;
    }

    public static int howManyCars (int[][] arr) {
        int temp = 0;
        int counter = 0;
        int [] newArr = new int[2];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i][1] == 1) counter++;
            if (temp < counter) temp = counter;
            if (arr[i][1] == 0) counter=0;

            }
            return temp;
        }




}
