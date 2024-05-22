package gr.aueb.cf.ch6.excercise6B;

import java.util.Scanner;

public class PredicatesApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        System.out.println("Please insert how many numbers do you want to check: ");
        choice = in.nextInt();
        int [] arr = new int[choice];
        arr = createArray(choice);

        traverseArray(arr);

        System.out.println("The chosen array has no more than 3 even numbers : " + hasLT3Evens(arr));
        System.out.println("The chosen array has no more than 3 odd numbers : " + hasLT3Odds(arr));
        System.out.println("The chosen array has no more than 3 consecutive numbers : " + hasLT3Consecutive(arr));
        System.out.println("The chosen array has no more than 3 numbers with the same ending : " + hasLT3SameEndings(arr));
        System.out.println("The chosen array has no more than 3 numbers at the same dec : " + hasLT3InSameDec(arr));
    }

    public static int[] createArray (int choice) {

        int[] arr = new int[choice];
        System.out.printf("Please enter %d numbers: \n", choice);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void traverseArray (int[] arr) {

        System.out.println("Your chosen numbers are: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static boolean hasLT3Evens(int[] arr) {
        boolean hasLT3Evens = false;
        int evens = 0;
        if(arr == null || arr.length==0) {
            System.out.println("Empty List");
            return false;
        }
        for (int item:arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens <3;
    }
    public static boolean hasLT3Odds(int[] arr) {
        boolean hasLT3Odds = false;
        int odds = 0;
        if(arr == null || arr.length==0) {
            System.out.println("Empty List");
            return false;
        }
        for (int item:arr) {
            if (item % 2 != 0) {
                odds++;
            }
        }
        return odds <= 3;
    }


    public static boolean hasLT3Consecutive(int[] arr) {
        boolean hasLT3Consecutive = false;
        int consecutive = 0;
        if(arr == null || arr.length==0) {
            System.out.println("Empty List");
            return false;
        }
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2 ) {
                consecutive ++;
            }
        }
        hasLT3Consecutive = consecutive < 1;
        return hasLT3Consecutive;
    }

    public static boolean hasLT3SameEndings (int[] arr) {
        if(arr == null || arr.length==0) {
            System.out.println("Empty List");
            return false;
        }

        boolean hasLT3SameEndings = true;
        int [] sameEndings = new int[10];
        for (int item:arr) {
            sameEndings[item%10]++;
        }

        for (int item: sameEndings) {
            if (item>=3) {
                hasLT3SameEndings = false;
                break;
            }
        }
        return hasLT3SameEndings;
    }

    public static boolean hasLT3InSameDec (int[] arr) {
        if(arr == null || arr.length==0) {
            System.out.println("Empty List");
            return false;
        }

        boolean hasLT3InSameDec = true;
        int [] sameDec = new int[10];
        for (int item:arr) {
            sameDec[item/10]++;
        }

        for (int item: sameDec) {
            if (item>=3) {
                hasLT3InSameDec = false;
                break;
            }
        }
        return hasLT3InSameDec;
    }

}
