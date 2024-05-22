package gr.aueb.cf.ch6.exercise6A;

public class DoubleMappingApp {

    public static void main(String[] args) {
        int[] arr = {13,2,7,4,9,3};

        int [] doubleArray = mapDouble(arr);
        traverseArray(doubleArray);
    }

    public static int[] mapDouble (int[] array) {
        int[] arrayToReturn = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayToReturn[i] = array[i] * 2;
        }
        return arrayToReturn;
    }

    public static void traverseArray (int[] arr) {
        for (int element: arr) {
            System.out.print(element + " ");
        }
    }
}
