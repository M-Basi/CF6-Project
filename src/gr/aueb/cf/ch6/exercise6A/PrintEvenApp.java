package gr.aueb.cf.ch6.exercise6A;

public class PrintEvenApp {

    public static void main(String[] args) {
        int[] arr = {13,2,7,4,9,3};

        printEvenNumbers(arr);
    }

    public static void printEvenNumbers (int[]arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("The list is empty");
        }else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }


    }

}
